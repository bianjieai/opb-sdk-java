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
import irita.sdk.module.nft.MintNFTRequest;
import irita.sdk.module.tibc.TibcClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import proto.tibc.core.packet.v1.QueryOuterClass;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TibcTest {
    private KeyManager km;
    private TibcClient tibcClient;
    private IritaClient client;
    private String name = "test_name";
    private String password = "test_password";
    private BaseTx baseTx = new BaseTx(name, password, 200000, new Fee("300000", "stake"), BroadcastMode.Commit);

    @BeforeEach
    public void init() {
        String mnemonic = "genre stamp head slam drop chuckle patrol mushroom staff range bomb accuse donor bounce main ancient home guide account floor label trigger wife doctor";
        km = KeyManagerFactory.createKeyManger(AlgoEnum.SECP256K1);
        km.recover(name, password, mnemonic);
//        String keystore="-----BEGIN TENDERMINT PRIVATE KEY-----\n"+
//                "salt: 183EF9B57DEF8EF8C3AD9D21DE672E1B\n"+
//                "type: sm2\n"+
//                "kdf: bcrypt\n"+
//                "\n"+
//                "cpreEPwi0X3yIdsAIf94fR6s8L1TnDAQd/r4ifID6GmQX5a+4ehMmnTp2JjDpUe5\n"+
//                "kpgRI7CzF0DjKpPLvY9V9ZSXJFN42LHWscxqQ1E=\n"+
//                "=nJvd\n"+
//                "-----END TENDERMINT PRIVATE KEY-----";
//
//        InputStream input=new ByteArrayInputStream(keystore.getBytes(StandardCharsets.UTF_8));
//        km=KeyManagerFactory.createDefault();
//        km.recover(input,"12345678");
        String nodeUri = "http://localhost:46657";
        String grpcAddr = "http://localhost:9092";
        String chainId = "iris-test2";
        ClientConfig clientConfig = new ClientConfig(nodeUri, grpcAddr, chainId);
        OpbConfig opbConfig = null;

        client = new IritaClient(clientConfig, opbConfig, km);
        tibcClient = client.getTibcClient();
        assertEquals("iaa1qvek4n2awq3zgpwqtr5tcp8mj6u2hpqf0r4x0l", km.getKeyDAO(name).getAddress());
    }

    @Test
    @Disabled
    public void testNftTransfer() throws IOException {
        String class_ = "denom01";
        String id = "nft28";
        String destName = "iris-test1";
        String rec = "iaa14u80vaseg99lxej9cvlmfz96xe8mvv6p6g469p";

        ResultTx resultTx = tibcClient.nftTransfer(class_, id, rec, destName, "", baseTx);
        assertNotNull(resultTx.getResult().getHash());
        System.out.println(resultTx.getResult().getHash());

    }

    @Test
    @Disabled
    public void testPacketCommitment() throws IOException {
        String destChain = "iris-test1";
        String sourceChain = "iris-test2";
        long sequence = 2;

        QueryOuterClass.QueryPacketCommitmentResponse commitment = tibcClient.packetCommitment(destChain, sourceChain, sequence);
        assertNotNull(commitment);
    }
}
