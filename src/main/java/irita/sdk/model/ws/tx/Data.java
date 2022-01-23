package irita.sdk.model.ws.tx;

public class Data {
    private String type;
    private Value value;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Value getValue() {
        return value;
    }
}