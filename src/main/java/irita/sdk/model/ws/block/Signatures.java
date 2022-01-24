package irita.sdk.model.ws.block;

import java.util.Date;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Signatures {

    @JsonProperty(value = "block_id_flag")
    private int blockIdFlag;
    @JsonProperty(value = "validator_address")
    private String validatorAddress;
    private Date timestamp;
    private String signature;

    public void setBlockIdFlag(int blockIdFlag) {
        this.blockIdFlag = blockIdFlag;
    }

    public int getBlockIdFlag() {
        return blockIdFlag;
    }

    public void setValidatorAddress(String validatorAddress) {
        this.validatorAddress = validatorAddress;
    }

    public String getValidatorAddress() {
        return validatorAddress;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getSignature() {
        return signature;
    }

}