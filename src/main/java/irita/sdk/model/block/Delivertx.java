/**
 * Copyright 2021 jb51.net
 */
package irita.sdk.model.block;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * Auto-generated: 2021-11-01 9:42:4
 *
 * @author jb51.net (i@jb51.net)
 * @website http://tools.jb51.net/code/json2javabean
 */
public class Delivertx {

    private int code;
    private String log;
    @JSONField(name = "gas_wanted")
    private int gasWanted;
    @JSONField(name = "gas_used")
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