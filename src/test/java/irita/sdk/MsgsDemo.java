package irita.sdk;

import com.google.protobuf.GeneratedMessageV3;
import irita.sdk.client.IritaClient;
import irita.sdk.config.ClientConfig;
import irita.sdk.config.OpbConfig;
import irita.sdk.constant.enums.BroadcastMode;
import irita.sdk.key.KeyManager;
import irita.sdk.key.KeyManagerFactory;
import irita.sdk.model.Account;
import irita.sdk.model.BaseTx;
import irita.sdk.model.Fee;
import irita.sdk.model.ResultTx;
import irita.sdk.module.nft.QueryCollectionResp;
import irita.sdk.module.nft.QueryDenomResp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import proto.cosmos.tx.v1beta1.TxOuterClass;
import proto.nft.Tx;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MsgsDemo {
    private IritaClient client;
    private BaseTx baseTx = new BaseTx(200000, new Fee("200000", "uirita"), BroadcastMode.Commit);

    @BeforeEach
    public void init() {
        String mnemonic = "opera vivid pride shallow brick crew found resist decade neck expect apple chalk belt sick author know try tank detail tree impact hand best";
        KeyManager km = KeyManagerFactory.createDefault();
        km.recover(mnemonic);

        String nodeUri = "http://47.100.192.234:26657";
        String grpcAddr = "47.100.192.234:9090";
        String chainId = "testing";

        ClientConfig clientConfig = new ClientConfig(nodeUri, grpcAddr, chainId);
        OpbConfig opbConfig = null;

        client = new IritaClient(clientConfig, opbConfig, km);
        assertEquals("iaa1ytemz2xqq2s73ut3ys8mcd6zca2564a5lfhtm3", km.getCurrentKeyInfo().getAddress());
    }

    @Test
    @Disabled
    public void testSendMsgs() throws IOException {
        List<QueryDenomResp> queryDenomResps = client.getNftClient().queryDenoms(null);
        int size = queryDenomResps.size();
        String denomID = "testdenom" + new Random().nextInt(1000);
        String denomName = "test_name";
        String schema = "no shcema";

        Account account = client.getBaseClient().queryAccount(baseTx);

        /**
         * issue denom (build 、sign、broadcast)
         */
        //build msg
        Tx.MsgIssueDenom msg = Tx.MsgIssueDenom
                .newBuilder()
                .setId(denomID)
                .setName(denomName)
                .setSchema(schema)
                .setSender(account.getAddress())
                .build();
        List<GeneratedMessageV3> issueDenomMsgs = Collections.singletonList(msg);
        TxOuterClass.TxBody txBody = client.getBaseClient().getTxEngine().buildTxBodyWithMemo(issueDenomMsgs, "example memo");
        byte[] bytes = txBody.toByteArray();
        //sign
        TxOuterClass.TxBody txBodyFromBytes = TxOuterClass.TxBody.parseFrom(bytes);
        TxOuterClass.Tx signTx = client.getBaseClient().getTxEngine().signTx(txBodyFromBytes, baseTx, account);
        byte[] signTxBytes = signTx.toByteArray();
        //broadcast
        ResultTx resultTx = client.getBaseClient().getRpcClient().broadcastTx(signTxBytes, baseTx.getMode());
        assertNotNull(resultTx);
        queryDenomResps = client.getNftClient().queryDenoms(null);
        assertEquals(size + 1, queryDenomResps.size());

        /**
         * mint nfts in one tx
         */
        String nftID1 = "test1";
        String nftID2 = "test2";
        String nftName = "test_name";
        String uri = "https://www.baidu.com";
        String data = "any data";
        //nft1
        Tx.MsgMintNFT msg1 = Tx.MsgMintNFT
                .newBuilder()
                .setDenomId(denomID)
                .setId(nftID1)
                .setName(nftName)
                .setUri(uri)
                .setData(data)
                .setSender(account.getAddress())
                .setRecipient(account.getAddress())
                .build();
        //nft2
        Tx.MsgMintNFT msg2 = Tx.MsgMintNFT
                .newBuilder()
                .setDenomId(denomID)
                .setId(nftID2)
                .setName(nftName)
                .setUri(uri)
                .setData(data)
                .setSender(account.getAddress())
                .setRecipient(account.getAddress())
                .build();
        List<GeneratedMessageV3> mintNFTMsgs = new ArrayList<>();
        mintNFTMsgs.add(msg1);
        mintNFTMsgs.add(msg2);
        //mintNFTMsgs.add(msgN)
        account = client.getBaseClient().queryAccount(baseTx);
        resultTx = client.getBaseClient().buildAndSend(mintNFTMsgs, baseTx, account);
        assertNotNull(resultTx);
        QueryCollectionResp collection = client.getNftClient().queryCollection(denomID, null);
        assertNotNull(collection);
        assertEquals(2, collection.getNfts().size());
    }
}
