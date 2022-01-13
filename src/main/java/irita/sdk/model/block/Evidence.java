package irita.sdk.model.block;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Evidence {
    @JsonProperty(value = "max_age_num_blocks")
    private String maxAgeNumBlocks;
    @JsonProperty(value = "max_age_duration")
    private String maxAgeDuration;
    @JsonProperty(value = "max_bytes")
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