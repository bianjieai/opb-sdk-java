package irita.sdk.module.service;

import irita.sdk.model.Coin;

import java.util.List;

public class CallServiceRequest {
    private String ServiceName;
    private List<String> Providers;
    private String Input;
    private Coin ServiceFeeCap;
    private long Timeout;
    private boolean Repeated;
    private long RepeatedFrequency;
    private long RepeatedTotal;

    public String getServiceName() {
        return ServiceName;
    }

    public CallServiceRequest setServiceName(String serviceName) {
        ServiceName = serviceName;
        return this;
    }

    public List<String> getProviders() {
        return Providers;
    }

    public CallServiceRequest setProviders(List<String> providers) {
        Providers = providers;
        return this;
    }

    public String getInput() {
        return Input;
    }

    public CallServiceRequest setInput(String input) {
        Input = input;
        return this;
    }

    public Coin getServiceFeeCap() {
        return ServiceFeeCap;
    }

    public CallServiceRequest setServiceFeeCap(Coin serviceFeeCap) {
        ServiceFeeCap = serviceFeeCap;
        return this;
    }

    public long getTimeout() {
        return Timeout;
    }

    public CallServiceRequest setTimeout(long timeout) {
        Timeout = timeout;
        return this;
    }

    public boolean isRepeated() {
        return Repeated;
    }

    public CallServiceRequest setRepeated(boolean repeated) {
        Repeated = repeated;
        return this;
    }

    public long getRepeatedFrequency() {
        return RepeatedFrequency;
    }

    public CallServiceRequest setRepeatedFrequency(long repeatedFrequency) {
        RepeatedFrequency = repeatedFrequency;
        return this;
    }

    public long getRepeatedTotal() {
        return RepeatedTotal;
    }

    public CallServiceRequest setRepeatedTotal(long repeatedTotal) {
        RepeatedTotal = repeatedTotal;
        return this;
    }
}
