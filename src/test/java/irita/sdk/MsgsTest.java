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
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MsgsTest {
    private BaseClient baseClient;
    private final BaseTx baseTx = new BaseTx(200000, new Fee("300000", "ugas"), BroadcastMode.Commit);

    @BeforeEach
    public void init() {
        Properties properties = ConfigTest.getTestConfig();
        String mnemonic = properties.getProperty("mnemonic");
        KeyManager km = KeyManagerFactory.createDefault();
        km.recover(mnemonic);

        String nodeUri = properties.getProperty("node_uri");
        String grpcAddr = properties.getProperty("grpc_addr");
        String chainId = properties.getProperty("chain_id");
        ClientConfig clientConfig = new ClientConfig(nodeUri, grpcAddr, chainId);
        OpbConfig opbConfig = null;

        IritaClient iritaClient = new IritaClient(clientConfig, opbConfig, km);
        NftClient nftClient = iritaClient.getNftClient();
        baseClient = iritaClient.getBaseClient();
        assertEquals(properties.getProperty("address"), km.getCurrentKeyInfo().getAddress());
    }

    @Test
    @Disabled
    public void testMsgs() throws IOException {
        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");

        String denomID = "denomid" + new Random().nextInt(1000);
        String denomName = "denomname" + new Random().nextInt(1000);
        String schema = "no shcema";

        Account account = baseClient.queryAccount(baseTx);
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
