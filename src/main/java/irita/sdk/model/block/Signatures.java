package irita.sdk.model.block;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Signatures {
    @JsonProperty(value = "block_id_flag")
    private int blockIdFlag;
    @JsonProperty(value = "validator_address")
    private String validatorAddress;
    private String timestamp;
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

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getSignature() {
        return signature;
    }

}