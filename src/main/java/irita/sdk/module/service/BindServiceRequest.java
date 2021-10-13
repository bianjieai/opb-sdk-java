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

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Coin getDeposit() {
        return deposit;
    }

    public void setDeposit(Coin deposit) {
        this.deposit = deposit;
    }

    public String getPricing() {
        return pricing;
    }

    public void setPricing(String pricing) {
        this.pricing = pricing;
    }

    public long getQoS() {
        return qoS;
    }

    public void setQoS(long qoS) {
        this.qoS = qoS;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}
