package irita.sdk.config;

public class ClientConfig {
    private final String rpcUri;
    private final String grpcAddr;
    private final String chainID;
    private String wsAddr;

    /**
     * @deprecated Use {@link #ClientConfig(String, String, String, String)}} instead. will remove at later versions
     */
    @Deprecated
    public ClientConfig(String rpcUri, String grpcAddr, String chainID) {
        this.rpcUri = rpcUri;
        this.grpcAddr = grpcAddr;
        this.chainID = chainID;
    }

    public ClientConfig(String rpcUri, String grpcAddr, String chainID, String wsAddr) {
        this.rpcUri = rpcUri;
        this.grpcAddr = grpcAddr;
        this.chainID = chainID;
        this.wsAddr = wsAddr;
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

    public String getWsAddr() {
        return wsAddr;
    }

    public void setWsAddr(String wsAddr) {
        this.wsAddr = wsAddr;
    }
}
