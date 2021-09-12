package irita.sdk.model;

// StringEvent defines en Event object wrapper where all the attributes
// contain key/value pairs that are strings instead of raw bytes.
public class StringEvent {
    private String type;
    private Attribute[] attributes;

    public static class Attribute {
        public String key;
        public String value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Attribute[] getAttributes() {
        return attributes;
    }

    public void setAttributes(Attribute[] attributes) {
        this.attributes = attributes;
    }
}
