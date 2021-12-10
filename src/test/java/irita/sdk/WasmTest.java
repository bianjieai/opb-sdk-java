package irita.sdk;

import irita.sdk.client.OpbClient;
import irita.sdk.config.ClientConfig;
import irita.sdk.config.OpbConfig;
import irita.sdk.constant.enums.BroadcastMode;
import irita.sdk.key.KeyManager;
import irita.sdk.key.KeyManagerFactory;
import irita.sdk.model.BaseTx;
import irita.sdk.model.Fee;
import irita.sdk.model.ResultTx;
import irita.sdk.module.wasm.*;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

public class WasmTest {
    private WasmClient wasmClient;

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

        OpbClient opbClient = new OpbClient(clientConfig, opbConfig, km);
        wasmClient = opbClient.getWasmClient();
        assertEquals(properties.getProperty("address"), km.getCurrentKeyInfo().getAddress());
    }


    // when you want to add new Contract to block-chain, remove the @Disabled
    @Disabled
    @Test
    public void store() throws IOException {
        StoreRequest req = new StoreRequest();
        req.setWasmFile("src/test/resources/test.wasm");

        BaseTx baseTx = new BaseTx(2000000, new Fee("2000000", "uirita"), BroadcastMode.Commit);
        String codeId = wasmClient.store(req, baseTx);
        assertTrue(StringUtils.isNotEmpty(codeId));
        System.out.println(codeId);
    }

    @Test
    @Disabled
    public void instantiate() throws IOException {
        // code_id is res of store
        long codeId = 9L;

        Map<String, Object> initMsg = new HashMap<>();
        InstantiateRequest req = new InstantiateRequest();
        req.setCodeId(codeId);
        initMsg.put("count", 0);
        req.setInitMsg(initMsg);
        req.setLabel("test wasm");
        BaseTx baseTx = new BaseTx(2000000, new Fee("2000", "uirita"), BroadcastMode.Commit);

        String contractAddress = wasmClient.instantiate(req, baseTx);
        assertTrue(StringUtils.isNotEmpty(contractAddress));
        System.out.println(contractAddress);

        // test queryContractInfo
        ContractInfo contractInfo = wasmClient.queryContractInfo(contractAddress);
        assertNotNull(contractInfo);
        System.out.println(contractInfo);
    }

    @Test
    @Disabled
    public void execute() throws IOException {
        // contractAddress is res of instantiate
        String contractAddress = "iaa1plr28ztj64a47a32lw7tdae8vluzm2lmjylpnr";
        ContractABI execAbi = new ContractABI();
        execAbi.setMethod("increment");
        BaseTx baseTx = new BaseTx(2000000, new Fee("2000", "uirita"), BroadcastMode.Commit);

        ResultTx resultTx = wasmClient.execute(contractAddress, execAbi, null, baseTx);

        String height = resultTx.getResult().getHeight();
        assertTrue(Integer.parseInt(height) > 0);
        assertNotNull(resultTx.getResult().getHash());

        // test QueryContract
        ContractABI queryAbi = new ContractABI();
        queryAbi.setMethod("get_count");
        byte[] bytes = wasmClient.queryContract(contractAddress, queryAbi);
        assertNotNull(bytes);
        assertTrue(bytes.length > 0);
        System.out.println(new String(bytes));
    }

    @Test
    @Disabled
    public void exportContractState() {
        String contractAddress = "iaa1plr28ztj64a47a32lw7tdae8vluzm2lmjylpnr";

        Map<String, String> res = wasmClient.exportContractState(contractAddress);
        System.out.println(res);
    }
}
