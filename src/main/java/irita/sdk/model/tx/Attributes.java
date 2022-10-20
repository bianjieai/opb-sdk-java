package irita.sdk.model.tx;

public class Attributes {

    private String key;
    private String value;
    private boolean index;

    public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setIndex(boolean index) {
        this.index = index;
    }

    public boolean getIndex() {
        return index;
    }

}