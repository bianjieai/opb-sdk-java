package irita.sdk.constant.enums;

import irita.sdk.exception.IritaSDKException;
import irita.sdk.exception.UnknownMsgException;
import proto.cosmos.feegrant.v1beta1.Tx;

public enum MsgEnum {
    //tibc
    MSG_NFT_TRANSFER("tibc.apps.nft_transfer.v1.MsgNftTransfer", proto.tibc.apps.nft_transfer.v1.Tx.MsgNftTransfer.class),
    MSG_TIBC_UPDATE_CLIENT("tibc.core.client.v1.MsgUpdateClient", proto.tibc.core.client.v1.Tx.MsgUpdateClient.class),
    MSG_TIBC_ACKNOWLEDGEMENT("tibc.core.packet.v1.MsgAcknowledgement", proto.tibc.core.packet.v1.Tx.MsgAcknowledgement.class),
    MSG_TIBC_CLEAN_PACKET("tibc.core.packet.v1.MsgCleanPacket", proto.tibc.core.packet.v1.Tx.MsgCleanPacket.class),
    MSG_TIBC_RECV_CLEAN_PACKET("tibc.core.packet.v1.MsgRecvCleanPacket", proto.tibc.core.packet.v1.Tx.MsgRecvCleanPacket.class),
    //bank
    Msg_Send("cosmos.bank.v1beta1.MsgSend", proto.cosmos.bank.v1beta1.Tx.MsgSend.class),
    Msg_Multi_Send("cosmos.bank.v1beta1.MsgMultiSend", proto.cosmos.bank.v1beta1.Tx.MsgMultiSend.class),
    Msg_Ethereum_Tx("ethermint.evm.v1.MsgEthereumTx",proto.ethermint.evm.v1.Tx.MsgEthereumTx.class),
    //staking
//    MSG_DELEGATE("cosmos.staking.v1beta1.MsgDelegate", proto.cosmos.MsgDelegate.class),
//    MSG_UNDELEGATE("cosmos.staking.v1beta1.MsgUndelegate", .class),
//    MSG_BEGIN_REDELEGATE("cosmos.staking.v1beta1.MsgBeginRedelegate", .class),
    //distribution
//    MSG_WITHDRAW_DELEGATOR_REWARD("cosmos.distribution.v1beta1.MsgWithdrawDelegatorReward", proto.cosmos.distribution.class),
//    MSG_SET_WITHDRAW_ADDRESS("cosmos.distribution.v1beta1.MsgSetWithdrawAddress", .class),
//    MSG_WITHDRAW_VALIDATOR_COMMISSION("cosmos.distribution.v1beta1.MsgWithdrawValidatorCommission", .class),
//    MSG_FUND_COMMUNITY_POOL("cosmos.distribution.v1beta1.MsgFundCommunityPool", .class),
    //coinswap
//    MSG_ADD_LIQUIDITY("irismod.coinswap.MsgAddLiquidity", .class),
//    MSG_REMOVE_LIQUIDITY("irismod.coinswap.MsgRemoveLiquidity", .class),
//    MSG_SWAP_ORDER("irismod.coinswap.MsgSwapOrder", .class),
    //nft
    MSG_ISSUE_DENOM("irismod.nft.MsgIssueDenom", proto.nft.Tx.MsgIssueDenom.class),
    MSG_TRANSFER_DENOM("irismod.nft.MsgTransferDenom", proto.nft.Tx.MsgTransferDenom.class),
    MSG_TRANSFER_NFT("irismod.nft.MsgTransferNFT", proto.nft.Tx.MsgTransferNFT.class),
    MSG_EDIT_NFT("irismod.nft.MsgEditNFT", proto.nft.Tx.MsgEditNFT.class),
    MSG_MINT_NFT("irismod.nft.MsgMintNFT", proto.nft.Tx.MsgMintNFT.class),
    MSG_BURN_NFT("irismod.nft.MsgBurnNFT", proto.nft.Tx.MsgBurnNFT.class),
    //mt
    MSG_MT_ISSUE_DENOM("irismod.mt.MsgIssueDenom", proto.mt.Tx.MsgIssueDenom.class),
    MSG_MT_TRANSFER_DENOM("irismod.mt.MsgTransferDenom", proto.mt.Tx.MsgTransferDenom.class),
    MSG_MT_TRANSFER_MT("irismod.mt.MsgTransferMT", proto.mt.Tx.MsgTransferMT.class),
    MSG_MT_EDIT_MT("irismod.mt.MsgEditMT", proto.mt.Tx.MsgEditMT.class),
    MSG_MT_MINT_MT("irismod.mt.MsgMintMT", proto.mt.Tx.MsgMintMT.class),
    MSG_MT_BURN_MT("irismod.mt.MsgBurnMT", proto.mt.Tx.MsgBurnMT.class),
    //token
//    MSG_ISSUE_TOKEN("irismod.token.MsgIssueToken", proto.nft.Tx.MsgIssueToken.class),
//    MSG_EDIT_TOKEN("irismod.token.MsgEditToken", proto.nft.Tx.MsgEditToken.class),
//    MSG_MINT_TOKEN("irismod.token.MsgMintToken", proto.nft.Tx.MsgMintToken.class),
//    MSG_TRANSFER_TOKEN_OWNER("irismod.token.MsgTransferTokenOwner", proto.nft.Tx.MsgTransferTokenOwner.class),
    //gov
//    MSG_SUBMIT_PROPOSAL("cosmos.gov.v1beta1.MsgSubmitProposal", MsgSubmitProposal.class),
//    MSG_VOTE("cosmos.gov.v1beta1.MsgVote", .class),
//    MSG_DEPOSIT("cosmos.gov.v1beta1.MsgDeposit", .class),
    //htlc
//    MSG_CREATE_HTLC("irismod.htlc.MsgCreateHTLC", MsgCreateHTLC.class),
//    MSG_CLAIM_HTLC("irismod.htlc.MsgClaimHTLC", MsgClaimHTLC.class),
    //ibc
//    MSG_TRANSFER("ibc.applications.transfer.v1.MsgTransfer", MsgTransfer.class),
    //record
    MSG_CREATE_RECORD("irismod.record.MsgCreateRecord", proto.record.Tx.MsgCreateRecord.class),
    // service
    MSG_DEFINE_SERVICE("irismod.record.MsgDefineService", proto.service.Tx.MsgDefineService.class),
    MSG_BIND_SERVICE("irismod.service.MsgBindService", proto.service.Tx.MsgBindService.class),
    MSG_CALL_SERVICE("irismod.service.MsgCallService", proto.service.Tx.MsgCallService.class),
    MSG_RESPOND_SERVICE("irismod.service.MsgRespondService", proto.service.Tx.MsgRespondService.class),
    MSG_UPDATE_REQUEST_CONTEXT("irismod.service.MsgUpdateRequestContext", proto.service.Tx.MsgUpdateRequestContext.class),
    MSG_KILL_REQUEST_CONTEXT("irismod.service.MsgKillRequestContext", proto.service.Tx.MsgKillRequestContext.class),
    MSG_PAUSE_REQUEST_CONTEXT("irismod.service.MsgPauseRequestContext", proto.service.Tx.MsgPauseRequestContext.class),
    MSG_UPDATE_SERVICE_BINDING("irismod.service.MsgUpdateServiceBinding", proto.service.Tx.MsgUpdateServiceBinding.class),
    MSG_DISABLE_SERVICE_BINDING("irismod.service.MsgDisableServiceBinding", proto.service.Tx.MsgDisableServiceBinding.class),
    MSG_ENABLE_SERVICE_BINDING("irismod.service.MsgEnableServiceBinding", proto.service.Tx.MsgEnableServiceBinding.class),
    // identity
    MSG_CREATE_IDENTITY("iritamod.identity.MsgCreateIdentity", proto.identity.Tx.MsgCreateIdentity.class),
    MSG_UPDATE_IDENTITY("iritamod.identity.MsgUpdateIdentity", proto.identity.Tx.MsgUpdateIdentity.class),
    //feegrant
    MSG_GRANT_ALLOWANCE("cosmos.feegrant.v1beta1.MsgGrantAllowance", proto.cosmos.feegrant.v1beta1.Tx.MsgGrantAllowance.class),
    MSG_REVOKE_ALLOWANCE("cosmos.feegrant.v1beta1.MsgRevokeAllowance",proto.cosmos.feegrant.v1beta1.Tx.MsgRevokeAllowance.class),
    // perm
    MSG_ASSIGN_ROLES("iritamod.perm.MsgAssignRoles", proto.perm.Tx.MsgAssignRoles.class),
    MSG_UNASSIGN_ROLES("iritamod.perm.MsgUnassignRoles", proto.perm.Tx.MsgUnassignRoles.class),
    MSG_BLOCK_ACCOUNT("iritamod.perm.MsgBlockAccount", proto.perm.Tx.MsgBlockAccount.class),
    MSG_UNBLOCK_ACCOUNT("iritamod.perm.MsgUnblockAccount", proto.perm.Tx.MsgUnblockAccount.class),
    MSG_BLOCK_CONTRACT("iritamod.perm.MsgBlockContract", proto.perm.Tx.MsgBlockContract.class),
    MSG_UNBLOCK_CONTRACT("iritamod.perm.MsgUnblockContract", proto.perm.Tx.MsgUnblockContract.class),
    // wasm
    MSG_EXECUTE_CONTRACT("cosmwasm.wasm.v1.MsgExecuteContract", proto.cosmwasm.wasm.v1.Tx.MsgExecuteContract.class),
    MSG_INSTANTIATE_CONTRACT("cosmwasm.wasm.v1.MsgInstantiateContract", proto.cosmwasm.wasm.v1.Tx.MsgInstantiateContract.class),
    MSG_STORE_CODE("cosmwasm.wasm.v1.MsgStoreCode", proto.cosmwasm.wasm.v1.Tx.MsgStoreCode.class),
    MSG_MIGRATE_CONTRACT("cosmwasm.wasm.v1.MsgMigrateContract", proto.cosmwasm.wasm.v1.Tx.MsgMigrateContract.class),

