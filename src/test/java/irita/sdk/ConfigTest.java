package irita.sdk;

import irita.sdk.client.IritaClient;
import irita.sdk.config.OpbConfig;
import irita.sdk.exception.IritaSDKException;
import irita.sdk.key.AlgoEnum;
import irita.sdk.key.KeyManager;
import irita.sdk.key.KeyManagerFactory;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConfigTest {
    public static Properties getTestConfig() {
        Properties properties = new Properties();
        BufferedReader buf = null;
        try {
            buf = new BufferedReader(new FileReader("src/test/resources/config.properties"));
            properties.load(buf);
            return properties;
        } catch (Exception e) {
            throw new IritaSDKException("read test config failed");
        }
    }

    public IritaClient getTestClient() {
        Properties properties = ConfigTest.getTestConfig();
        String mnemonic = properties.getProperty("mnemonic");
        KeyManager km = KeyManagerFactory.createDefault();
        km.recover(mnemonic);

        String nodeUri = properties.getProperty("node_uri");
        String grpcAddr = properties.getProperty("grpc_addr");
        String chainId = properties.getProperty("chain_id");
        String wsAddr = properties.getProperty("ws_addr");
        String projectId = properties.getProperty("project_id");
        String projectKey = properties.getProperty("project_key");

        irita.sdk.config.ClientConfig clientConfig = new irita.sdk.config.ClientConfig(nodeUri, grpcAddr, chainId, wsAddr);
        OpbConfig opbConfig = null;
        if (StringUtils.isNotEmpty(projectId)) {
            opbConfig = new OpbConfig(projectId, projectKey, "");
            opbConfig.setEnableTLS(true);
        }

        IritaClient client = new IritaClient(clientConfig, opbConfig, km);
        assertEquals(properties.getProperty("address"), km.getCurrentKeyInfo().getAddress());
        return client;
    }
}
