package irita.sdk;

import io.grpc.ManagedChannel;
import irita.sdk.client.IritaClient;
import irita.sdk.config.ClientConfig;
import irita.sdk.config.OpbConfig;
import irita.sdk.constant.enums.BroadcastMode;
import irita.sdk.key.AlgoEnum;
import irita.sdk.key.KeyInfo;
import irita.sdk.key.KeyManager;
import irita.sdk.key.KeyManagerFactory;
import irita.sdk.model.BaseTx;
import irita.sdk.model.Fee;
import irita.sdk.model.ResultTx;
import irita.sdk.module.nft.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import proto.cosmos.base.query.v1beta1.Pagination;
import proto.nft.QueryGrpc;
import proto.nft.QueryOuterClass;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.Properties;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class NftTest extends ConfigTest {
    private KeyManager km;
    private NftClient nftClient;
    private IritaClient client;
    private final BaseTx baseTx = new BaseTx(400000, new Fee("400000", "ugas"), BroadcastMode.Commit);

    @BeforeEach
    public void init() {
        //更换为自己链上地址的助记词
        String mnemonic = "open salt kit ensure cannon photo flock tragic judge east canal depart verb glimpse zebra fossil during organ chair useful unaware file surround own";
        km = KeyManagerFactory.createKeyManger(AlgoEnum.ETH_SECP256K1);
        km.recover(mnemonic);

        //连接测试网（连接主网请参考README.md）
        String nodeUri = "http://127.0.0.1:26657";
        String grpcAddr = "127.0.0.1:9090";
        String chainId = "2022";
        ClientConfig clientConfig = new ClientConfig(nodeUri, grpcAddr, chainId);
        //测试网为null，主网请参考README.md
        OpbConfig opbConfig = null;

        client = new IritaClient(clientConfig, opbConfig, km);
        nftClient = client.getNftClient();
        //判断由助记词恢复的是否为预期的链上地址
        assertEquals("iaa1w4yynxjyqyjkqmap4ug99l40zzhexykxmqf0mt", km.getCurrentKeyInfo().getAddress());
    }

    @Test
    @Disabled
    public void testNft() throws IOException {
        String denomID = "denomid" + new Random().nextInt(1000);
        String denomName = "test_name" + new Random().nextInt(1000);
        String schema = "no shcema";

        IssueDenomRequest req = new IssueDenomRequest()
                .setId(denomID)
                .setName(denomName)
                .setSchema(schema)
                .setData("data")
                .setUri("www.wcchain.com")
                .setSymbol("aaa");
        ResultTx resultTx = nftClient.issueDenom(req, baseTx);
        assertNotNull(resultTx.getResult().getHash());

        QueryDenomResp denom = nftClient.queryDenom(denomID);
        assertEquals(denomID, denom.getId());
        assertEquals(denomName, denom.getName());
        assertEquals(schema, denom.getSchema());

        KeyInfo keyInfo = km.getCurrentKeyInfo();
        assertEquals(keyInfo.getAddress(), denom.getCreator());

        String nftID = "nftid08";
        String nftName = "你好呀";
        String uri = "https://www.baidu.com";
        String data = "any data";

        MintNFTRequest mintReq = new MintNFTRequest()
                .setDenom(denomID)
                .setId(nftID)
                .setName(nftName)
                .setUri(uri)
                .setData(data)
                .setRecipient(keyInfo.getAddress());
        resultTx = nftClient.mintNft(mintReq, baseTx);
        assertNotNull(resultTx.getResult().getHash());

        String newName = "new_name";
        String newUri = "http://xx.com";
        String newData = "new_data";
        EditNFTRequest editReq = new EditNFTRequest()
                .setDenom(denomID)
                .setName(newName)
                .setId(nftID)
                .setUri(newUri)
                .setData(newData);
        resultTx = nftClient.editNft(editReq, baseTx);
        assertNotNull(resultTx.getResult().getHash());

        QueryNFTResp nft = nftClient.queryNFT(denomID, nftID);
        assertEquals(nftID, nft.getId());
        assertEquals(newUri, nft.getUri());
        assertEquals(newData, nft.getData());
        assertEquals(keyInfo.getAddress(), nft.getOwner());

        long supply = nftClient.querySupply(denomID, keyInfo.getAddress());
        assertEquals(supply, 1);

        String reci = "iaa1r49m366kaexmvrlppqqeyr8ykqq248g0d4qra4";
        TransferNFTRequest transferReq = new TransferNFTRequest()
                .setDenom(denomID)
                .setId(nftID)
                .setRecipient(reci);

        resultTx = nftClient.transferNFt(transferReq, baseTx);
        assertNotNull(resultTx.getResult().getHash());
        nft = nftClient.queryNFT(denomID, nftID);
        assertEquals(reci, nft.getOwner());

        List<QueryDenomResp> denoms = nftClient.queryDenoms(null);
        assertTrue(denoms.size() > 0);

        QueryCollectionResp nfts = nftClient.queryCollection(denomID, null);
        assertEquals(denomID, nfts.getDenom().getId());
        assertEquals(denomName, nfts.getDenom().getName());
        assertEquals(keyInfo.getAddress(), nfts.getDenom().getCreator());
        assertTrue(nfts.getNfts().size() > 0);

        QueryOwnerResp owner = nftClient.queryOwner(denomID, keyInfo.getAddress(), null);
        assertEquals(keyInfo.getAddress(), owner.getAddress());

//        BurnNFTRequest burnNFTReq = new BurnNFTRequest()
//                .setDenom(denomID)
//                .setId(nftID);
//        resultTx = nftClient.burnNft(burnNFTReq, baseTx);
//        assertNotNull(resultTx.getResult().getHash());
//        try {
//            nft = nftClient.queryNFT(denomID, nftID);
//        } catch (StatusRuntimeException e) {
//            if (!e.getMessage().contains("invalid NFT")) {
//                throw new IritaSDKException("unknown queryNft error");
//            }
//        }
    }

    /*@Test
    public void test1() throws IOException {
        KeyInfo keyInfo = km.getCurrentKeyInfo();
        for (int i = 0;i<100;i++){
            String nftID = "nftiduuccxx08"+i;
            String nftName = "你好呀";
            String uri = "https://www.baidu.com";
            String data = "any data";
            MintNFTRequest mintReq = new MintNFTRequest()
                    .setDenom("denomid285")
                    .setId(nftID)
                    .setName(nftName)
                    .setUri(uri)
                    .setData(data)
                    .setRecipient(keyInfo.getAddress());
            ResultTx resultTx = nftClient.mintNft(mintReq, baseTx);
            System.out.println("code:"+resultTx.getCode()+":+"+resultTx.getResult().getHash());
        }

    }*/

    //denomid285
    /*@Test
    public void testQueryOwner(){

        *//*Pagination.PageRequest pageRequest = Pagination.PageRequest.newBuilder()
                .setOffset(10)
                .setLimit(10)
                .build();
        QueryOwnerResp queryOwnerResp = nftClient.queryOwner("huyuanyuan", "iaa126yqsarr8ccgzfa55vvn420kh22rep50xcjy23", pageRequest);
        System.out.println(queryOwnerResp.getIdcs().size());*//*
        KeyInfo keyInfo = km.getCurrentKeyInfo();
        ManagedChannel channel = client.getBaseClient().getGrpcClient();
        QueryOuterClass.QueryOwnerRequest.Builder builder = QueryOuterClass.QueryOwnerRequest
                .newBuilder()
                .setDenomId(Optional.ofNullable("denomid285").orElse(""))
                .setOwner(keyInfo.getAddress());
        Pagination.PageRequest pageRequest = Pagination.PageRequest.newBuilder()
                //.setKey(ByteString.copyFromUtf8("huyuanyuan10352"))
                .setOffset(5)
                .setLimit(5)
                .build();
        builder.setPagination(pageRequest);
        QueryOuterClass.QueryOwnerRequest req = builder.build();
        QueryOuterClass.QueryOwnerResponse resp = QueryGrpc.newBlockingStub(channel).owner(req);
        System.out.println(resp.getOwner().getIdCollectionsList());
    }*/
}
