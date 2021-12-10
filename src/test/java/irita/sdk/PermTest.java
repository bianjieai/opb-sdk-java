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
import irita.sdk.module.perm.PermClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import proto.perm.Perm;

import java.util.Collections;
import java.util.List;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

public class PermTest {
    private IritaClient client;
    private final BaseTx baseTx = new BaseTx(200000, new Fee("300000", "uirita"), BroadcastMode.Commit);


    @BeforeEach
    public void init() {
        Properties properties = Config.getTestConfig();
        String mnemonic = properties.getProperty("mnemonic");
        KeyManager km = KeyManagerFactory.createDefault();
        km.recover(mnemonic);

        String nodeUri = properties.getProperty("node_uri");
        String grpcAddr = properties.getProperty("grpc_addr");
        String chainId = properties.getProperty("chain_id");
        ClientConfig clientConfig = new ClientConfig(nodeUri, grpcAddr, chainId);
        OpbConfig opbConfig = null;

        client = new IritaClient(clientConfig, opbConfig, km);
        assertEquals(properties.getProperty("address"), km.getCurrentKeyInfo().getAddress());
    }

    @Test
    @Disabled
    public void testTerm() throws Exception {
        PermClient permClient = client.getPermClient();
        String acc = getRandomAddress();
        //test AddRoles
        Perm.Role role = Perm.Role.BLACKLIST_ADMIN;
        ResultTx resultTx = permClient.assignRoles(acc, Collections.singletonList(role), baseTx);
        assertNotNull(resultTx.getResult().getHash());

        // test QueryRoles
        List<Perm.Role> roles = permClient.queryRoles(acc);
        assertNotNull(roles);
        assertEquals(1, roles.size());
        assertEquals(role, roles.get(0));

        // test RemoveRoles
        permClient.unAssignRoles(acc, Collections.singletonList(role), baseTx);
        assertNotNull(resultTx.getResult().getHash());

        // test QueryRoles again
        roles = permClient.queryRoles(acc);
        assertTrue(roles == null || roles.size() == 0);

        // test BlockAccount
        resultTx = permClient.blockAccount(acc, baseTx);
        assertNotNull(resultTx.getResult().getHash());

        // test QueryBlacklist
        List<String> bls = permClient.queryBlacklist();
        assertNotNull(roles);
        assertEquals(1, bls.size());
        assertEquals(acc, bls.get(0));

        // test UnblockAccount
        resultTx = permClient.unblockAccount(acc, baseTx);
        assertNotNull(resultTx.getResult().getHash());

        // test QueryBlacklist again
        bls = permClient.queryBlacklist();
        assertTrue(bls == null || bls.size() == 0);
    }

    public String getRandomAddress() throws Exception {
        KeyManager km = KeyManagerFactory.createDefault();
        km.add();
        return km.getCurrentKeyInfo().getAddress();
    }
}
