package irita.sdk.module.nft;


import io.grpc.Channel;
import irita.sdk.client.BaseClient;
import irita.sdk.model.Account;
import irita.sdk.model.BaseTx;
import irita.sdk.model.ResultTx;
import irita.sdk.util.AddressUtils;
import org.apache.commons.lang3.StringUtils;
import proto.cosmos.base.query.v1beta1.Pagination;
import proto.nft.Nft;
import proto.nft.QueryGrpc;
import proto.nft.QueryOuterClass;
import proto.nft.Tx;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NftClient {
    private final BaseClient baseClient;
    private static final String DO_NOT_MODIFY = "[do-not-modify]";

    public NftClient(BaseClient baseClient) {
        this.baseClient = baseClient;
    }

    public ResultTx issueDenom(IssueDenomRequest req, BaseTx baseTx) throws IOException {
        Account account = baseClient.queryAccount();
        Tx.MsgIssueDenom msg = Tx.MsgIssueDenom
                .newBuilder()
                .setId(req.getId())
                .setName(req.getName())
                .setSchema(req.getSchema())
                .setSender(account.getAddress())
                .build();
        java.util.List<com.google.protobuf.GeneratedMessageV3> msgs = new java.util.ArrayList<>();
        msgs.add(msg);
        return baseClient.buildAndSend(msgs, baseTx, account);
    }

    public ResultTx mintNft(MintNFTRequest req, BaseTx baseTx) throws IOException {
        Tx.MsgMintNFT.Builder builder = Tx.MsgMintNFT
                .newBuilder()
                .setDenomId(req.getDenom())
                .setId(req.getId())
                .setName(req.getName())
                .setUri(req.getUri())
                .setData(req.getData())
                .setSender(baseClient.getCurrentAddr());

        if (StringUtils.isNotEmpty(req.getRecipient())) {
            String recipient = req.getRecipient();
            AddressUtils.validAddress(recipient);
            builder.setRecipient(recipient);
        } else {
            builder.setRecipient(baseClient.getCurrentAddr());
        }
        Tx.MsgMintNFT msg = builder.build();
        java.util.List<com.google.protobuf.GeneratedMessageV3> msgs = new java.util.ArrayList<>();
        msgs.add(msg);
        return baseClient.buildAndSend(msgs, baseTx);
    }

    public ResultTx editNft(EditNFTRequest req, BaseTx baseTx) throws IOException {
        if (StringUtils.isEmpty(req.getData())) {
            req.setData(DO_NOT_MODIFY);
        }
        if (StringUtils.isEmpty(req.getUri())) {
            req.setUri(DO_NOT_MODIFY);
        }
        if (StringUtils.isEmpty(req.getName())) {
            req.setName(DO_NOT_MODIFY);
        }

        Tx.MsgEditNFT msg = Tx.MsgEditNFT
                .newBuilder()
                .setDenomId(req.getDenom())
                .setId(req.getId())
                .setName(req.getName())
                .setUri(req.getUri())
                .setData(req.getData())
                .setSender(baseClient.getCurrentAddr())
                .build();
        java.util.List<com.google.protobuf.GeneratedMessageV3> msgs = new java.util.ArrayList<>();
        msgs.add(msg);
        return baseClient.buildAndSend(msgs, baseTx);
    }

    public ResultTx transferNFt(TransferNFTRequest req, BaseTx baseTx) throws IOException {
        if (StringUtils.isEmpty(req.getData())) {
            req.setData(DO_NOT_MODIFY);
        }
        if (StringUtils.isEmpty(req.getUri())) {
            req.setUri(DO_NOT_MODIFY);
        }
        if (StringUtils.isEmpty(req.getName())) {
            req.setName(DO_NOT_MODIFY);
        }

        Tx.MsgTransferNFT.Builder builder = Tx.MsgTransferNFT
                .newBuilder()
                .setDenomId(req.getDenom())
                .setId(req.getId())
                .setUri(req.getUri())
                .setData(req.getData())
                .setName(req.getName())
                .setSender(baseClient.getCurrentAddr());

        if (StringUtils.isNotEmpty(req.getRecipient())) {
            String recipient = req.getRecipient();
            AddressUtils.validAddress(recipient);
            builder.setRecipient(recipient);
        }
        Tx.MsgTransferNFT msg = builder.build();
        java.util.List<com.google.protobuf.GeneratedMessageV3> msgs = new java.util.ArrayList<>();
        msgs.add(msg);
        return baseClient.buildAndSend(msgs, baseTx);
    }

    public ResultTx burnNft(BurnNFTRequest req, BaseTx baseTx) throws IOException {
        Tx.MsgBurnNFT msg = Tx.MsgBurnNFT
                .newBuilder()
                .setDenomId(req.getDenom())
                .setId(req.getId())
                .setSender(baseClient.getCurrentAddr())
                .build();
        java.util.List<com.google.protobuf.GeneratedMessageV3> msgs = new java.util.ArrayList<>();
        msgs.add(msg);
        return baseClient.buildAndSend(msgs, baseTx);
    }


    public long querySupply(String denomID, String owner) {
        Channel channel = baseClient.getGrpcClient();
        QueryOuterClass.QuerySupplyRequest req = QueryOuterClass.QuerySupplyRequest
                .newBuilder()
                .setDenomId(denomID)
                .setOwner(owner)
                .build();

        QueryOuterClass.QuerySupplyResponse resp = QueryGrpc.newBlockingStub(channel).supply(req);
        return resp.getAmount();
    }

    public QueryOwnerResp queryOwner(String denomID, String owner) {
        Channel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryOwnerRequest req = QueryOuterClass.QueryOwnerRequest
                .newBuilder()
                .setDenomId(denomID)
                .setOwner(owner)
                .build();

        QueryOuterClass.QueryOwnerResponse resp = QueryGrpc.newBlockingStub(channel).owner(req);
        return Convert.toQueryOwnerResp(resp.getOwner());
    }

    public QueryCollectionResp queryCollection(String denomID, Pagination.PageRequest page) {
        Channel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryCollectionRequest.Builder builder = QueryOuterClass.QueryCollectionRequest
                .newBuilder()
                .setDenomId(denomID);
        if (page != null) {
            builder.setPagination(page);
        }
        QueryOuterClass.QueryCollectionRequest req = builder.build();

        QueryOuterClass.QueryCollectionResponse resp = QueryGrpc.newBlockingStub(channel).collection(req);
        return Convert.toQueryCollectionResp(resp.getCollection());
    }

    public QueryDenomResp queryDenom(String denomID) {
        Channel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryDenomRequest req = QueryOuterClass.QueryDenomRequest
                .newBuilder()
                .setDenomId(denomID)
                .build();
        QueryOuterClass.QueryDenomResponse resp = QueryGrpc.newBlockingStub(channel).denom(req);
        return Convert.toQueryDenomResp(resp.getDenom());
    }

    public List<QueryDenomResp> queryDenoms(Pagination.PageRequest page) {
        Channel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryDenomsRequest.Builder builder = QueryOuterClass.QueryDenomsRequest.newBuilder();
        if (page != null) {
            builder.setPagination(page);
        }
        QueryOuterClass.QueryDenomsRequest req = builder.build();

        QueryOuterClass.QueryDenomsResponse resp = QueryGrpc.newBlockingStub(channel).denoms(req);
        return Convert.toListQueryDenomResp(resp.getDenomsList());
    }

    public QueryNFTResp queryNFT(String denomID, String nftID) {
        Channel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryNFTRequest req = QueryOuterClass.QueryNFTRequest
                .newBuilder()
                .setDenomId(denomID)
                .setTokenId(nftID)
                .build();

        QueryOuterClass.QueryNFTResponse resp = QueryGrpc.newBlockingStub(channel).nFT(req);
        return Convert.toQueryNFTResp(resp.getNft());
    }

    private static class Convert {
        public static QueryOwnerResp toQueryOwnerResp(Nft.Owner owner) {
            String address = owner.getAddress();
            List<Nft.IDCollection> idCollectionsList = owner.getIdCollectionsList();

            List<IDC> idcs = new ArrayList<>();
            for (Nft.IDCollection idc : idCollectionsList) {
                String denomId = idc.getDenomId();
                List<String> tokenIDs = new ArrayList<>(idc.getTokenIdsList());
                idcs.add(new IDC(denomId, tokenIDs));
            }

            QueryOwnerResp res = new QueryOwnerResp();
            res.setAddress(address);
            res.setIdcs(idcs);
            return res;
        }

        public static QueryCollectionResp toQueryCollectionResp(Nft.Collection collection) {
            Nft.Denom denom = collection.getDenom();
            List<Nft.BaseNFT> nftList = collection.getNftsList();

            List<QueryNFTResp> nfts = new ArrayList<>();
            for (Nft.BaseNFT baseNFT : nftList) {
                QueryNFTResp nftResp = toQueryNFTResp(baseNFT);
                nfts.add(nftResp);
            }

            QueryCollectionResp res = new QueryCollectionResp();
            res.setDenom(new QueryDenomResp(denom.getId(), denom.getName(), denom.getSchema(), denom.getCreator()));
            res.setNfts(nfts);
            return res;
        }

        public static QueryDenomResp toQueryDenomResp(Nft.Denom denom) {
            QueryDenomResp res = new QueryDenomResp();
            res.setId(denom.getId());
            res.setName(denom.getName());
            res.setSchema(denom.getSchema());
            res.setCreator(denom.getCreator());
            return res;
        }


        public static List<QueryDenomResp> toListQueryDenomResp(List<Nft.Denom> denomsList) {
            List<QueryDenomResp> res = new ArrayList<>();
            for (Nft.Denom v : denomsList) {
                res.add(toQueryDenomResp(v));
            }
            return res;
        }

        public static QueryNFTResp toQueryNFTResp(Nft.BaseNFT baseNFT) {
            QueryNFTResp res = new QueryNFTResp();
            res.setId(baseNFT.getId());
            res.setName(baseNFT.getName());
            res.setUri(baseNFT.getUri());
            res.setData(baseNFT.getData());
            res.setOwner(baseNFT.getOwner());
            return res;
        }
    }
}

