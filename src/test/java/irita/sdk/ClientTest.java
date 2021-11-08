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
import irita.sdk.model.block.BlockDetail;
import irita.sdk.model.tx.Condition;
import irita.sdk.model.tx.EventQueryBuilder;
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
    private String name = "test_name";
    private String password = "test_password";

    @BeforeEach
    public void init() {
        String mnemonic = "opera vivid pride shallow brick crew found resist decade neck expect apple chalk belt sick author know try tank detail tree impact hand best";
        KeyManager km = KeyManagerFactory.createDefault();
        km.recover(name, password, mnemonic);

        String nodeUri = "http://101.132.67.8:16657";
        String grpcAddr = "http://101.132.67.8:19090";
        String chainId = "irishub";
        ClientConfig clientConfig = new ClientConfig(nodeUri, grpcAddr, chainId);
//        OpbConfig opbConfig = new OpbConfig("", "", "");
        OpbConfig opbConfig = null;

        client = new IritaClient(clientConfig, opbConfig, km);
        assertEquals("iaa1ytemz2xqq2s73ut3ys8mcd6zca2564a5lfhtm3", km.getKeyDAO(name).getAddress());
    }

    @Test
    @Disabled
    public void queryAccount() {
        String addr = "iaa18e23vvukxgatgzm4fgqkdggxecurkf39ytw7ue";
        Account account = client.getBaseClient().queryAccount(addr);
        assertEquals(addr, account.getAddress());
    }

    @Test
    @Disabled
    public void simulateTx() throws IOException {
        BaseClient baseClient = client.getBaseClient();
        BaseTx baseTx = new BaseTx(name, password, 10000, new Fee("10000", "uirita"), BroadcastMode.Commit);
        Tx.MsgIssueDenom msg = Tx.MsgIssueDenom
                .newBuilder()
                .setId("testfjdsklf21A3")
                .setName("testfjdsklf213")
                .setSchema("nullschema")
                .setSender(baseClient.getCurrentAddr(baseTx.getFrom()))
                .build();

        List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
        GasInfo gasInfo = baseClient.simulateTx(msgs, baseTx, null);
        System.out.println(gasInfo);
    }

    @Test
    @Disabled
    public void queryTx() throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        String hash = "E2D2CC1379ED326FCE4084238032549DE903FB2E64733D584F5974AB95B7F582";//tibc
//        String hash = "FBE2D787D8708DEB48A30CC7D8BDA3346FBAD651B8F122FF19FE2F0E53C950DD";//issue denom
//        String hash = "5B3E65C3F366C4DE262A15F79B47132C846EC4C02EFF2E29B1E7200F0CB061B8";//nft mint
//        String hash = "A004E49760E6D51D4C5023B87352D05ED5865CEC7B8E3FF0D46543F94C3BD700";//nft edit
//        String hash = "E35ECD97D21D4560AEF353A6471B8ABA69B821A877C1E9DED0A97183FF7AA2FF";//nft transfer
        ResultQueryTx resultQueryTx = client.getBaseClient().queryTx(hash);
        assertNotNull(resultQueryTx);
    }

    @Test
    @Disabled
    public void queryTxs() throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        EventQueryBuilder builder = EventQueryBuilder.newEventQueryBuilder()
                .AddCondition(Condition.newCond("tibc_nft_transfer", "sender").eq("iaa18e23vvukxgatgzm4fgqkdggxecurkf39ytw7ue"));
//                .AddCondition(Condition.newCond("send_packet", "packet_sequence").eq(4));
        int page = 1;
        int size = 10;
        ResultSearchTxs resultSearchTxs = client.getBaseClient().queryTxs(builder, page, size);
        assertNotNull(resultSearchTxs);
    }

    @Test
    @Disabled
    public void queryBlock() throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        BlockDetail blockDetail = client.getBaseClient().queryBlock("221579");
        assertNotNull(blockDetail);
    }
}
