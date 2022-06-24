package irita.sdk.module.random;

public class QueryRandomResponse {
    private String requestTxHash;
    private long height;
    private String value;

    public String getRequestTxHash() {
        return requestTxHash;
    }

    public void setRequestTxHash(String requestTxHash) {
        this.requestTxHash = requestTxHash;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
