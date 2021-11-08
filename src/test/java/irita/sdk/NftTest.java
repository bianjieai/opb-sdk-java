package irita.sdk;

import irita.sdk.client.IritaClient;
import irita.sdk.config.ClientConfig;
import irita.sdk.config.OpbConfig;
import irita.sdk.constant.enums.BroadcastMode;
import irita.sdk.key.AlgoEnum;
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

import static org.junit.jupiter.api.Assertions.*;

public class NftTest {
    private KeyManager km;
    private NftClient nftClient;
    private String name1 = "test_name1";
    private String password1 = "test_password";
    private String name2 = "test_name2";
    private String password2 = "test_password";
    private String senderName = name1;
    private BaseTx baseTx = new BaseTx(senderName, password1, 200000, new Fee("300000", "uiris"), BroadcastMode.Commit);

    @BeforeEach
    public void init() {
//        String mnemonic = "code tattoo laundry ice chuckle priority immune rebuild dream prevent sibling inspire banner black shock page person brush oxygen sorry dilemma raccoon estate funny";

        String mnemonic1 = "recycle now echo fun balance sight clown memory coach pistol arctic soul dentist novel illness share such utility delay sing reunion used glow muffin";
        String mnemonic2 = "harsh key can lunch elephant movie toe when alarm slogan suffer secret chaos sunny vehicle rude obey help edge embrace excuse elder arrest emotion";
//        km = KeyManagerFactory.createDefault();
        km = KeyManagerFactory.createKeyManger(AlgoEnum.SECP256K1);
        km.recover(name1, password1, mnemonic1);
        km.recover(name2, password2, mnemonic2);

        String nodeUri = "http://101.132.67.8:16657";
        String grpcAddr = "http://101.132.67.8:19090";
        String chainId = "irishub";
        ClientConfig clientConfig = new ClientConfig(nodeUri, grpcAddr, chainId);
//        OpbConfig opbConfig = new OpbConfig("", "", "");
        OpbConfig opbConfig = null;

        IritaClient client = new IritaClient(clientConfig, opbConfig, km);
        nftClient = client.getNftClient();
        assertEquals("iaa1j2juc02z52c869tu7t8vy3j98r4u0vn88us5jm", km.getKeyDAO(name1).getAddress());
        assertEquals("iaa1l4tmtr5qvcqhcg8t4xn3zg5fwumssr7x3akmzd", km.getKeyDAO(name2).getAddress());
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
                .setSchema(schema);
        ResultTx resultTx = nftClient.issueDenom(req, baseTx);
        assertNotNull(resultTx.getResult().getHash());

        QueryDenomResp denom = nftClient.queryDenom(denomID);
        assertEquals(denomID, denom.getId());
        assertEquals(denomName, denom.getName());
        assertEquals(schema, denom.getSchema());
        assertEquals(km.getKeyDAO(senderName).getAddress(), denom.getCreator());

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
                .setRecipient(km.getKeyDAO(senderName).getAddress());
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
        assertEquals(km.getKeyDAO(senderName).getAddress(), nft.getOwner());

        long supply = nftClient.querySupply(denomID, km.getKeyDAO(senderName).getAddress());
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
        assertEquals(km.getKeyDAO(senderName).getAddress(), nfts.getDenom().getCreator());
        assertTrue(nfts.getNfts().size() > 0);

        QueryOwnerResp owner = nftClient.queryOwner(denomID, km.getKeyDAO(senderName).getAddress());
        assertEquals(km.getKeyDAO(senderName).getAddress(), owner.getAddress());

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
}
