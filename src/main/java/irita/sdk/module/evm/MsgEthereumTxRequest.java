package irita.sdk.module.evm;

import com.google.protobuf.Any;

public class MsgEthereumTxRequest {

    private com.google.protobuf.Any value;
    private double size;
    private String from;
    private String hash;
    private String payer;

    public Any getValue() {
        return value;
    }

    public void setValue(Any value) {
        this.value = value;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }
}
