package irita.sdk;

import irita.sdk.client.IritaClient;
import irita.sdk.config.ClientConfig;
import irita.sdk.config.OpbConfig;
import irita.sdk.constant.enums.BroadcastMode;
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
    private BaseTx baseTx = new BaseTx(200000, new Fee("300000", "uirita"), BroadcastMode.Commit);

    @BeforeEach
    public void init() {
        String mnemonic = "opera vivid pride shallow brick crew found resist decade neck expect apple chalk belt sick author know try tank detail tree impact hand best";
        km = KeyManagerFactory.createDefault();
        km.recover(mnemonic);

        String nodeUri = "http://101.132.138.109:26657";
        String grpcAddr = "http://101.132.138.109:9090";
        String chainId = "test";
        ClientConfig clientConfig = new ClientConfig(nodeUri, grpcAddr, chainId);
//        OpbConfig opbConfig = new OpbConfig("", "", "");
        OpbConfig opbConfig = null;

        IritaClient client = new IritaClient(clientConfig, opbConfig, km);
        nftClient = client.getNftClient();
        assertEquals("iaa1ytemz2xqq2s73ut3ys8mcd6zca2564a5lfhtm3", km.getAddr());
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
        assertEquals(km.getAddr(), denom.getCreator());

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
                .setRecipient(km.getAddr());
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
        assertEquals(km.getAddr(), nft.getOwner());

        long supply = nftClient.querySupply(denomID, km.getAddr());
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
        assertEquals(km.getAddr(), nfts.getDenom().getCreator());
        assertTrue(nfts.getNfts().size() > 0);

        QueryOwnerResp owner = nftClient.queryOwner(denomID, km.getAddr());
        assertEquals(km.getAddr(), owner.getAddress());

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
