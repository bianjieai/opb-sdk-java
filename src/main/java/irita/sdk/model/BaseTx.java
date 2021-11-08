package irita.sdk.model;

import irita.sdk.constant.enums.BroadcastMode;

public class BaseTx {
    private String from;
    private String password;
    private int gas;
    private Fee fee;
    private String memo;
    private BroadcastMode mode;

    public BaseTx() {
    }

    public BaseTx(int gas, Fee fee, BroadcastMode mode) {
        this.gas = gas;
        this.fee = fee;
        this.mode = mode;
    }

    public BaseTx(String from, String password, int gas, Fee fee, BroadcastMode mode) {
        this.from = from;
        this.password = password;
        this.gas = gas;
        this.fee = fee;
        this.mode = mode;
    }

    public int getGas() {
        return gas;
    }

    public BaseTx setGas(int gas) {
        this.gas = gas;
        return this;
    }

    public Fee getFee() {
        return fee;
    }

    public BaseTx setFee(Fee fee) {
        this.fee = fee;
        return this;
    }

    public String getMemo() {
        return memo;
    }

    public BaseTx setMemo(String memo) {
        this.memo = memo;
        return this;
    }

    public BroadcastMode getMode() {
        return mode;
    }

    public BaseTx setMode(BroadcastMode mode) {
        this.mode = mode;
        return this;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
