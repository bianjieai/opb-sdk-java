package irita.sdk.config;

public class ClientConfig {
    private final String rpcUri;
    private final String grpcAddr;
    private final String chainID;

    public ClientConfig(String rpcUri, String grpcAddr, String chainID) {
        this.rpcUri = rpcUri;
        this.grpcAddr = grpcAddr;
        this.chainID = chainID;
    }

    public String getRpcUri() {
        return rpcUri;
    }

    public String getGrpcAddr() {
        return grpcAddr;
    }

    public String getChainID() {
        return chainID;
    }
}
