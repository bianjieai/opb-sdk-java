/**
 * Copyright 2021 jb51.net
 */
package irita.sdk.model.tx;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * Auto-generated: 2021-11-01 13:58:11
 *
 * @author jb51.net (i@jb51.net)
 * @website http://tools.jb51.net/code/json2javabean
 */
public class TxResult {

    private int code;
    private String data;
    private String log;
    private String info;
    @JSONField(name = "gas_wanted")
    private String gasWanted;
    @JSONField(name = "gas_used")
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