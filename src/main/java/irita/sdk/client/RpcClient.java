package irita.sdk.client;

import com.alibaba.fastjson.JSON;
import irita.sdk.config.ClientConfig;
import irita.sdk.config.OpbConfig;
import irita.sdk.constant.TxStatus;
import irita.sdk.constant.enums.BroadcastMode;
import irita.sdk.exception.IritaSDKException;
import irita.sdk.model.*;
import irita.sdk.model.block.BlockDetail;
import irita.sdk.model.block.BlockDetailRpc;
import irita.sdk.model.block.BlockResult;
import irita.sdk.model.block.BlockResultRpc;
import irita.sdk.model.tx.TxRpc;
import irita.sdk.util.HttpUtils;
import org.apache.commons.lang3.StringUtils;
import org.bouncycastle.util.encoders.Hex;

import java.io.IOException;
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

    public Object queryTx(String hash) throws IOException {
        Base64.Encoder encoder = Base64.getEncoder();
        String encode = encoder.encodeToString(Hex.decode(hash));
        Map params = new HashMap();
        params.put("prove", true);
        params.put("hash", encode);
        JsonRpc jsonRpc = JsonRpc.WrapBaseQuery(params, "tx");
        String str = httpUtils.post(rpcUri, JSON.toJSONString(jsonRpc));
        TxRpc txRpc = JSON.parseObject(str, TxRpc.class);
        BlockDetail blockDetail = queryBlock(txRpc.getResult().getHeight());

        return null;
    }

    public BlockDetail queryBlock(String height) throws IOException {
        Map<String, String> params = new HashMap();
        params.put("height", height);

        JsonRpc jsonRpc = JsonRpc.WrapBaseQuery(params, "block");
        String str = httpUtils.post(rpcUri, JSON.toJSONString(jsonRpc));
        BlockDetailRpc blockDetailRpc = JSON.parseObject(str, BlockDetailRpc.class);

//        jsonRpc = JsonRpc.WrapBaseQuery(params, "block_results");
//        str = httpUtils.post(rpcUri, JSON.toJSONString(jsonRpc));
//        BlockResultRpc blockResultRpc = JSON.parseObject(str, BlockResultRpc.class);
//        blockDetailRpc.getResult().setBlockResult(blockResultRpc.getResult());
        return blockDetailRpc.getResult();
    }

    public BlockResult queryBlockResult(String height) throws IOException {
        Map<String, String> params = new HashMap();
        params.put("height", height);
        JsonRpc jsonRpc = JsonRpc.WrapBaseQuery(params, "block_results");
        String str = httpUtils.post(rpcUri, JSON.toJSONString(jsonRpc));
        BlockResultRpc blockResultRpc = JSON.parseObject(str, BlockResultRpc.class);
        return blockResultRpc.getResult();
    }
}
