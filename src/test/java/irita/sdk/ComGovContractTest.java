package irita.sdk;

import irita.sdk.client.BaseClient;
import irita.sdk.client.IritaClient;
import irita.sdk.config.ClientConfig;
import irita.sdk.config.OpbConfig;
import irita.sdk.constant.ContractAddress;
import irita.sdk.constant.enums.BroadcastMode;
import irita.sdk.constant.enums.DocType;
import irita.sdk.constant.enums.Role;
import irita.sdk.exception.ContractException;
import irita.sdk.key.KeyManager;
import irita.sdk.key.KeyManagerFactory;
import irita.sdk.model.BaseTx;
import irita.sdk.model.Fee;
import irita.sdk.model.ResultTx;
import irita.sdk.module.community_gov.CommunityGovClient;
import irita.sdk.module.wasm.InstantiateRequest;
import irita.sdk.module.wasm.StoreRequest;
import irita.sdk.module.wasm.WasmClient;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;


@Disabled
public class ComGovContractTest extends ConfigTest {
    private CommunityGovClient comGovClient;
    private WasmClient wasmClient;
    private final BaseTx txBaseTx = new BaseTx(200000, new Fee("200000", "ugas"), BroadcastMode.Commit);


    @BeforeEach
    public void init() {
        IritaClient client = getTestClient();
        wasmClient = client.getWasmClient();
        comGovClient = client.getComGovClient();
    }

    // it is ignore unless you want to new community_governance contract to block-chain.
    @Test
    public void newContract() throws IOException {
        // store contract
        StoreRequest storeReq = new StoreRequest();
        storeReq.setWasmFile("src/test/resources/community_governance.wasm");
        BaseTx baseTx = new BaseTx(2378678, new Fee("2378678", "ugas"), BroadcastMode.Commit);

        String codeId = wasmClient.store(storeReq, baseTx);
        assertTrue(StringUtils.isNotEmpty(codeId));

        // init contract
        InstantiateRequest initReq = new InstantiateRequest();
        initReq.setLabel("test-com-gov");
        initReq.setCodeId(Long.parseLong(codeId));
        initReq.setInitMsg(new HashMap<>());
        String contractorAddr = wasmClient.instantiate(initReq, baseTx);

        assertTrue(StringUtils.isNotEmpty(contractorAddr));

        System.out.println(codeId);
        System.out.println(contractorAddr);
    }

    @Test
    public void addDepartment() {
        // publicKey == address in this version
        final String publicKey = "iaa1d2aqqhsqp3lcwg55kyg6rclefe2zgfqmttfh8w";
        final String department = "测试部门";

        try {
            comGovClient.addDepartment(department, publicKey, txBaseTx);
        } catch (ContractException e) {
            // you can use log to record
            e.printStackTrace();
        }

        // query contract for valid
        Map<String, String> map = wasmClient.exportContractState(ContractAddress.DEFAULT);

        String v1 = map.get(department);
        assertEquals("{}", v1);
        String v2 = map.get("iaa1d2aqqhsqp3lcwg55kyg6rclefe2zgfqmttfh8w");
        assertEquals("{\"department_name\":\"测试部门\",\"role\":0,\"public_key\":\"iaa1d2aqqhsqp3lcwg55kyg6rclefe2zgfqmttfh8w\"}", v2);
    }

    // first update will success
    // second will false, because already transfer the department
    @Test
    public void updateDepartment() {
        // publicKey == address in this version
        String publicKey = "otherPerson";
        try {
            comGovClient.updateDepartment(publicKey, txBaseTx);
        } catch (ContractException e) {
            assertTrue(e.getMessage().contains("community_governance::state::Identity"));
        }
    }

    @Test
    public void addMember() {
        String newAddr = "iaa1wfs050mv8taydn4cttsrhr5dq3tpdaemcm5sk2";

        try {
            comGovClient.addMember(newAddr, Role.HASH_ADMIN, txBaseTx);
        } catch (ContractException e) {
            e.printStackTrace();
        }

        // verify from db
        Map<String, String> map = wasmClient.exportContractState(ContractAddress.DEFAULT);
        assertNotNull(map.get(newAddr));
    }

    @Test
    public void removeMember() {
        String removeAddr = "iaa1wfs050mv8taydn4cttsrhr5dq3tpdaemcm5sk2";

        try {
            comGovClient.removeMember(removeAddr, txBaseTx);
        } catch (ContractException e) {
            e.printStackTrace();
        }

        // verify from db
        Map<String, String> map = wasmClient.exportContractState(ContractAddress.DEFAULT);
        assertNull(map.get(removeAddr));
    }

    @Test
    public void addHash() {
        // new irita.sdk.client, he role of cur_address must hash_admin
        String mnemonic = "apart various produce pond bachelor size pumpkin gate pretty awake silver worth dust pledge pioneer patrol current fall escape lunar zero afraid this fish";
        KeyManager km = KeyManagerFactory.createDefault();
        km.recover(mnemonic);

        Properties properties = ConfigTest.getTestConfig();
        String nodeUri = properties.getProperty("node_uri");
        String grpcAddr = properties.getProperty("grpc_addr");
        String chainId = properties.getProperty("chain_id");
        ClientConfig clientConfig = new ClientConfig(nodeUri, grpcAddr, chainId);
        CommunityGovClient comGovClient1 = new CommunityGovClient(new WasmClient(new BaseClient(clientConfig, null, km)));

        // exec add_hash
        DocType docType = DocType.FOREST_SEED_PRODUCTION_OPERATION_LICENSE;
        String docId = "1";
        String strHash = "123";
        String fileHash = "789";

        try {
            ResultTx resultTx = comGovClient1.addHash(docType, docId, strHash, fileHash, txBaseTx);
            System.out.println(resultTx.getResult().getHash());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // verify from db
        Map<String, String> map = wasmClient.exportContractState(ContractAddress.DEFAULT);
        System.out.println(map);
        assertNotNull(map.get(docType.getCode() + "/" + docId));
        assertNotNull(map.get(strHash));
        assertNotNull(map.get(fileHash));
    }

    @Test
    public void getHash() throws ContractException {
        String strHash = "123";
        String fileHash = "789";
        boolean isExisted = false;

        isExisted = comGovClient.getHash(strHash);
        assertTrue(isExisted);

        isExisted = comGovClient.getHash(fileHash);
        assertTrue(isExisted);
    }

    // this is a pressure test, it is ignore by default
    // Repeat execution add_member and remove_addr
    @Test
    @Disabled
    public void pressureTest() {
        String addr = "iaa1ufs8gvg6qf6nzpx7wme5tmyja34dva58kqtx2z";

        int i = 0;
        while (i < 100) {
            try {
                comGovClient.addMember(addr, Role.ADMIN, txBaseTx);
                comGovClient.removeMember(addr, txBaseTx);
            } catch (ContractException e) {
                e.printStackTrace();
            }
            i++;
        }

    }

    @Test
    public void exportContractState() {
        Map<String, String> map = wasmClient.exportContractState(ContractAddress.DEFAULT);
        System.out.println(map);
    }
}