package irita.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GasInfo {
    @JsonProperty(value = "gas_wanted")
    private String gasWanted;
    @JsonProperty(value = "gas_used")
    private String gasUsed;

    public void setGasWanted(String gasWanted) {
        this.gasWanted = gasWanted;
    }

    public String getGasWanted() {
        return gasWanted;
    }

    public void setGasUsed(String gasUsed) {
        this.gasUsed = gasUsed;
    }

    public String getGasUsed() {
        return gasUsed;
    }

}