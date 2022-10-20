package irita.sdk.model;

import irita.sdk.constant.Constant;
import irita.sdk.constant.enums.BroadcastMode;
import org.apache.commons.lang3.StringUtils;

public class BaseTx {
    private String from;
    private String password;
    private int gas;
    private Fee fee;
    private String memo;
    private BroadcastMode mode;
    private long accountNumber;
    private long sequence;
    private String feeGranter;
    private String feePayer;

    public BaseTx() {
    }

    public BaseTx(int gas, Fee fee, BroadcastMode mode) {
        this.gas = gas;
        this.fee = fee;
        this.mode = mode;
    }

    public BaseTx(int gas, Fee fee, BroadcastMode mode, long accountNumber, long sequence) {
        this.gas = gas;
        this.fee = fee;
        this.mode = mode;
        this.accountNumber = accountNumber;
        this.sequence = sequence;
    }

    public BaseTx(String from, String password, int gas, Fee fee, String memo, BroadcastMode mode) {
        this.from = from;
        this.password = password;
        this.gas = gas;
        this.fee = fee;
        this.memo = memo;
        this.mode = mode;
    }

    public BaseTx(String from, String password, int gas, Fee fee, String memo, BroadcastMode mode, long accountNumber, long sequence) {
        this.from = from;
        this.password = password;
        this.gas = gas;
        this.fee = fee;
        this.memo = memo;
        this.mode = mode;
        this.accountNumber = accountNumber;
        this.sequence = sequence;
    }

    public String getFrom() {
        return StringUtils.isNotEmpty(from) ? from : Constant.DEFAULT_USER_NAME;
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

    public long getAccountNumber() {
        return accountNumber;
    }

    public BaseTx setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public long getSequence() {
        return sequence;
    }

    public BaseTx setSequence(long sequence) {
        this.sequence = sequence;
        return this;
    }

    public String getFeeGranter() {
        return feeGranter;
    }

    public BaseTx setFeeGranter(String feeGranter) {
        this.feeGranter = feeGranter;
        return this;
    }

    public String getFeePayer() {
        return feePayer;
    }

    public BaseTx setFeePayer(String feePayer) {
        this.feePayer = feePayer;
        return this;
    }
}
