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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PermTest {
    private IritaClient client;
    private final BaseTx baseTx = new BaseTx(200000, new Fee("300000", "uirita"), BroadcastMode.Commit);
    private String name = "test_name";
    private String password = "test_password";

    @BeforeEach
    public void init() throws FileNotFoundException {
        FileInputStream input = new FileInputStream("src/test/resources/root_admin_priv.key");
        KeyManager km = KeyManagerFactory.createDefault();
        km.recover(input, "1234567890");
        assertEquals("iaa1r49m366kaexmvrlppqqeyr8ykqq248g0d4qra4", km.getAddr());

        String nodeUri = "http://101.132.138.109:26657";
        String grpcAddr = "http://101.132.138.109:9090";
        String chainId = "test";
        ClientConfig clientConfig = new ClientConfig(nodeUri, grpcAddr, chainId);
        OpbConfig opbConfig = null;

        client = new IritaClient(clientConfig, opbConfig, km);
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
        String mnemonic = km.add(name, password);
        return km.getKeyDAO(name).getAddress();
    }
}