    //OPB
    MSG_MINT("iritamod.opb.MsgMint", proto.opb.Tx.MsgMint.class),
    MSG_RECLAIM("iritamod.opb.MsgReclaim", proto.opb.Tx.MsgReclaim.class),
    //evm
    MSG_ETHERMINT_TX("ethermint.evm.v1.MsgEthereumTx", proto.ethermint.evm.v1.Tx.MsgEthereumTx.class),
    MSG_LEGACY_TX("ethermint.evm.v1.LegacyTx", proto.ethermint.evm.v1.Tx.LegacyTx.class),
    MSG_ACCESS_LIST_TX("ethermint.evm.v1.AccessListTx", proto.ethermint.evm.v1.Tx.AccessListTx.class),
    MSG_DYNAMIC_FEE_TX("ethermint.evm.v1.DynamicFeeTx", proto.ethermint.evm.v1.Tx.DynamicFeeTx.class),

    ;

    private final String typeUrl;
    private final Class<?> className;

    MsgEnum(String typeUrl, Class<?> className) {
        this.typeUrl = typeUrl;
        this.className = className;
    }

    public final String getTypeUrl() {
        return typeUrl;
    }

    public Class<?> getClassName() {
        return className;
    }

    public static Class<?> getClassName(String typeUrl) {
        MsgEnum[] msgEnums = values();
        for (MsgEnum msgEnum : msgEnums) {
            if (msgEnum.getTypeUrl().equals(typeUrl)) {
                return msgEnum.className;
            }
        }
        throw new UnknownMsgException(typeUrl);
    }
}
