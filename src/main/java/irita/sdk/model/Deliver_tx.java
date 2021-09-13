package irita.sdk.model;

import irita.sdk.constant.enums.EventEnum;

import java.util.Base64;


public class Deliver_tx {
    private int code;
    private String data;
    private String log;
    private String info;
    private String gas_wanted;
    private String gas_used;
    private StringEvent[] events;
    private String codespace;

    public String getEventValue(EventEnum eventEnum) {
        for (StringEvent e : events) {
            if (eventEnum.getType().equals(e.getType())) {
                for (StringEvent.Attribute attr : e.getAttributes()) {
                    String key = new String(Base64.getDecoder().decode(attr.key));

                    if (eventEnum.getKey().equals(key)) {
                        byte[] value = Base64.getDecoder().decode(attr.value);
                        return new String(value);
                    }
                }
            }
        }
        return "";
    }

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

    public void setGas_wanted(String gas_wanted) {
        this.gas_wanted = gas_wanted;
    }

    public String getGas_wanted() {
        return gas_wanted;
    }

    public void setGas_used(String gas_used) {
        this.gas_used = gas_used;
    }

    public String getGas_used() {
        return gas_used;
    }

    public void setEvents(StringEvent[] events) {
        this.events = events;
    }

    public StringEvent[] getEvents() {
        return events;
    }

    public void setCodespace(String codespace) {
        this.codespace = codespace;
    }

    public String getCodespace() {
        return codespace;
    }

}