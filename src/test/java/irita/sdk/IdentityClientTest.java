package irita.sdk;

import irita.sdk.client.IritaClient;
import irita.sdk.config.ClientConfig;
import irita.sdk.config.OpbConfig;
import irita.sdk.constant.enums.BroadcastMode;
import irita.sdk.key.KeyManager;
import irita.sdk.key.KeyManagerFactory;
import irita.sdk.model.BaseTx;
import irita.sdk.model.Fee;
import irita.sdk.module.identity.IdentityClient;
import irita.sdk.util.ByteUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import proto.identity.IdentityOuterClass;
import proto.identity.QueryGrpc;
import proto.identity.QueryOuterClass;

import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IdentityClientTest {
    private final BaseTx baseTx = new BaseTx(200000, new Fee("300000", "uirita"), BroadcastMode.Commit);
    IdentityClient identityClient;
    private IritaClient client;

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
        identityClient = client.getIdentityClient();
        assertEquals(properties.getProperty("address"), km.getCurrentKeyInfo().getAddress());
    }


    @Test
    @Disabled
    void createIdentity() {
        try {
            String str = ByteUtils.getRandomStr(16);
            //String id=Hex.toHexString(str.getBytes(StandardCharsets.UTF_8));
            String id = "37644773453030353876796753344436";
            System.out.println(id);
            identityClient.createIdentity(id,
                    "53281ce4ba0b8c97e5b1434f8f298b064f03d4c1d21aae9276065e170fc90a5d52",
                    IdentityOuterClass.PubKeyAlgorithm.SM2.name(),
                    "", "https://security.com/kyc/10001/", baseTx);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Disabled
    void updateIdentity() {
        try {
            identityClient.updateIdentity("37644773453030353876796753344436", "53281ce4ba0b8c97e5b1434f8f298b064f03d4c1d21aae9276065e170fc90a5d58", IdentityOuterClass.PubKeyAlgorithm.SM2.name(), "", "https://security.com/kyc/10001/", baseTx);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Disabled
    public void queryId() {
        QueryOuterClass.QueryIdentityRequest request = QueryOuterClass.QueryIdentityRequest.newBuilder().setId("37644773453030353876796753344436").build();
        QueryOuterClass.QueryIdentityResponse response = QueryGrpc.newBlockingStub(client.getBaseClient().getGrpcClient()).identity(request);
        System.out.println(response.getIdentity());
    }
}
