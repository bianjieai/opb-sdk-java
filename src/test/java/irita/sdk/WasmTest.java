package irita.sdk;

import irita.sdk.client.BaseClient;
import irita.sdk.config.ClientConfig;
import irita.sdk.config.OpbConfig;
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

import static org.junit.jupiter.api.Assertions.*;

public class WasmTest {
    private WasmClient wasmClient;

    @BeforeEach
    public void init() {
        String mnemonic = "opera vivid pride shallow brick crew found resist decade neck expect apple chalk belt sick author know try tank detail tree impact hand best";
        KeyManager km = KeyManagerFactory.createDefault();
        km.recover(mnemonic);

        String nodeUri = "http://101.132.138.109:26657";
        String grpcAddr = "http://101.132.138.109:9090";
        String chainId = "irita";
        ClientConfig clientConfig = new ClientConfig(nodeUri, grpcAddr, chainId);
//        OpbConfig opbConfig = new OpbConfig("", "", "");
        OpbConfig opbConfig = null;

        wasmClient = new WasmClient(new BaseClient(clientConfig, opbConfig, km));
        assertEquals("iaa1ytemz2xqq2s73ut3ys8mcd6zca2564a5lfhtm3", km.getAddr());
    }


    // when you want to add new Contract to block-chain, remove the @Disabled
    @Disabled
    @Test
    public void store() throws IOException {
        StoreRequest req = new StoreRequest();
        req.setWasmFile("src/test/resources/test.wasm");

        BaseTx baseTx = new BaseTx(2000000, new Fee("120", "stake"));
        String codeId = wasmClient.store(req, baseTx);
        assertTrue(StringUtils.isNotEmpty(codeId));
        System.out.println(codeId);
    }

    @Test
    @Disabled
    public void instantiate() throws IOException {
        // code_id is res of store
        long codeId = 7L;

        Map<String, Object> initMsg = new HashMap<>();
        initMsg.put("start", 1);
        initMsg.put("end", 100);
        initMsg.put("candidates", new String[]{"iaa1qvty8x0c78am8c44zv2n7tgm6gfqt78j0verqa", "iaa1zk2tse0pkk87p2v8tcsfs0ytfw3t88kejecye5"});

        InstantiateRequest req = new InstantiateRequest();
        req.setCodeId(codeId);
        req.setInitMsg(initMsg);
        req.setLabel("test wasm");
        BaseTx baseTx = new BaseTx(2000000, new Fee("120", "stake"));

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
        String contractAddress = "iaa1pcknsatx5ceyfu6zvtmz3yr8auumzrdtrn8h4v";
        Map<String, Object> args = new HashMap<>();
        args.put("candidate", "iaa1qvty8x0c78am8c44zv2n7tgm6gfqt78j0verqa");

        ContractABI execAbi = new ContractABI();
        execAbi.setArgs(args);
        execAbi.setMethod("vote");
        BaseTx baseTx = new BaseTx(2000000, new Fee("120", "stake"));

        ResultTx resultTx = wasmClient.execute(contractAddress, execAbi, null, baseTx);

        String height = resultTx.getResult().getHeight();
        assertTrue(Integer.parseInt(height) > 0);
        assertNotNull(resultTx.getResult().getHash());

        // test QueryContract
        ContractABI queryAbi = new ContractABI();
        queryAbi.setMethod("get_vote_info");

        byte[] bytes = wasmClient.queryContract(contractAddress, queryAbi);
        assertNotNull(bytes);
        assertTrue(bytes.length > 0);
        System.out.println(new String(bytes));
    }

    @Test
    @Disabled
    public void exportContractState() {
        String contractAddress = "iaa1pcknsatx5ceyfu6zvtmz3yr8auumzrdtrn8h4v";

        Map<String, String> res = wasmClient.exportContractState(contractAddress);
        System.out.println(res);
    }
}
