package irita.sdk.module.random;

import irita.sdk.model.Coin;

public class MsgRequestRandom {

    private long BlockInterval;
    private String Consumer;
    private boolean Oracle;
    private Coin ServiceFeeCap;

    public long getBlockInterval() {
        return this.BlockInterval;
    }

    public void setBlockInterval(long blockInterval) {
        this.BlockInterval = blockInterval;
    }

    public String getConsumer() {
        return Consumer;
    }

    public void setConsumer(String consumer) {
        Consumer = consumer;
    }

    public boolean getOracle() {
        return Oracle;
    }

    public void setOracle(boolean oracle) {
        Oracle = oracle;
    }

    public Coin getServiceFeeCap() {
        return ServiceFeeCap;
    }

    public void setServiceFeeCap(Coin serviceFeeCap) {
        ServiceFeeCap = serviceFeeCap;
    }

}
