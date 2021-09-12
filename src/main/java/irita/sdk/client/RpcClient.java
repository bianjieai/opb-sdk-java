package irita.sdk.client;

import com.alibaba.fastjson.JSON;
import irita.sdk.config.ClientConfig;
import irita.sdk.config.OpbConfig;
import irita.sdk.constant.TxStatus;
import irita.sdk.constant.enums.BroadcastMode;
import irita.sdk.exception.IritaSDKException;
import irita.sdk.model.JsonRpc;
import irita.sdk.model.ResultTx;
import irita.sdk.util.HttpUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;

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

    private synchronized ResultTx checkResTxAndConvert(String res) {
        ResultTx resultTx = JSON.parseObject(res, ResultTx.class);

        if (resultTx.getCode() != TxStatus.SUCCESS) {
            throw new IritaSDKException(resultTx.getLog());
        }
        return resultTx;
    }
}
