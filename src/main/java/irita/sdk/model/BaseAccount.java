package irita.sdk.model;

import java.util.List;

public class BaseAccount {
    private List<Coin> coins;
    private Account account;

    public List<Coin> getCoins() {
        return coins;
    }

    public void setCoins(List<Coin> coins) {
        this.coins = coins;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getAddress() {
        return account.getAddress();
    }

    public long getAccountNumber() {
        return account.getAccountNumber();
    }

    public long getSequence() {
        return account.getSequence();
    }
}
