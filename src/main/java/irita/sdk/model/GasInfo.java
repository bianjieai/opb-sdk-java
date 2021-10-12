package irita.sdk.model;

import com.alibaba.fastjson.annotation.JSONField;

public class GasInfo {
    @JSONField(name = "gas_wanted")
    private String gasWanted;
    @JSONField(name = "gas_used")
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