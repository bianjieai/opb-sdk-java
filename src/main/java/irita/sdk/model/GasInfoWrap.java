package irita.sdk.model;

import com.alibaba.fastjson.annotation.JSONField;

public class GasInfoWrap {
    @JSONField(name = "gas_info")
    private GasInfo gasInfo;

    public void setGasInfo(GasInfo gasInfo) {
        this.gasInfo = gasInfo;
    }

    public GasInfo getGasInfo() {
        return gasInfo;
    }
}