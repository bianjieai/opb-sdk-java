package irita.sdk.module.service;

import irita.sdk.model.Coin;

public class BindServiceRequest {
    private String serviceName;
    private Coin deposit;
    private String pricing;
    private long qoS;
    private String options;
    private String provider;

    public String getServiceName() {
        return serviceName;
    }

    public BindServiceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public Coin getDeposit() {
        return deposit;
    }

    public BindServiceRequest setDeposit(Coin deposit) {
        this.deposit = deposit;
        return this;
    }

    public String getPricing() {
        return pricing;
    }

    public BindServiceRequest setPricing(String pricing) {
        this.pricing = pricing;
        return this;
    }

    public long getQoS() {
        return qoS;
    }

    public BindServiceRequest setQoS(long qoS) {
        this.qoS = qoS;
        return this;
    }

    public String getOptions() {
        return options;
    }

    public BindServiceRequest setOptions(String options) {
        this.options = options;
        return this;
    }

    public String getProvider() {
        return provider;
    }

    public BindServiceRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
}
