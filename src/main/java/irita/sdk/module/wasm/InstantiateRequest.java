package irita.sdk.module.wasm;

import irita.sdk.model.Coin;

import java.util.Map;

public class InstantiateRequest {
    private String admin;
    private long codeId;
    private String label;
    private Map<String, Object> initMsg;
    private Coin initFunds;

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public long getCodeId() {
        return codeId;
    }

    public void setCodeId(long codeId) {
        this.codeId = codeId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Map<String, Object> getInitMsg() {
        return initMsg;
    }

    public void setInitMsg(Map<String, Object> initMsg) {
        this.initMsg = initMsg;
    }

    public Coin getInitFunds() {
        return initFunds;
    }

    public void setInitFunds(Coin initFunds) {
        this.initFunds = initFunds;
    }
}
