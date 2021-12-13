package irita.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GasInfoWrap {
    @JsonProperty(value = "gas_info")
    private GasInfo gasInfo;

    public void setGasInfo(GasInfo gasInfo) {
        this.gasInfo = gasInfo;
    }

    public GasInfo getGasInfo() {
        return gasInfo;
    }
}