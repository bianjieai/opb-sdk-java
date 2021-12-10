package irita.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseQuery {
    private int code;
    private String log;
    private String info;
    private String index;
    private String key;
    private String value;
    @JsonProperty(value = "proofOps")
    private String proofops;
    private String height;
    private String codespace;

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getLog() {
        return log;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getIndex() {
        return index;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setProofops(String proofops) {
        this.proofops = proofops;
    }

    public String getProofops() {
        return proofops;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getHeight() {
        return height;
    }

    public void setCodespace(String codespace) {
        this.codespace = codespace;
    }

    public String getCodespace() {
        return codespace;
    }
}

