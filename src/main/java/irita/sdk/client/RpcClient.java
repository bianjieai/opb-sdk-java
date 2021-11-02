package irita.sdk.client;

import com.alibaba.fastjson.JSON;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageV3;
import irita.sdk.config.ClientConfig;
import irita.sdk.config.OpbConfig;
import irita.sdk.constant.TxStatus;
import irita.sdk.constant.enums.BroadcastMode;
import irita.sdk.constant.enums.MsgEnum;
import irita.sdk.exception.IritaSDKException;
import irita.sdk.model.*;
import irita.sdk.model.block.BlockDetail;
import irita.sdk.model.block.BlockDetailRpc;
import irita.sdk.model.block.BlockResult;
import irita.sdk.model.block.BlockResultRpc;
import irita.sdk.model.tx.Body;
import irita.sdk.model.tx.TxRpc;
import irita.sdk.util.HttpUtils;
import org.apache.commons.lang3.StringUtils;
import org.bouncycastle.util.encoders.Hex;
import proto.cosmos.tx.v1beta1.TxOuterClass;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class RpcClient {
    private final String rpcUri;
    private final HttpUtils httpUtils;

    public RpcClient(String rpcUri) {
        this.rpcUri = rpcUri;
        this.httpUtils = new HttpUtils();
    }

    public RpcClient(ClientConfig clientConfig, OpbConfig opbConfig) {
        this.rpcUri = clientConfig.getRpcUri();

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
        String str = httpUtils.post(rpcUri, JSON.toJSONString(jsonRpc));
        return checkResTxAndConvert(str);
    }

    public synchronized ResultTx broadcastTxAsync(byte[] txBytes) throws IOException {
        JsonRpc jsonRpc = JsonRpc.WrapTxBytes(txBytes, "broadcast_tx_async");
        String str = httpUtils.post(rpcUri, JSON.toJSONString(jsonRpc));
        return JSON.parseObject(str, ResultTx.class);
    }


    public synchronized ResultTx broadcastTxSync(byte[] txBytes) throws IOException {
        JsonRpc jsonRpc = JsonRpc.WrapTxBytes(txBytes, "broadcast_tx_sync");
        String str = httpUtils.post(rpcUri, JSON.toJSONString(jsonRpc));
        return JSON.parseObject(str, ResultTx.class);
    }

    public synchronized GasInfo simulateTx(byte[] txBytes) throws IOException {
        JsonRpc jsonRpc = JsonRpc.WrapAbciQuery(txBytes, "app/simulate");
        String str = httpUtils.post(rpcUri, JSON.toJSONString(jsonRpc));
        JsonRpcQueryResponse resp = JSON.parseObject(str, JsonRpcQueryResponse.class);
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

        GasInfoWrap gasInfoWrap = JSON.parseObject(value, GasInfoWrap.class);
        return gasInfoWrap.getGasInfo();
    }

    private synchronized ResultTx checkResTxAndConvert(String res) {
        ResultTx resultTx = JSON.parseObject(res, ResultTx.class);

        if (resultTx.getCode() != TxStatus.SUCCESS) {
            throw new IritaSDKException(String.format("log: %s\nhash: %s", resultTx.getLog(), Optional.of(resultTx).map(ResultTx::getResult).map(Result::getHash).orElse("")));
        }
        return resultTx;
    }

    public ResultQueryTx queryTx(String hash) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Map params = new HashMap();
        params.put("prove", true);
        params.put("hash", Base64.getEncoder().encodeToString(Hex.decode(hash)));
        JsonRpc jsonRpc = JsonRpc.WrapBaseQuery(params, "tx");
        String str = httpUtils.post(rpcUri, JSON.toJSONString(jsonRpc));
        TxRpc txRpc = JSON.parseObject(str, TxRpc.class);
        Objects.requireNonNull(txRpc, "use json deserialize json_rpc_response return null");
        if (txRpc.getError() != null) {
            throw new IritaSDKException(txRpc.getError().getData());
        }
        TxOuterClass.Tx tx = TxOuterClass.Tx.parseFrom(Base64.getDecoder().decode(txRpc.getResult().getTx()));
        List<GeneratedMessageV3> messageList = new ArrayList();
        for (Any any : tx.getBody().getMessagesList()) {
            messageList.add(unpackMsg(any.getTypeUrl(), any.getValue()));
        }

        BlockDetail blockDetail = queryBlock(txRpc.getResult().getHeight());

        for (int i = 0; i < txRpc.getResult().getTxResult().getEvents().size(); i++) {
            for (int j = 0; j < txRpc.getResult().getTxResult().getEvents().get(i).getAttributes().size(); j++) {
                txRpc.getResult().getTxResult().getEvents().get(i).getAttributes().get(j).setKey(
                        new String(Base64.getDecoder().decode(txRpc.getResult().getTxResult().getEvents().get(i).getAttributes().get(j).getKey())));
                txRpc.getResult().getTxResult().getEvents().get(i).getAttributes().get(j).setValue(
                        new String(Base64.getDecoder().decode(txRpc.getResult().getTxResult().getEvents().get(i).getAttributes().get(j).getValue())));
            }
        }
        ResultQueryTx resultQueryTx = new ResultQueryTx();
        resultQueryTx.setHash(txRpc.getResult().getHash());
        resultQueryTx.setHeight(txRpc.getResult().getHeight());
        resultQueryTx.setResult(txRpc.getResult().getTxResult());
        resultQueryTx.setTimeStamp(blockDetail.getBlock().getHeader().getTime());

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

    public GeneratedMessageV3 unpackMsg(String typeUrl, ByteString value) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if (StringUtils.isEmpty(typeUrl) || value.isEmpty()) {
            throw new IritaSDKException("message can not be empty");
        }
        typeUrl = typeUrl.replace("/", "");
        String protoClassName = MsgEnum.getClassName(typeUrl);
        if (StringUtils.isEmpty(protoClassName)) {
            throw new IritaSDKException("not exist tx type");
        }
        Class clazz = Class.forName(protoClassName);
        Method method = clazz.getMethod("parseFrom", ByteString.class);
        return (GeneratedMessageV3) method.invoke(clazz, value);
    }

    public BlockDetail queryBlock(String height) throws IOException {
        Map<String, String> params = new HashMap();
        params.put("height", height);

        JsonRpc jsonRpc = JsonRpc.WrapBaseQuery(params, "block");
        String str = httpUtils.post(rpcUri, JSON.toJSONString(jsonRpc));
        BlockDetailRpc blockDetailRpc = JSON.parseObject(str, BlockDetailRpc.class);
        Objects.requireNonNull(blockDetailRpc, "use json deserialize json_rpc_response return null");
        if (blockDetailRpc.getError() != null) {
            throw new IritaSDKException(blockDetailRpc.getError().getData());
        }

        return blockDetailRpc.getResult();
    }

    public BlockResult queryBlockResult(String height) throws IOException {
        Map<String, String> params = new HashMap();
        params.put("height", height);
        JsonRpc jsonRpc = JsonRpc.WrapBaseQuery(params, "block_results");
        String str = httpUtils.post(rpcUri, JSON.toJSONString(jsonRpc));
        BlockResultRpc blockResultRpc = JSON.parseObject(str, BlockResultRpc.class);
        Objects.requireNonNull(blockResultRpc, "use json deserialize json_rpc_response return null");
        if (blockResultRpc.getError() != null) {
            throw new IritaSDKException(blockResultRpc.getError().getData());
        }
        return blockResultRpc.getResult();
    }
}
