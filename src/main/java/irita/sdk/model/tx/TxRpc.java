package irita.sdk.model.tx;

import irita.sdk.model.RpcBase;

public class TxRpc extends RpcBase {
    private Result result;

    public void setResult(Result result) {
        this.result = result;
    }

    public Result getResult() {
        return result;
    }
}