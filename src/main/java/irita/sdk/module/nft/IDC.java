package irita.sdk.module.nft;

import java.util.List;

public class IDC {
    private String denom;
    private List<String> tokenIDs;

    public IDC() {
    }

    public IDC(String denom, List<String> tokenIDs) {
        this.denom = denom;
        this.tokenIDs = tokenIDs;
    }

    public String getDenom() {
        return denom;
    }

    public void setDenom(String denom) {
        this.denom = denom;
    }

    public List<String> getTokenIDs() {
        return tokenIDs;
    }

    public void setTokenIDs(List<String> tokenIDs) {
        this.tokenIDs = tokenIDs;
    }
}
