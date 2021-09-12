package irita.sdk.model;

import java.io.Serializable;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class WrappedRequest<T extends com.google.protobuf.GeneratedMessageV3> implements Serializable {
    private static final long serialVersionUID = 4739712926654477976L;
    private String jsonrpc = "2.0";
    private int id = 1;
    private String method = "broadcast_tx_commit";
    private Map<String, String> params;

    public WrappedRequest(T tx) {
        this.params = new HashMap<>();
        this.params.put("tx", Base64.getEncoder().encodeToString(tx.toByteArray()));
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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