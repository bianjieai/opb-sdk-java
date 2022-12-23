package irita.sdk.config;

import io.grpc.netty.shaded.io.netty.handler.ssl.SslProvider;

import java.util.Map;

public class OpbConfig {
    private  String projectID;
    private  String projectKey;
    private  String chainAccountAddr;
    private Map<String,String> header;

    private boolean enableTLS;
    private SslProvider sslProvider;

    public OpbConfig(String projectID, String projectKey, String chainAccountAddr) {
        this.projectID = projectID;
        this.projectKey = projectKey;
        this.chainAccountAddr = chainAccountAddr;
    }

    public OpbConfig(Map<String,String> header) {
        this.header = header;
    }

    public String getProjectID() {
        return projectID;
    }

    public String getProjectKey() {
        return projectKey;
    }

    public String getChainAccountAddr() {
        return chainAccountAddr;
    }

    public boolean isEnableTLS() {
        return enableTLS;
    }

    public void setRequireTransportSecurity(boolean enabled) {
        this.enableTLS = enabled;
    }

    public void setEnableTLS(boolean enableTLS) {
        this.enableTLS = enableTLS;
    }

    public SslProvider getSslProvider() {
        return sslProvider;
    }

    public void setSslProvider(SslProvider sslProvider) {
        this.sslProvider = sslProvider;
    }

    public Map<String, String> getHeader() {
        return header;
    }

    public void setHeader(Map<String, String> header) {
        this.header = header;
    }
}
