package irita.sdk.client;

import com.google.protobuf.Any;
import com.google.protobuf.GeneratedMessageV3;
import irita.sdk.config.ClientConfig;
import irita.sdk.config.OpbConfig;
import irita.sdk.constant.EventType;
import irita.sdk.constant.TmTypes;
import irita.sdk.constant.TxStatus;
import irita.sdk.constant.enums.BroadcastMode;
import irita.sdk.exception.IritaSDKException;
import irita.sdk.exception.UnknownMsgException;
import irita.sdk.function.EventHandler;
import irita.sdk.model.Result;
import irita.sdk.model.*;
import irita.sdk.model.block.BlockResult;
import irita.sdk.model.block.ResultBlock;
import irita.sdk.model.block.ResultBlockResults;
import irita.sdk.model.block.ResultBlockRpc;
import irita.sdk.model.tx.*;
import irita.sdk.model.ws.block.NewBlockBean;
import irita.sdk.model.ws.tx.TxBean;
import irita.sdk.util.*;
import org.apache.commons.lang3.StringUtils;
import org.bouncycastle.util.encoders.Hex;
import proto.cosmos.tx.v1beta1.TxOuterClass;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class RpcClient implements WsEvent {
    private final String rpcUri;
    private String wsAddr;
    private final HttpUtils httpUtils;

    /**
     * @deprecated Use {@link #RpcClient(ClientConfig, OpbConfig)} instead. will remove at later versions
     */
    @Deprecated
    public RpcClient(String rpcUri) {
        this.rpcUri = rpcUri;
        this.httpUtils = new HttpUtils();
    }

    public RpcClient(ClientConfig clientConfig, OpbConfig opbConfig) {
        this.rpcUri = clientConfig.getRpcUri();
        this.wsAddr = clientConfig.getWsAddr();

        // need set projectKey
        if (opbConfig != null && StringUtils.isNotEmpty(opbConfig.getProjectKey())) {
            this.httpUtils = new HttpUtils(opbConfig.getProjectKey());
        } else {
            this.httpUtils = new HttpUtils();
        }
    }

    public synchronized ResultTx broadcastTx(byte[] txBytes, BroadcastMode mode) throws IOException {
        if (mode == null) {
            throw new IritaSDKException("unknown broadcastMode");
        }
        switch (mode) {
            case Sync:
                return broadcastTxSync(txBytes);
            case Async:
                return broadcastTxAsync(txBytes);
            case Commit:
                return broadcastTxCommit(txBytes);
            default:
                throw new IritaSDKException("unknown broadcastMode");
        }
    }

    public synchronized ResultTx broadcastTxCommit(byte[] txBytes) throws IOException {
        JsonRpc jsonRpc = JsonRpc.WrapTxBytes(txBytes, "broadcast_tx_commit");
        String str = httpUtils.post(rpcUri, JsonUtils.writeValueAsString(jsonRpc));
        return checkCommitResultTx(str);
    }

    public synchronized ResultTx broadcastTxAsync(byte[] txBytes) throws IOException {
        JsonRpc jsonRpc = JsonRpc.WrapTxBytes(txBytes, "broadcast_tx_async");
        String str = httpUtils.post(rpcUri, JsonUtils.writeValueAsString(jsonRpc));
        return JsonUtils.readValue(str, ResultTx.class);
    }


    public synchronized ResultTx broadcastTxSync(byte[] txBytes) throws IOException {
        JsonRpc jsonRpc = JsonRpc.WrapTxBytes(txBytes, "broadcast_tx_sync");
        String str = httpUtils.post(rpcUri, JsonUtils.writeValueAsString(jsonRpc));
        return checkSyncResultTx(str);
    }

    public synchronized GasInfo simulateTx(byte[] txBytes) throws IOException {
        JsonRpc jsonRpc = JsonRpc.WrapAbciQuery(txBytes, "app/simulate");
        String str = httpUtils.post(rpcUri, JsonUtils.writeValueAsString(jsonRpc));
        JsonRpcQueryResponse resp = JsonUtils.readValue(str, JsonRpcQueryResponse.class);
        Objects.requireNonNull(resp, "use json deserialize json_rpc_response return null");

        String value = Optional.of(resp)
                .map(JsonRpcQueryResponse::getResult)
                .map(ResultABCIQuery::getResponse)
                .map(ResponseQuery::getValue)
                .map(x -> new String(Base64.getDecoder().decode(x)))
                .orElse("");
        if (StringUtils.isEmpty(value)) {
            throw new IritaSDKException(resp.getResult().getResponse().getLog());
        }

        GasInfoWrap gasInfoWrap = JsonUtils.readValue(value, GasInfoWrap.class);
        return gasInfoWrap.getGasInfo();
    }

    private ResultTx checkCommitResultTx(String res) throws IOException {
        ResultTx resultTx = JsonUtils.readValue(res, ResultTx.class);

        if (resultTx.getError() != null) {
            throw new IritaSDKException(resultTx.getError().getData());
        }

        Check_tx checkTx = resultTx.getResult().getCheck_tx();
        if (checkTx.getCode() != TxStatus.SUCCESS) {
            throw new IritaSDKException(String.format("log: %s\nhash: %s", checkTx.getLog(), Optional.of(resultTx).map(ResultTx::getResult).map(Result::getHash).orElse("")));
        }

        Deliver_tx deliverTx = resultTx.getResult().getDeliver_tx();
        if (deliverTx.getCode() != TxStatus.SUCCESS) {
            throw new IritaSDKException(String.format("log: %s\nhash: %s", deliverTx.getLog(), Optional.of(resultTx).map(ResultTx::getResult).map(Result::getHash).orElse("")));
        }
        return resultTx;
    }

    private ResultTx checkSyncResultTx(String str) throws IOException {
        ResultTx resultTx = JsonUtils.readValue(str, ResultTx.class);
        if (resultTx.getError() != null) {
            throw new IritaSDKException(resultTx.getError().getData());
        }

        if (resultTx.getResult() != null && resultTx.getResult().getCode() != TxStatus.SUCCESS) {
            throw new IritaSDKException(String.format("log: %s\nhash: %s", resultTx.getResult().getLog(), Optional.of(resultTx).map(ResultTx::getResult).map(Result::getHash).orElse("")));
        }
        return resultTx;
    }

    public ResultQueryTx queryTx(String hash) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Map<String, Object> params = new HashMap<>();
        params.put("prove", true);
        params.put("hash", Base64.getEncoder().encodeToString(Hex.decode(hash)));
        JsonRpc jsonRpc = JsonRpc.WrapBaseQuery(params, "tx");
        String str = httpUtils.post(rpcUri, JsonUtils.writeValueAsString(jsonRpc));
        TxRpc txRpc = JsonUtils.readValue(str, TxRpc.class);
        Objects.requireNonNull(txRpc, "use json deserialize json_rpc_response return null");
        if (txRpc.getError() != null) {
            throw new IritaSDKException(txRpc.getError().getData());
        }
        return parseResultQueryTx(txRpc.getResult());
    }

    public ResultQueryTx parseResultQueryTx(irita.sdk.model.tx.Result result) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (result == null) {
            throw new IritaSDKException("parse ResultQueryTx failed: result can not be null");
        }
        TxOuterClass.Tx tx = TxOuterClass.Tx.parseFrom(Base64.getDecoder().decode(result.getTx()));
        List<GeneratedMessageV3> messageList = new ArrayList<>();
        for (Any any : tx.getBody().getMessagesList()) {
            messageList.add(MsgParser.unpackMsg(any.getTypeUrl(), any.getValue()));
        }

        ResultBlock resultBlock = queryBlock(result.getHeight());

        for (int i = 0; i < result.getTxResult().getEvents().size(); i++) {
            for (int j = 0; j < result.getTxResult().getEvents().get(i).getAttributes().size(); j++) {
                result.getTxResult().getEvents().get(i).getAttributes().get(j).setKey(
                        new String(Base64.getDecoder().decode(result.getTxResult().getEvents().get(i).getAttributes().get(j).getKey())));
                if (StringUtils.isNotEmpty(result.getTxResult().getEvents().get(i).getAttributes().get(j).getValue())) {
                    result.getTxResult().getEvents().get(i).getAttributes().get(j).setValue(
                            new String(Base64.getDecoder().decode(result.getTxResult().getEvents().get(i).getAttributes().get(j).getValue())));
                }
            }
        }
        ResultQueryTx resultQueryTx = new ResultQueryTx();
        resultQueryTx.setHash(result.getHash());
        resultQueryTx.setHeight(result.getHeight());
        resultQueryTx.setResult(result.getTxResult());
        resultQueryTx.setTimeStamp(resultBlock.getBlock().getHeader().getTime());

        Body body = new Body();
        body.setMemo(tx.getBody().getMemo());
        body.setTimeOutHeight(tx.getBody().getTimeoutHeight());
        body.setMsgs(messageList);
        irita.sdk.model.tx.Tx t = new irita.sdk.model.tx.Tx();
        t.setBody(body);
        t.setAuthInfo(tx.getAuthInfo());
        resultQueryTx.setTx(t);
        return resultQueryTx;
    }

    public ResultSearchTxs queryTxs(EventQueryBuilder builder, int page, int size) throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String query = builder.build();
        if (StringUtils.isEmpty(query)) {
            throw new IritaSDKException("must declare at least one tag to search");
        }
        Map<String, Object> params = new HashMap<>();
        params.put("query", query);
        params.put("prove", true);
        params.put("order_by", "asc");
        if (page > 0) {
            params.put("page", String.valueOf(page));
        }
        if (size > 0) {
            params.put("per_page", String.valueOf(size));
        }
        JsonRpc jsonRpc = JsonRpc.WrapBaseQuery(params, "tx_search");
        String str = httpUtils.post(rpcUri, JsonUtils.writeValueAsString(jsonRpc));
        TxsRpc txsRpc = JsonUtils.readValue(str, TxsRpc.class);
        Objects.requireNonNull(txsRpc, "use json deserialize json_rpc_response return null");
        if (txsRpc.getError() != null) {
            throw new IritaSDKException(txsRpc.getError().getData());
        }

        ResultSearchTxs resultSearchTxs = new ResultSearchTxs();
        resultSearchTxs.setTotal(txsRpc.getResult().getTotalCount());
        if (txsRpc.getResult().getTxs().size() > 0) {
            List<ResultQueryTx> list = new ArrayList<>(txsRpc.getResult().getTxs().size());
            for (irita.sdk.model.tx.Result result : txsRpc.getResult().getTxs()) {
                list.add(parseResultQueryTx(result));
            }
            resultSearchTxs.setTxs(list);
        }
        return resultSearchTxs;
    }

    public ResultBlock queryBlock(String height) throws IOException {
        Map<String, Object> params = new HashMap<>();
        params.put("height", height);

        JsonRpc jsonRpc = JsonRpc.WrapBaseQuery(params, "block");
        String str = httpUtils.post(rpcUri, JsonUtils.writeValueAsString(jsonRpc));
        ResultBlockRpc resultBlock = JsonUtils.readValue(str, ResultBlockRpc.class);
        Objects.requireNonNull(resultBlock, "use json deserialize json_rpc_response return null");
        if (resultBlock.getError() != null) {
            throw new IritaSDKException(resultBlock.getError().getData());
        }
        List<StdTx> stdTxList = new ArrayList<>();
        StdTx stdTx;
        List<GeneratedMessageV3> messageList;
        if (resultBlock.getResult().getBlock().getData().getTxs() != null && resultBlock.getResult().getBlock().getData().getTxs().size() > 0) {
            for (Object o : resultBlock.getResult().getBlock().getData().getTxs()) {
                stdTx = new StdTx();
                TxOuterClass.Tx tx = TxOuterClass.Tx.parseFrom(Base64.getDecoder().decode((String) o));
                messageList = new ArrayList<>();
                for (Any any : tx.getBody().getMessagesList()) {
                    try {
                        messageList.add(MsgParser.unpackMsg(any.getTypeUrl(), any.getValue()));
                    } catch (UnknownMsgException ignored){}
                }
                stdTx.setMsgs(messageList);
                stdTx.setMemo(tx.getBody().getMemo());
                stdTx.setFee(tx.getAuthInfo().getFee());
                stdTx.setTxHash(Hex.toHexString(HashUtils.sha256(Base64.getDecoder().decode((String) o))));
                stdTxList.add(stdTx);
            }
        }
        resultBlock.getResult().getBlock().getData().setTxs(stdTxList);
        return resultBlock.getResult();
    }

    public BlockResult queryBlockResult(String height) throws IOException {
        Map<String, Object> params = new HashMap<>();
        params.put("height", height);
        JsonRpc jsonRpc = JsonRpc.WrapBaseQuery(params, "block_results");
        String str = httpUtils.post(rpcUri, JsonUtils.writeValueAsString(jsonRpc));
        ResultBlockResults resultBlockResults = JsonUtils.readValue(str, ResultBlockResults.class);
        Objects.requireNonNull(resultBlockResults, "use json deserialize json_rpc_response return null");
        if (resultBlockResults.getError() != null) {
            throw new IritaSDKException(resultBlockResults.getError().getData());
        }
        if (resultBlockResults.getResult().getTxsResults() != null && resultBlockResults.getResult().getTxsResults().size() > 0) {
            BlockResult result = resultBlockResults.getResult();
            for (int n = 0; n < result.getTxsResults().size(); n++) {
                // TODO refactor this
                if (result.getTxsResults().get(n).getEvents().size() > 0) {
                    for (int i = 0; i < result.getTxsResults().get(n).getEvents().size(); i++) {
                        for (int j = 0; j < result.getTxsResults().get(n).getEvents().get(i).getAttributes().size(); j++) {
                            result.getTxsResults().get(n).getEvents().get(i).getAttributes().get(j).setKey(
                                    new String(Base64.getDecoder().decode(result.getTxsResults().get(n).getEvents().get(i).getAttributes().get(j).getKey())));
                            result.getTxsResults().get(n).getEvents().get(i).getAttributes().get(j).setValue(
                                    new String(Base64.getDecoder().decode(result.getTxsResults().get(n).getEvents().get(i).getAttributes().get(j).getValue())));
                        }
                    }
                }
            }
        }
        return resultBlockResults.getResult();
    }

    @Override
    public void subscribeNewBlock(EventQueryBuilder builder, EventHandler<NewBlockBean> blockHandler) {
        builder = Optional.ofNullable(builder).orElse(new EventQueryBuilder());
        builder.AddCondition(new Condition(EventType.TM_EVENT).eq(TmTypes.EVENT_NEW_BLOCK)).build();
        String query = builder.build();
        HashMap<String, Object> map = new HashMap<>();
        map.put("query", query);
        String sendMessage = JsonRpc.WrapBaseQuery(map, "subscribe").toJsonStr();

        try {
            WsClient wsClient = new WsClient(new URI(wsAddr), sendMessage) {
                @Override
                public void onMessage(String s) {
                    if (s.length() > 100) {
                        try {
                            NewBlockBean block = ListenChainUtil.convertNewBlockBean(s);
                            blockHandler.accept(block);
                        } catch (IOException e) {
                            throw new IritaSDKException("websocket io failed:" + e.getMessage());
                        }
                    }
                }
            };

            wsClient.connect();
            reConnectThread(wsClient);
        } catch (Exception e) {
            throw new IritaSDKException("connect websocket failed: " + e.getMessage());
        }
    }

    @Override
    public void subscribeTx(EventQueryBuilder builder, EventHandler<TxBean> txHandler) {
        builder = Optional.ofNullable(builder).orElse(new EventQueryBuilder());
        builder.AddCondition(new Condition(EventType.TM_EVENT).eq(TmTypes.EVENT_TX)).build();
        String query = builder.build();
        HashMap<String, Object> map = new HashMap<>();
        map.put("query", query);
        String sendMessage = JsonRpc.WrapBaseQuery(map, "subscribe").toJsonStr();

        try {
            WsClient wsClient = new WsClient(new URI(wsAddr), sendMessage) {
                @Override
                public void onMessage(String s) {
                    if (s.length() > 100) {
                        try {
                            TxBean tx = ListenChainUtil.convertTxBean(s);
                            txHandler.accept(tx);
                        } catch (IOException e) {
                            throw new IritaSDKException("websocket io failed:" + e.getMessage());
                        }
                    }
                }
            };

            wsClient.connect();
            reConnectThread(wsClient);
        } catch (Exception e) {
            throw new IritaSDKException("connect websocket failed: " + e.getMessage());
        }
    }

    private void reConnectThread(WsClient wsClient) {
        new Thread(() -> {
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(120);
                    wsClient.reconnect();
                    LogUtils.info("websocket reconnect");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
