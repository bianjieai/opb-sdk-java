package irita.sdk.config;

public class OpbConfig {
    private final String projectID;
    private final String projectKey;
    private final String chainAccountAddr;

    private boolean enableTLS;

    public OpbConfig(String projectID, String projectKey, String chainAccountAddr) {
        this.projectID = projectID;
        this.projectKey = projectKey;
        this.chainAccountAddr = chainAccountAddr;
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
}
