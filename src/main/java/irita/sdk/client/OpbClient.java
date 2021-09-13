package irita.sdk.client;


import irita.sdk.config.ClientConfig;
import irita.sdk.config.OpbConfig;
import irita.sdk.key.KeyManager;

public class OpbClient extends IritaClient {
    public OpbClient(ClientConfig clientConfig, OpbConfig opbConfig, KeyManager km) {
        super(clientConfig, opbConfig, km);
    }
}
