/**
 * Copyright 2021 jb51.net
 */
package irita.sdk.model.tx;

/**
 * Auto-generated: 2021-11-01 13:58:11
 *
 * @author jb51.net (i@jb51.net)
 * @website http://tools.jb51.net/code/json2javabean
 */
public class TxRpc {

    private String jsonrpc;
    private int id;
    private Result result;

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

    public void setResult(Result result) {
        this.result = result;
    }

    public Result getResult() {
        return result;
    }

}