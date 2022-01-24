package irita.sdk.model.ws.tx;

public class TxResult {
    private String height;
    private String tx;
    private InnerResult result;

    public void setHeight(String height) {
        this.height = height;
    }

    public String getHeight() {
        return height;
    }

    public void setTx(String tx) {
        this.tx = tx;
    }

    public String getTx() {
        return tx;
    }

    public InnerResult getResult() {
        return result;
    }

    public TxResult setResult(InnerResult result) {
        this.result = result;
        return this;
    }
}