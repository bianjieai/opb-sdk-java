package irita.sdk.model.block;

import irita.sdk.model.RpcBase;

public class BlockDetailRpc extends RpcBase {
    private BlockDetail result;

    public BlockDetail getResult() {
        return result;
    }

    public void setResult(BlockDetail result) {
        this.result = result;
    }
}
