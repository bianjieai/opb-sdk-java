package irita.sdk.model.ws.block;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Block {

    @JsonProperty(value = "max_bytes")
    private String maxBytes;
    @JsonProperty(value = "max_gas")
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