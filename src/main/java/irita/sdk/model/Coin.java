package irita.sdk.model;

public class Coin {
    private String denom;
    private String amount;

    public Coin() {
    }

    public Coin(String denom, String amount) {
        this.denom = denom;
        this.amount = amount;
    }

    public String getDenom() {
        return denom;
    }

    public void setDenom(String denom) {
        this.denom = denom;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
