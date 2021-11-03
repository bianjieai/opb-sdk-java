package irita.sdk.model.block;

import irita.sdk.model.RpcBase;

public class ResultBlockRpc extends RpcBase {
    private ResultBlock result;

    public ResultBlock getResult() {
        return result;
    }

    public void setResult(ResultBlock result) {
        this.result = result;
    }
}
