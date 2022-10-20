package irita.sdk.model;

public class Result {
    private Check_tx check_tx;
    private Deliver_tx deliver_tx;
    private String hash;
    private String height;
    private Integer code;
    private String log;

    public void setCheck_tx(Check_tx check_tx) {
        this.check_tx = check_tx;
    }

    public Check_tx getCheck_tx() {
        return check_tx;
    }

    public void setDeliver_tx(Deliver_tx deliver_tx) {
        this.deliver_tx = deliver_tx;
    }

    public Deliver_tx getDeliver_tx() {
        return deliver_tx;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getHash() {
        return hash;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getHeight() {
        return height;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }
}