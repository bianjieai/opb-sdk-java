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
public class Evidence {

    @JSONField(name = "max_age_num_blocks")
    private String maxAgeNumBlocks;
    @JSONField(name = "max_age_duration")
    private String maxAgeDuration;
    @JSONField(name = "max_bytes")
    private String maxBytes;

    public void setMaxAgeNumBlocks(String maxAgeNumBlocks) {
        this.maxAgeNumBlocks = maxAgeNumBlocks;
    }

    public String getMaxAgeNumBlocks() {
        return maxAgeNumBlocks;
    }

    public void setMaxAgeDuration(String maxAgeDuration) {
        this.maxAgeDuration = maxAgeDuration;
    }

    public String getMaxAgeDuration() {
        return maxAgeDuration;
    }

    public void setMaxBytes(String maxBytes) {
        this.maxBytes = maxBytes;
    }

    public String getMaxBytes() {
        return maxBytes;
    }

}