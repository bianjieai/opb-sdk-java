/**
 * Copyright 2021 jb51.net
 */
package irita.sdk.model.block;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Auto-generated: 2021-11-01 10:51:5
 *
 * @author jb51.net (i@jb51.net)
 * @website http://tools.jb51.net/code/json2javabean
 */
public class Signatures {

    @JSONField(name = "block_id_flag")
    private int blockIdFlag;
    @JSONField(name = "validator_address")
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