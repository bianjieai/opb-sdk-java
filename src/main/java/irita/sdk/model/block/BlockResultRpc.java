package irita.sdk.model.block;

public class BlockResultRpc {
    private String jsonrpc;
    private int id;
    private BlockResult result;

    public String getJsonrpc() {
        return jsonrpc;
    }

    public void setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BlockResult getResult() {
        return result;
    }

    public void setResult(BlockResult result) {
        this.result = result;
    }
}
