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

import static org.junit.jupiter.api.Assertions.*;

public class PermTest extends ConfigTest {
    private IritaClient client;
    private final BaseTx baseTx = new BaseTx(200000, new Fee("200000", "ugas"), BroadcastMode.Commit);

    @BeforeEach
    public void init() {
        client = getTestClient();
    }

    @Test
    @Disabled
    public void testTerm() throws Exception {
        PermClient permClient = client.getPermClient();

        String address = getRandomAddress();
        String contractAddress = "0x7Ea6EEbDE8E360Bb7ceF58331462fb2B6B4BB674";

        /**
         * role
         */
        //test AddRoles
        Perm.Role role = Perm.Role.BLACKLIST_ADMIN;
        ResultTx resultTx = permClient.assignRoles(address, Collections.singletonList(role), baseTx);
        assertNotNull(resultTx.getResult().getHash());

        // test QueryRoles
        List<Perm.Role> roles = permClient.queryRoles(address);
        assertNotNull(roles);
        assertEquals(1, roles.size());
        assertEquals(role, roles.get(0));

        // test RemoveRoles
        permClient.unAssignRoles(address, Collections.singletonList(role), baseTx);
        assertNotNull(resultTx.getResult().getHash());

        // test QueryRoles again
        roles = permClient.queryRoles(address);
        assertTrue(roles == null || roles.size() == 0);

        /**
         * account
         */
        //query block account list
        List<String> accounts = permClient.queryBlockListAccount();
        assertNotNull(accounts);
        int size = accounts.size();

        //block account
        resultTx = permClient.blockAccount(address, baseTx);
        assertNotNull(resultTx);

        //query block account list
        accounts = permClient.queryBlockListAccount();
        assertNotNull(accounts);
        assertEquals(size + 1, accounts.size());

        //unblock account
        resultTx = permClient.unblockAccount(address, baseTx);
        assertNotNull(resultTx);

        //query block account list
        accounts = permClient.queryBlockListAccount();
        assertNotNull(accounts);
        assertEquals(size, accounts.size());

        /**
         * contract
         */
        //query block contract list
        List<String> contracts = permClient.queryBlockListContract();
        assertNotNull(contracts);
        size = contracts.size();

        //block contract
        resultTx = permClient.blockContract(contractAddress, baseTx);
        assertNotNull(resultTx);

        //query block contract list
        contracts = permClient.queryBlockListContract();
        assertNotNull(contracts);
        assertEquals(size + 1, contracts.size());

        //unblock contract
        resultTx = permClient.unblockContract(contractAddress, baseTx);
        assertNotNull(resultTx);

        //query block contract list
        contracts = permClient.queryBlockListContract();
        assertNotNull(contracts);
        assertEquals(size, contracts.size());
    }

    public String getRandomAddress() throws Exception {
        KeyManager km = KeyManagerFactory.createDefault();
        km.add();
        return km.getCurrentKeyInfo().getAddress();
    }
}
