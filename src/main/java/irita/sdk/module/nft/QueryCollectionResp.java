package irita.sdk.module.nft;

import java.util.List;

public class QueryCollectionResp {
    private QueryDenomResp denom;
    private List<QueryNFTResp> nfts;

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
}
