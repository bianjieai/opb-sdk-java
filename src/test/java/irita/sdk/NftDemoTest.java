package irita.sdk;

import irita.sdk.client.IritaClient;
import irita.sdk.config.ClientConfig;
import irita.sdk.config.OpbConfig;
import irita.sdk.constant.enums.BroadcastMode;
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

import java.io.IOException;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class NftDemoTest {
    private KeyManager km;
    private NftClient nftClient;
    //baseTx 的 denom 可能会需要根据不同环境的链进行修改
    private BaseTx baseTx = new BaseTx(200000, new Fee("300000", "upoint"), BroadcastMode.Commit);

    @BeforeEach
    public void init() {
        //换成自己链上地址的助记词
        String mnemonic = "code tattoo laundry ice chuckle priority immune rebuild dream prevent sibling inspire banner black shock page person brush oxygen sorry dilemma raccoon estate funny";
        km = KeyManagerFactory.createDefault();
        km.recover(mnemonic);

        String nodeUri = "http://101.132.67.8:26657";
        String grpcAddr = "101.132.67.8:9090";
//        String nodeUri = "https://opbningxia.bsngate.com:18602/api/<your projectID>/rpc";
//        String grpcAddr = "opbningxia.bsngate.com:18603";
        String chainId = "wenchangchain";
        ClientConfig clientConfig = new ClientConfig(nodeUri, grpcAddr, chainId);
        OpbConfig opbConfig = null;
        //测试环境 opbConfig = null，正式环境需要使用自己的 projectID 和 projectKey
//        OpbConfig opbConfig = new OpbConfig("your projectID", "your projectKey", "");

        IritaClient client = new IritaClient(clientConfig, opbConfig, km);
        nftClient = client.getNftClient();
        assertEquals("iaa18e23vvukxgatgzm4fgqkdggxecurkf39ytw7ue", km.getCurrentKeyInfo().getAddress());
    }

    @Test
    @Disabled
    public void testNft() throws IOException {
        String denomID = "testdenom" + new Random().nextInt(1000);
        String denomName = "test_name";
        String schema = "no shcema";

        //issue denom
        IssueDenomRequest req = new IssueDenomRequest()
                .setId(denomID)
                .setName(denomName)
                .setSchema(schema);
        ResultTx resultTx = nftClient.issueDenom(req, baseTx);
        assertNotNull(resultTx.getResult().getHash());

        //query denom
        QueryDenomResp denom = nftClient.queryDenom(denomID);
        assertEquals(denomID, denom.getId());
        assertEquals(denomName, denom.getName());
        assertEquals(schema, denom.getSchema());

        KeyInfo keyInfo = km.getCurrentKeyInfo();
        assertEquals(keyInfo.getAddress(), denom.getCreator());

        //mint nft
        String nftID1 = "test1" + new Random().nextInt(1000);
        String nftID2 = "test2" + new Random().nextInt(1000);
        String nftName = "test_name";
        String uri = "https://www.baidu.com";
        String data = "any data";
        MintNFTRequest mintReq = new MintNFTRequest()
                .setDenom(denomID)
                .setId(nftID1)
                .setName(nftName)
                .setUri(uri)
                .setData(data)
                .setRecipient(keyInfo.getAddress());
        //mint nft1
        resultTx = nftClient.mintNft(mintReq, baseTx);
        assertNotNull(resultTx.getResult().getHash());
        //mint nft2
        mintReq.setId(nftID2);
        resultTx = nftClient.mintNft(mintReq, baseTx);
        assertNotNull(resultTx.getResult().getHash());

        //query nft1
        QueryNFTResp nft = nftClient.queryNFT(denomID, nftID1);
        assertEquals(nftID1, nft.getId());
        assertEquals(nftName, nft.getName());
        assertEquals(uri, nft.getUri());
        assertEquals(data, nft.getData());
        assertEquals(keyInfo.getAddress(), nft.getOwner());

        //transfer nft1
        String reci = "iaa14s9hekvzhtf3y3962zn3vzv45k0ay7mguyqhrl";
        TransferNFTRequest transferReq = new TransferNFTRequest()
                .setDenom(denomID)
                .setId(nftID1)
                .setRecipient(reci);
        resultTx = nftClient.transferNFt(transferReq, baseTx);
        assertNotNull(resultTx.getResult().getHash());

        //query nft1
        nft = nftClient.queryNFT(denomID, nftID1);
        assertEquals(reci, nft.getOwner());

        //query collection
        QueryCollectionResp queryCollectionResp = nftClient.queryCollection(denomID, null);
        assertNotNull(queryCollectionResp);
        assertEquals(queryCollectionResp.getNfts().size(), 2);

        //burn nft2
        BurnNFTRequest burnNFTReq = new BurnNFTRequest()
                .setDenom(denomID)
                .setId(nftID2);
        resultTx = nftClient.burnNft(burnNFTReq, baseTx);
        assertNotNull(resultTx.getResult().getHash());

        //query collection
        queryCollectionResp = nftClient.queryCollection(denomID, null);
        assertNotNull(queryCollectionResp);
        assertEquals(queryCollectionResp.getNfts().size(), 1);

        //query denoms
        List<QueryDenomResp> queryDenomResps = nftClient.queryDenoms(null);
        assertNotNull(queryDenomResps);
        //query owner
        QueryOwnerResp queryOwnerResp = nftClient.queryOwner(denomID, reci);
        assertNotNull(queryOwnerResp);
        queryOwnerResp = nftClient.queryOwner("", reci);
        assertNotNull(queryOwnerResp);
        //query supply
        long supply = nftClient.querySupply(denomID, reci);
        assertEquals(supply, 1);
    }
}
