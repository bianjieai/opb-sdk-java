package irita.sdk;

import com.google.protobuf.GeneratedMessageV3;
import irita.sdk.client.BaseClient;
import irita.sdk.client.IritaClient;
import irita.sdk.config.ClientConfig;
import irita.sdk.config.OpbConfig;
import irita.sdk.constant.enums.BroadcastMode;
import irita.sdk.key.KeyManager;
import irita.sdk.key.KeyManagerFactory;
import irita.sdk.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import proto.nft.Tx;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class ClientTest {
    private IritaClient client;

    @BeforeEach
    public void init() {
        String mnemonic = "opera vivid pride shallow brick crew found resist decade neck expect apple chalk belt sick author know try tank detail tree impact hand best";
        KeyManager km = KeyManagerFactory.createDefault();
        km.recover(mnemonic);

        String nodeUri = "http://101.132.67.8:26657";
        String grpcAddr = "http://101.132.67.8:9090";
        String chainId = "wenchangchain";
        ClientConfig clientConfig = new ClientConfig(nodeUri, grpcAddr, chainId);
//        OpbConfig opbConfig = new OpbConfig("", "", "");
        OpbConfig opbConfig = null;

        client = new IritaClient(clientConfig, opbConfig, km);
        assertEquals("iaa1ytemz2xqq2s73ut3ys8mcd6zca2564a5lfhtm3", km.getAddr());
    }

    @Test
    @Disabled
    public void queryAccount() {
        String addr = "iaa1ytemz2xqq2s73ut3ys8mcd6zca2564a5lfhtm3";
        Account account = client.getBaseClient().queryAccount(addr);
        assertEquals(addr, account.getAddress());
    }

    @Test
    @Disabled
    public void simulateTx() throws IOException {
        BaseClient baseClient = client.getBaseClient();
        Tx.MsgIssueDenom msg = Tx.MsgIssueDenom
                .newBuilder()
                .setId("testfjdsklf21A3")
                .setName("testfjdsklf213")
                .setSchema("nullschema")
                .setSender(baseClient.getCurrentAddr())
                .build();

        BaseTx baseTx = new BaseTx(10000, new Fee("10000", "uirita"), BroadcastMode.Commit);
        List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
        GasInfo gasInfo = baseClient.simulateTx(msgs, baseTx, null);
        System.out.println(gasInfo);
    }

    @Test
    @Disabled
    public void queryTx() throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        String hash = "321FB2F2C314B5F7A7BBB4FECC5B34425A701C2878534EBE2E7760D37CCC2F45";//tibc
//        String hash = "FBE2D787D8708DEB48A30CC7D8BDA3346FBAD651B8F122FF19FE2F0E53C950DD";//issue denom
//        String hash = "5B3E65C3F366C4DE262A15F79B47132C846EC4C02EFF2E29B1E7200F0CB061B8";//nft mint
//        String hash = "A004E49760E6D51D4C5023B87352D05ED5865CEC7B8E3FF0D46543F94C3BD700";//nft edit
        String hash = "E35ECD97D21D4560AEF353A6471B8ABA69B821A877C1E9DED0A97183FF7AA2F1";//nft transfer
        ResultQueryTx resultQueryTx = client.getBaseClient().queryTx(hash);
        assertNotNull(resultQueryTx);
    }
}
