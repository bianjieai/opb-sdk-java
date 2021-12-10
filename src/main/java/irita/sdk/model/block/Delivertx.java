package irita.sdk.model.block;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Delivertx {
    private int code;
    private String log;
    @JsonProperty(value = "gas_wanted")
    private int gasWanted;
    @JsonProperty(value = "gas_used")
    private int gasUsed;
    private List<Events> events;

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getLog() {
        return log;
    }

    public void setGasWanted(int gasWanted) {
        this.gasWanted = gasWanted;
    }

    public int getGasWanted() {
        return gasWanted;
    }

    public void setGasUsed(int gasUsed) {
        this.gasUsed = gasUsed;
    }

    public int getGasUsed() {
        return gasUsed;
    }

    public void setEvents(List<Events> events) {
        this.events = events;
    }

    public List<Events> getEvents() {
        return events;
    }

}