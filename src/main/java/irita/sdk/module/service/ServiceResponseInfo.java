package irita.sdk.module.service;

public class ServiceResponseInfo {
    private String output;
    private String result;

    public ServiceResponseInfo() {
    }

    public ServiceResponseInfo(String output, String result) {
        this.output = output;
        this.result = result;
    }

    public String getOutput() {
        return output;
    }

    public ServiceResponseInfo setOutput(String output) {
        this.output = output;
        return this;
    }

    public String getResult() {
        return result;
    }

    public ServiceResponseInfo setResult(String result) {
        this.result = result;
        return this;
    }
}
