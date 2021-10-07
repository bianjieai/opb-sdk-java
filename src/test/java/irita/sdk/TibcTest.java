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
import irita.sdk.module.tibc.TibcClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class TibcTest {
    private KeyManager km;
    private TibcClient tibcClient;
    private BaseTx baseTx = new BaseTx(200000, new Fee("300000", "uirita"), BroadcastMode.Commit);

    private IritaClient client;

    @BeforeEach
    public void init() {
        String mnemonic = "harsh key can lunch elephant movie toe when alarm slogan suffer secret chaos sunny vehicle rude obey help edge embrace excuse elder arrest emotion";
        km = KeyManagerFactory.createDefault();
        km.recover(mnemonic);

        String nodeUri = "http://localhost:46657";
        String grpcAddr = "http://localhost:9092";
        String chainId = "irishub-testnet";
        ClientConfig clientConfig = new ClientConfig(nodeUri, grpcAddr, chainId);
//        OpbConfig opbConfig = new OpbConfig("", "", "");
        OpbConfig opbConfig = null;

        client = new IritaClient(clientConfig, opbConfig, km);
        tibcClient = client.getTibcClient();
        System.out.println(km.getAddr());
//        assertEquals("iaa1akclvtw0pn34qck8y0jm50kheyu2njtzpj4gte", km.getAddr());
    }

    @Test
    @Disabled
    public void testNft() throws IOException {
        
        String class_ = "denom001";
        String id = "nft111";
        String destName = "eth_testnet";
        String rec = "0x5fbca2ed2040924f65133A25194eeEBd45864f24";

        ResultTx resultTx = tibcClient.nftTransfer(class_, id, rec, destName, "", baseTx);
        assertNotNull(resultTx.getResult().getHash());

    }
}
