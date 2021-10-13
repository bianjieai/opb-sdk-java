package irita.sdk.module.service;

import irita.sdk.model.Coin;

import java.util.List;

public class CallServiceRequest {
    private String ServiceName;
    private List<String> Providers;
    private String Input;
    private Coin ServiceFeeCap;
    private long Timeout;
    private boolean SuperMode;
    private boolean Repeated;
    private long RepeatedFrequency;
    private long RepeatedTotal;

    public String getServiceName() {
        return ServiceName;
    }

    public void setServiceName(String serviceName) {
        ServiceName = serviceName;
    }

    public List<String> getProviders() {
        return Providers;
    }

    public void setProviders(List<String> providers) {
        Providers = providers;
    }

    public String getInput() {
        return Input;
    }

    public void setInput(String input) {
        Input = input;
    }

    public Coin getServiceFeeCap() {
        return ServiceFeeCap;
    }

    public void setServiceFeeCap(Coin serviceFeeCap) {
        ServiceFeeCap = serviceFeeCap;
    }

    public long getTimeout() {
        return Timeout;
    }

    public void setTimeout(long timeout) {
        Timeout = timeout;
    }

    public boolean isSuperMode() {
        return SuperMode;
    }

    public void setSuperMode(boolean superMode) {
        SuperMode = superMode;
    }

    public boolean isRepeated() {
        return Repeated;
    }

    public void setRepeated(boolean repeated) {
        Repeated = repeated;
    }

    public long getRepeatedFrequency() {
        return RepeatedFrequency;
    }

    public void setRepeatedFrequency(long repeatedFrequency) {
        RepeatedFrequency = repeatedFrequency;
    }

    public long getRepeatedTotal() {
        return RepeatedTotal;
    }

    public void setRepeatedTotal(long repeatedTotal) {
        RepeatedTotal = repeatedTotal;
    }
}
