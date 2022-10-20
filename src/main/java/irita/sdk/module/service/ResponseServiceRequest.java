package irita.sdk.module.service;

public class ResponseServiceRequest {
    private String requestId;
    private String output;
    private String result;

    public String getRequestId() {
        return requestId;
    }

    public ResponseServiceRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getOutput() {
        return output;
    }

    public ResponseServiceRequest setOutput(String output) {
        this.output = output;
        return this;
    }

    public String getResult() {
        return result;
    }

    public ResponseServiceRequest setResult(String result) {
        this.result = result;
        return this;
    }
}
