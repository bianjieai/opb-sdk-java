package irita.sdk.module.service;


import irita.sdk.model.Coin;

public class UpdateServiceBindingRequest {
    private String ServiceName;
    private Coin Deposit;
    private String Pricing;
    private long QoS;
    private String Provider;

    public String getServiceName() {
        return ServiceName;
    }

    public void setServiceName(String serviceName) {
        ServiceName = serviceName;
    }

    public Coin getDeposit() {
        return Deposit;
    }

    public void setDeposit(Coin deposit) {
        Deposit = deposit;
    }

    public String getPricing() {
        return Pricing;
    }

    public void setPricing(String pricing) {
        Pricing = pricing;
    }

    public long getQoS() {
        return QoS;
    }

    public void setQoS(long qoS) {
        QoS = qoS;
    }

    public String getProvider() {
        return Provider;
    }

    public void setProvider(String provider) {
        Provider = provider;
    }
}
