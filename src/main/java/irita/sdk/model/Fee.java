package irita.sdk.model;

public class Fee {
    private String amount;
    private String denom;

    public Fee() {
    }

    public Fee(String amount, String denom) {
        this.amount = amount;
        this.denom = denom;
    }

    public String getAmount() {
        return amount;
    }

    public Fee setAmount(String amount) {
        this.amount = amount;
        return this;
    }

    public String getDenom() {
        return denom;
    }

    public Fee setDenom(String denom) {
        this.denom = denom;
        return this;
    }
}
