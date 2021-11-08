package irita.sdk;

import com.google.protobuf.GeneratedMessageV3;
import irita.sdk.client.BaseClient;
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
import irita.sdk.module.nft.NftClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import proto.nft.Tx;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MsgsTest {
    private KeyManager km;
    private NftClient nftClient;
    private BaseClient baseClient;
    private String name = "test_name";
    private String password = "test_password";
    private BaseTx baseTx = new BaseTx(name, password, 200000, new Fee("300000", "uirita"), BroadcastMode.Commit);

    @BeforeEach
    public void init() {
        String mnemonic = "opera vivid pride shallow brick crew found resist decade neck expect apple chalk belt sick author know try tank detail tree impact hand best";
        km = KeyManagerFactory.createDefault();
        km.recover(name, password, mnemonic);

        String nodeUri = "http://101.132.138.109:26657";
        String grpcAddr = "http://101.132.138.109:9090";
        String chainId = "test";
        ClientConfig clientConfig = new ClientConfig(nodeUri, grpcAddr, chainId);
//        OpbConfig opbConfig = new OpbConfig("", "", "");
        OpbConfig opbConfig = null;

        IritaClient client = new IritaClient(clientConfig, opbConfig, km);
        baseClient = client.getBaseClient();
        nftClient = client.getNftClient();
        assertEquals("iaa1ytemz2xqq2s73ut3ys8mcd6zca2564a5lfhtm3", km.getKeyDAO(name).getAddress());
    }

    @Test
    @Disabled
    public void testMsgs() throws IOException {
        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");

        String denomID = "denomid" + new Random().nextInt(1000);
        String denomName = "denomname" + new Random().nextInt(1000);
        String schema = "no shcema";

        Account account = baseClient.queryAccount(baseClient.getCurrentAddr(baseTx.getFrom()));
        Tx.MsgIssueDenom msg1 = Tx.MsgIssueDenom
                .newBuilder()
                .setId(denomID + "1")
                .setName(denomName + "1")
                .setSchema(schema + "1")
                .setSender(account.getAddress())
                .build();
        Tx.MsgIssueDenom msg2 = Tx.MsgIssueDenom
                .newBuilder()
                .setId(denomID + "2")
                .setName(denomName + "2")
                .setSchema(schema + "2")
                .setSender(account.getAddress())
                .build();

        List<GeneratedMessageV3> msgs = new ArrayList<>();
        msgs.add(msg1);
        msgs.add(msg2);
        ResultTx resultTx = baseClient.buildAndSend(msgs, baseTx, account);
        System.out.println(resultTx.getResult().getHash());
    }
}
