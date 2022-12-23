package irita.sdk.module.nft;

import java.util.List;

public class QueryOwnerResp {
    private String address;
    private List<IDC> idcs;
    private String nextKey;
    private long total;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<IDC> getIdcs() {
        return idcs;
    }

    public void setIdcs(List<IDC> idcs) {
        this.idcs = idcs;
    }

    public String getNextKey() {
        return nextKey;
    }

    public void setNextKey(String nextKey) {
        this.nextKey = nextKey;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
