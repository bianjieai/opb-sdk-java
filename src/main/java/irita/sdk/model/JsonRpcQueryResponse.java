package irita.sdk.model;


public class JsonRpcQueryResponse {
    private String jsonrpc;
    private int id;
    private ResultABCIQuery result;

    public void setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
    }

    public String getJsonrpc() {
        return jsonrpc;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setResult(ResultABCIQuery result) {
        this.result = result;
    }

    public ResultABCIQuery getResult() {
        return result;
    }

}



