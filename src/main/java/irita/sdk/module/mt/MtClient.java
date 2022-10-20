package irita.sdk.module.mt;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageV3;
import io.grpc.ManagedChannel;
import irita.sdk.client.BaseClient;
import irita.sdk.model.Account;
import irita.sdk.model.BaseTx;
import irita.sdk.model.ResultTx;
import irita.sdk.util.AddressUtils;
import org.apache.commons.lang3.StringUtils;
import proto.cosmos.base.query.v1beta1.Pagination;
import proto.mt.QueryGrpc;
import proto.mt.QueryOuterClass;
import proto.mt.Tx;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class MtClient {
    private final BaseClient baseClient;

    public MtClient(BaseClient baseClient) {
        this.baseClient = baseClient;
    }

    //creating a new denom.
    public ResultTx issueDenom(String name, byte[] data, BaseTx baseTx) throws IOException {
        Account account = baseClient.queryAccount(baseTx);
        Tx.MsgIssueDenom msg = Tx.MsgIssueDenom
                .newBuilder()
                .setName(name)
                .setSender(account.getAddress())
                .setData(ByteString.copyFrom(data))
                .build();
        List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
        return baseClient.buildAndSend(msgs, baseTx, account);
    }

    //transferring a denom.
    public ResultTx transferDenom(String id, String recipient, BaseTx baseTx) throws IOException {
        Account account = baseClient.queryAccount(baseTx);
        Tx.MsgTransferDenom msgTransferDenom = Tx.MsgTransferDenom
                .newBuilder()
                .setId(id)
                .setSender(account.getAddress())
                .setRecipient(recipient)
                .build();
        List<GeneratedMessageV3> msgs = Collections.singletonList(msgTransferDenom);
        return baseClient.buildAndSend(msgs, baseTx, account);
    }

    //creating a new MT or minting amounts of an existing MT
    public ResultTx mintMT(MsgMintMTRequest msgMintMTRequest, BaseTx baseTx) throws IOException {
        Account account = baseClient.queryAccount(baseTx);
        Tx.MsgMintMT.Builder mintMTBuilder = Tx.MsgMintMT
                .newBuilder()
                .setDenomId(msgMintMTRequest.getDenomId())
                .setAmount(msgMintMTRequest.getAmount())
                .setData(ByteString.copyFrom(msgMintMTRequest.getData()))
                .setSender(account.getAddress());
        if (StringUtils.isEmpty(msgMintMTRequest.getRecipient())) {
            throw new IllegalArgumentException("Recipient is null");
        }
        AddressUtils.validAddress(msgMintMTRequest.getRecipient());
        mintMTBuilder.setRecipient(msgMintMTRequest.getRecipient());
        Tx.MsgMintMT mintMT = mintMTBuilder.build();
        List<GeneratedMessageV3> msgs = Collections.singletonList(mintMT);
        return baseClient.buildAndSend(msgs, baseTx, account);
    }

    //Additional issuance existing MT
    public ResultTx additionalIssueMt(MsgAddIssueMTRequest msgAddIssueMTRequest, BaseTx baseTx) throws IOException {
        Account account = baseClient.queryAccount(baseTx);
        Tx.MsgMintMT.Builder mintMTBuilder = Tx.MsgMintMT
                .newBuilder()
                .setId(msgAddIssueMTRequest.getId())
                .setDenomId(msgAddIssueMTRequest.getDenomId())
                .setAmount(msgAddIssueMTRequest.getAmount())
                .setSender(account.getAddress());
        if (StringUtils.isEmpty(msgAddIssueMTRequest.getRecipient())) {
            throw new IllegalArgumentException("Recipient is null");
        }
        AddressUtils.validAddress(msgAddIssueMTRequest.getRecipient());
        mintMTBuilder.setRecipient(msgAddIssueMTRequest.getRecipient());
        Tx.MsgMintMT mintMT = mintMTBuilder.build();
        List<GeneratedMessageV3> msgs = Collections.singletonList(mintMT);
        return baseClient.buildAndSend(msgs, baseTx, account);
    }

    //editing an MT.
    public ResultTx editMT(String id, String denomId, byte[] data, BaseTx baseTx) throws IOException {
        Account account = baseClient.queryAccount(baseTx);
        Tx.MsgEditMT msgEditMT = Tx.MsgEditMT
                .newBuilder()
                .setId(id)
                .setDenomId(denomId)
                .setData(ByteString.copyFrom(data))
                .setSender(account.getAddress())
                .build();
        List<GeneratedMessageV3> msgs = Collections.singletonList(msgEditMT);
        return baseClient.buildAndSend(msgs, baseTx, account);
    }

    //transferring an MT.
    public ResultTx transferMT(String id, String denomId, long amount, String recipient, BaseTx baseTx) throws IOException {
        Account account = baseClient.queryAccount(baseTx);
        Tx.MsgTransferMT.Builder msgTransfrtMtBuilder = Tx.MsgTransferMT
                .newBuilder()
                .setId(id)
                .setDenomId(denomId)
                .setAmount(amount)
                .setSender(account.getAddress());
        if (StringUtils.isEmpty(recipient)) {
            throw new IllegalArgumentException("Recipient is null");
        }
        AddressUtils.validAddress(recipient);
        msgTransfrtMtBuilder.setRecipient(recipient);
        Tx.MsgTransferMT msgTransferMT = msgTransfrtMtBuilder.build();
        List<GeneratedMessageV3> msgs = Collections.singletonList(msgTransferMT);
        return baseClient.buildAndSend(msgs, baseTx, account);
    }

    //burning an MT.
    public ResultTx burnMT(String id, String denomId, long amount, BaseTx baseTx) throws IOException {
        Account account = baseClient.queryAccount(baseTx);
        Tx.MsgBurnMT msgBurnMT = Tx.MsgBurnMT
                .newBuilder()
                .setId(id)
                .setDenomId(denomId)
                .setAmount(amount)
                .setSender(account.getAddress())
                .build();
        List<GeneratedMessageV3> msgs = Collections.singletonList(msgBurnMT);
        return baseClient.buildAndSend(msgs, baseTx, account);
    }

    /*
    Temporarily unavailable  can use queryDenom or queryBalances
     */
    // Supply queries the total supply of a given denom or owner
    /*public long querySupply(String denomId,String owner){
        Channel channel = baseClient.getGrpcClient();
        QueryOuterClass.QuerySupplyRequest querySupplyRequest = QueryOuterClass.QuerySupplyRequest
                .newBuilder()
                .setDenomId(denomId)
                .setOwner(owner)
                .build();
        QueryOuterClass.QuerySupplyResponse querySupplyResponse = QueryGrpc.newBlockingStub(channel).supply(querySupplyRequest);
        return querySupplyResponse.getAmount();
    }*/

    // Denoms queries all the denoms
    public QueryOuterClass.QueryDenomsResponse queryDenoms(Pagination.PageRequest pageRequest) {
        ManagedChannel channel = baseClient.getGrpcClient();
        if (pageRequest == null) {
            pageRequest = Pagination.PageRequest.newBuilder()
                    .setOffset(0)
                    .setLimit(100)
                    .build();
        }
        QueryOuterClass.QueryDenomsRequest queryDenomsRequest = QueryOuterClass.QueryDenomsRequest
                .newBuilder()
                .setPagination(pageRequest)
                .build();
        QueryOuterClass.QueryDenomsResponse queryDenomsResponse = QueryGrpc.newBlockingStub(channel).denoms(queryDenomsRequest);
        channel.shutdown();
        return queryDenomsResponse;
    }

    // Denom queries the definition of a given denom ID
    public QueryOuterClass.QueryDenomResponse queryDenom(String denomId) {
        ManagedChannel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryDenomRequest queryDenomRequest = QueryOuterClass.QueryDenomRequest
                .newBuilder()
                .setDenomId(denomId)
                .build();
        QueryOuterClass.QueryDenomResponse queryDenomResponse = QueryGrpc.newBlockingStub(channel).denom(queryDenomRequest);
        channel.shutdown();
        return queryDenomResponse;
    }

    // MTSupply queries the total supply of given denom and mt ID
    public long queryMTSupply(String denomId, String mtId) {
        ManagedChannel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryMTSupplyRequest queryMTSupplyRequest = QueryOuterClass.QueryMTSupplyRequest
                .newBuilder()
                .setDenomId(denomId)
                .setMtId(mtId)
                .build();
        QueryOuterClass.QueryMTSupplyResponse queryMTSupplyResponse = QueryGrpc.newBlockingStub(channel).mTSupply(queryMTSupplyRequest);
        channel.shutdown();
        return queryMTSupplyResponse.getAmount();
    }

    // MTs queries all the MTs of a given denom ID
    public QueryOuterClass.QueryMTsResponse queryMTS(String denomId, Pagination.PageRequest pageRequest) {
        ManagedChannel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryMTsRequest.Builder queryMTsRequestBuilder = QueryOuterClass.QueryMTsRequest
                .newBuilder()
                .setDenomId(denomId);
        if (pageRequest == null) {
            pageRequest = Pagination.PageRequest.newBuilder()
                    .setOffset(0)
                    .setLimit(100)
                    .build();
        }
        queryMTsRequestBuilder.setPagination(pageRequest);
        QueryOuterClass.QueryMTsRequest queryMTsRequest = queryMTsRequestBuilder.build();
        QueryOuterClass.QueryMTsResponse queryMTsResponse = QueryGrpc.newBlockingStub(channel).mTs(queryMTsRequest);
        channel.shutdown();
        return queryMTsResponse;
    }

    // MT queries the MT of the given denom and mt ID
    public QueryOuterClass.QueryMTResponse querryMT(String denomId, String mtId) {
        ManagedChannel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryMTRequest queryMTRequest = QueryOuterClass.QueryMTRequest
                .newBuilder()
                .setDenomId(denomId)
                .setMtId(mtId)
                .build();
        QueryOuterClass.QueryMTResponse queryMTResponse = QueryGrpc.newBlockingStub(channel).mT(queryMTRequest);
        channel.shutdown();
        return queryMTResponse;
    }

    // Balances queries the MT balances of a specified owner
    public QueryOuterClass.QueryBalancesResponse queryBalances(String owner, String denomId, Pagination.PageRequest pageRequest) {
        ManagedChannel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryBalancesRequest.Builder queryBalancesRequestBuilder = QueryOuterClass.QueryBalancesRequest
                .newBuilder()
                .setOwner(owner)
                .setDenomId(denomId);
        if (pageRequest == null) {
            pageRequest = Pagination.PageRequest.newBuilder()
                    .setOffset(0)
                    .setLimit(100)
                    .build();
        }
        queryBalancesRequestBuilder.setPagination(pageRequest);
        QueryOuterClass.QueryBalancesRequest queryBalancesRequest = queryBalancesRequestBuilder.build();
        QueryOuterClass.QueryBalancesResponse queryBalancesResponse = QueryGrpc.newBlockingStub(channel).balances(queryBalancesRequest);
        channel.shutdown();
        return queryBalancesResponse;
    }

}
