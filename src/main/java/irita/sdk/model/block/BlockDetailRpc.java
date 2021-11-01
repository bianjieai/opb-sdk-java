package irita.sdk.model.block;

public class BlockDetailRpc {
    private String jsonrpc;
    private int id;
    private BlockDetail result;

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

    public BlockDetail getResult() {
        return result;
    }

    public void setResult(BlockDetail result) {
        this.result = result;
    }
}
