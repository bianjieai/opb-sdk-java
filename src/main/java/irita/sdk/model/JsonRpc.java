package irita.sdk.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import irita.sdk.exception.IritaSDKException;
import irita.sdk.util.JsonUtils;
import org.bouncycastle.util.encoders.Hex;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class JsonRpc {
    private String jsonrpc = "2.0";
    private int id = 1;
    private String method;
    private Map<String, Object> params = new HashMap<>();

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

    public static JsonRpc WrapAbciQuery(byte[] bytes, String path) {
        JsonRpc rpc = new JsonRpc();
        rpc.method = "abci_query";
        rpc.params.put("path", path);
        rpc.params.put("data", Hex.toHexString(bytes));
        return rpc;
    }

    public static JsonRpc WrapBaseQuery(Map<String, Object> params, String method) {
        JsonRpc rpc = new JsonRpc();
        rpc.method = method;
        rpc.setParams(params);
        return rpc;
    }

    public String toJsonStr() {
        try {
            return JsonUtils.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new IritaSDKException(e.getMessage());
        }
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

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }
}