package irita.sdk;

import irita.sdk.client.OpbClient;
import irita.sdk.config.ClientConfig;
import irita.sdk.config.OpbConfig;
import irita.sdk.key.KeyManager;
import irita.sdk.key.KeyManagerFactory;
import irita.sdk.module.nft.NftClient;
import irita.sdk.module.nft.QueryDenomResp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OpbTest {
    private OpbClient client;

    @BeforeEach
    public void init() {
        String mnemonic = "opera vivid pride shallow brick crew found resist decade neck expect apple chalk belt sick author know try tank detail tree impact hand best";
        KeyManager km = KeyManagerFactory.createDefault();
        km.recover(mnemonic);

        String nodeUri = "https://opbt.bsngate.com:18602";
        String grpcAddr = "https://opbt.bsngate.com:18603";
        String chainId = "irita";
        ClientConfig clientConfig = new ClientConfig(nodeUri, grpcAddr, chainId);
        OpbConfig opbConfig = new OpbConfig("4efe1d3f67b5484aa91331e29dc09ea1", null, "");

        client = new OpbClient(clientConfig, opbConfig, km);
        assertEquals("iaa1ytemz2xqq2s73ut3ys8mcd6zca2564a5lfhtm3", km.getCurrentKeyInfo().getAddress());
    }

    @Test
    @Disabled
    public void nftQuery() {
        NftClient nftClient = client.getNftClient();
        List<QueryDenomResp> queryDenomResps = nftClient.queryDenoms(null);
        System.out.println(queryDenomResps.size());

    }
}
