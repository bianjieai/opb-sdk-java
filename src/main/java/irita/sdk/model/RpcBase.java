package irita.sdk.model;

import irita.sdk.model.tx.RpcError;

public class RpcBase<T> {
    private String jsonrpc;
    private int id;
    private RpcError error;
    private T result;

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

    public RpcError getError() {
        return error;
    }

    public void setError(RpcError error) {
        this.error = error;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "RpcBase{" +
                "jsonrpc='" + jsonrpc + '\'' +
                ", id=" + id +
                ", error=" + error +
                ", result=" + result +
                '}';
    }
}
