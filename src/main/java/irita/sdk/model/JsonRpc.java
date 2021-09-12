package irita.sdk.model;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class JsonRpc {
    private String jsonrpc = "2.0";
    private int id = 1;
    private String method;
    private Map<String, String> params = new HashMap<>();

    private JsonRpc() {
    }

    public static JsonRpc WrapMsg(com.google.protobuf.GeneratedMessageV3 msg, String method) {
        byte[] bytes = msg.toByteArray();
        return WrapTxBytes(bytes, method);
    }

    public static JsonRpc WrapTxBytes(byte[] bytes, String method) {
        JsonRpc rpc = new JsonRpc();
        rpc.method = method;
        rpc.params.put("tx", Base64.getEncoder().encodeToString(bytes));
        return rpc;
    }

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

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }
}