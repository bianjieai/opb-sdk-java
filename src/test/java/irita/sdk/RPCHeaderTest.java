package irita.sdk;

import irita.sdk.client.BaseClient;
import irita.sdk.client.IritaClient;
import irita.sdk.config.ClientConfig;
import irita.sdk.config.OpbConfig;
import irita.sdk.constant.enums.BroadcastMode;
import irita.sdk.key.KeyInfo;
import irita.sdk.key.KeyManager;
import irita.sdk.key.KeyManagerFactory;
import irita.sdk.model.Account;
import irita.sdk.model.BaseTx;
import irita.sdk.model.Fee;
import irita.sdk.model.ResultTx;
import irita.sdk.module.nft.IssueDenomRequest;
import irita.sdk.module.nft.MintNFTRequest;
import irita.sdk.module.nft.QueryDenomResp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RPCHeaderTest {

    private KeyManager km;
    private IritaClient client;
    private BaseClient baseClient;
    private final BaseTx baseTx = new BaseTx(400000, new Fee("400000", "ugas"), BroadcastMode.Commit);

    @BeforeEach
    public void init() {
        Properties properties = ConfigTest.getTestConfig();
        km = KeyManagerFactory.createDefault();
        km.recover(properties.getProperty("mnemonic"));
        String nodeUri = properties.getProperty("node_uri");
        String grpcAddr = properties.getProperty("grpc_addr");
        String chainId = properties.getProperty("chain_id");
        Map<String,String> header = new HashMap<String,String>();
        header.put("x-api-key",properties.getProperty("api_key"));
        header.put("x-api-chain-type",properties.getProperty("api_chain_type"));
        OpbConfig opbConfig = new OpbConfig(header);
        opbConfig.setRequireTransportSecurity(false);
        ClientConfig clientConfig = new ClientConfig(nodeUri, grpcAddr, chainId);

        client = new IritaClient(clientConfig, opbConfig, km);
        baseClient = client.getBaseClient();
        //判断由助记词恢复的是否为预期的链上地址
        assertEquals(properties.getProperty("address"), km.getCurrentKeyInfo().getAddress());
    }

    @Test
    public void testAccount(){
        Account account = baseClient.queryAccount("iaa1axg00hexmdxjddtx0akrkcf58t3meffwmvnt7f");
        System.out.println(account.getSequence());
        System.out.println(account.getAddress());
    }

    @Test
    public void testNft() throws IOException {
        QueryDenomResp denom = client.getNftClient().queryDenom("denomid506");
        System.out.println(denom.getName());
    }

    @Test
    public void testIssueDenom() throws IOException {
        String denomID = "denomid" + new Random().nextInt(1000);
        String denomName = "test_name" + new Random().nextInt(1000);
        String schema = "no shcema";

        IssueDenomRequest req = new IssueDenomRequest()
                .setId(denomID)
                .setName(denomName)
                .setSchema(schema)
                .setData("data")
                .setUri("www.wcchain.com")
                .setSymbol("aaa");
        ResultTx resultTx = client.getNftClient().issueDenom(req, baseTx);
        System.out.println(resultTx.getResult().getHash());
        System.out.println(resultTx.getResult().getDeliver_tx().getLog());

        KeyInfo keyInfo = km.getCurrentKeyInfo();
        String nftID = "nftid080034";
        String nftName = "你好呀";
        String uri = "https://www.baidu.com";
        String data = "any data";

        MintNFTRequest mintReq = new MintNFTRequest()
                .setDenom(denomID)
                .setId(nftID)
                .setName(nftName)
                .setUri(uri)
                .setData(data)
                .setRecipient(keyInfo.getAddress());
        resultTx = client.getNftClient().mintNft(mintReq, baseTx);
        assertNotNull(resultTx.getResult().getHash());
        System.out.println(resultTx.getResult().getHash());
        System.out.println(resultTx.getResult().getDeliver_tx().getLog());
    }
}
