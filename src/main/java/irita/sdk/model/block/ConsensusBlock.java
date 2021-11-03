/**
 * Copyright 2021 jb51.net
 */
package irita.sdk.model.block;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Auto-generated: 2021-11-03 16:3:1
 *
 * @author jb51.net (i@jb51.net)
 * @website http://tools.jb51.net/code/json2javabean
 */
public class ConsensusBlock {

    @JSONField(name = "max_bytes")
    private String maxBytes;
    @JSONField(name = "max_gas")
    private String maxGas;

    public void setMaxBytes(String maxBytes) {
        this.maxBytes = maxBytes;
    }

    public String getMaxBytes() {
        return maxBytes;
    }

    public void setMaxGas(String maxGas) {
        this.maxGas = maxGas;
    }

    public String getMaxGas() {
        return maxGas;
    }

}