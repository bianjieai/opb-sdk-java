package irita.sdk.module.nft;

import java.util.List;

public class QueryCollectionResp {
    private QueryDenomResp denom;
    private List<QueryNFTResp> nfts;
    private String nextKey;
    private long total;


    public QueryDenomResp getDenom() {
        return denom;
    }

    public void setDenom(QueryDenomResp denom) {
        this.denom = denom;
    }

    public List<QueryNFTResp> getNfts() {
        return nfts;
    }

    public void setNfts(List<QueryNFTResp> nfts) {
        this.nfts = nfts;
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
