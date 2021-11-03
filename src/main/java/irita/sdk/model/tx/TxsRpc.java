package irita.sdk.model.tx;

import irita.sdk.model.RpcBase;

public class TxsRpc extends RpcBase {
    private TxsResult result;

    public TxsResult getResult() {
        return result;
    }

    public void setResult(TxsResult result) {
        this.result = result;
    }
}
