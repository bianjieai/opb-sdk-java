package irita.sdk.model.tx;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TxResult {
    private int code;
    private String data;
    private String log;
    private String info;
    @JsonProperty(value = "gas_wanted")
    private String gasWanted;
    @JsonProperty(value = "gas_used")
    private String gasUsed;
    private List<Events> events;
    private String codespace;

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getLog() {
        return log;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setGasWanted(String gasWanted) {
        this.gasWanted = gasWanted;
    }

    public String getGasWanted() {
        return gasWanted;
    }

    public void setGasUsed(String gasUsed) {
        this.gasUsed = gasUsed;
    }

    public String getGasUsed() {
        return gasUsed;
    }

    public void setEvents(List<Events> events) {
        this.events = events;
    }

    public List<Events> getEvents() {
        return events;
    }

    public void setCodespace(String codespace) {
        this.codespace = codespace;
    }

    public String getCodespace() {
        return codespace;
    }

}