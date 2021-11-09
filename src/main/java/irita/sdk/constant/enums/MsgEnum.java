package irita.sdk.constant.enums;

public enum MsgEnum {
    //tibc
    MSG_NFT_TRANSFER("tibc.apps.nft_transfer.v1.MsgNftTransfer", proto.tibc.apps.nft_transfer.v1.Tx.MsgNftTransfer.class.getName()),
    //bank
    Msg_Send("cosmos.bank.v1beta1.MsgSend", proto.cosmos.bank.v1beta1.Tx.MsgSend.class.getName()),
    Msg_Multi_Send("cosmos.bank.v1beta1.MsgMultiSend", proto.cosmos.bank.v1beta1.Tx.MsgMultiSend.class.getName()),
    //staking
//    MSG_DELEGATE("cosmos.staking.v1beta1.MsgDelegate", proto.cosmos.MsgDelegate.class.getName()),
//    MSG_UNDELEGATE("cosmos.staking.v1beta1.MsgUndelegate", .class.getName()),
//    MSG_BEGIN_REDELEGATE("cosmos.staking.v1beta1.MsgBeginRedelegate", .class.getName()),
    //distribution
//    MSG_WITHDRAW_DELEGATOR_REWARD("cosmos.distribution.v1beta1.MsgWithdrawDelegatorReward", proto.cosmos.distribution.class.getName()),
//    MSG_SET_WITHDRAW_ADDRESS("cosmos.distribution.v1beta1.MsgSetWithdrawAddress", .class.getName()),
//    MSG_WITHDRAW_VALIDATOR_COMMISSION("cosmos.distribution.v1beta1.MsgWithdrawValidatorCommission", .class.getName()),
//    MSG_FUND_COMMUNITY_POOL("cosmos.distribution.v1beta1.MsgFundCommunityPool", .class.getName()),
    //coinswap
//    MSG_ADD_LIQUIDITY("irismod.coinswap.MsgAddLiquidity", .class.getName()),
//    MSG_REMOVE_LIQUIDITY("irismod.coinswap.MsgRemoveLiquidity", .class.getName()),
//    MSG_SWAP_ORDER("irismod.coinswap.MsgSwapOrder", .class.getName()),
    //nft
    MSG_ISSUE_DENOM("irismod.nft.MsgIssueDenom", proto.nft.Tx.MsgIssueDenom.class.getName()),
    MSG_TRANSFER_NFT("irismod.nft.MsgTransferNFT", proto.nft.Tx.MsgTransferNFT.class.getName()),
    MSG_EDIT_NFT("irismod.nft.MsgEditNFT", proto.nft.Tx.MsgTransferNFT.class.getName()),
    MSG_MINT_NFT("irismod.nft.MsgMintNFT", proto.nft.Tx.MsgMintNFT.class.getName()),
    MSG_BURN_NFT("irismod.nft.MsgBurnNFT", proto.nft.Tx.MsgBurnNFT.class.getName()),
    //token
//    MSG_ISSUE_TOKEN("irismod.token.MsgIssueToken", proto.nft.Tx.MsgIssueToken.class.getName()),
//    MSG_EDIT_TOKEN("irismod.token.MsgEditToken", proto.nft.Tx.MsgEditToken.class.getName()),
//    MSG_MINT_TOKEN("irismod.token.MsgMintToken", proto.nft.Tx.MsgMintToken.class.getName()),
//    MSG_TRANSFER_TOKEN_OWNER("irismod.token.MsgTransferTokenOwner", proto.nft.Tx.MsgTransferTokenOwner.class.getName()),
    //gov
//    MSG_SUBMIT_PROPOSAL("cosmos.gov.v1beta1.MsgSubmitProposal", MsgSubmitProposal.class.getName()),
//    MSG_VOTE("cosmos.gov.v1beta1.MsgVote", .class.getName()),
//    MSG_DEPOSIT("cosmos.gov.v1beta1.MsgDeposit", .class.getName()),
    //htlc
//    MSG_CREATE_HTLC("irismod.htlc.MsgCreateHTLC", MsgCreateHTLC.class.getName()),
//    MSG_CLAIM_HTLC("irismod.htlc.MsgClaimHTLC", MsgClaimHTLC.class.getName()),
    //ibc
//    MSG_TRANSFER("ibc.applications.transfer.v1.MsgTransfer", MsgTransfer.class.getName()),
    //record
    MSG_CREATE_RECORD("irismod.record.MsgCreateRecord", proto.record.Tx.MsgCreateRecord.class.getName()),
    ;

    private final String typeUrl;
    private final String className;

    MsgEnum(String typeUrl, String className) {
        this.typeUrl = typeUrl;
        this.className = className;
    }

    public final String getTypeUrl() {
        return typeUrl;
    }

    public String getClassName() {
        return className;
    }

    public static String getClassName(String typeUrl) {
        MsgEnum[] msgEnums = values();
        for (MsgEnum msgEnum : msgEnums) {
            if (msgEnum.getTypeUrl().equals(typeUrl)) {
                return msgEnum.getClassName();
            }
        }
        return null;
    }
}
