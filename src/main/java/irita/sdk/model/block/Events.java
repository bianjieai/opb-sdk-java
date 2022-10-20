package irita.sdk.model.block;

import java.util.List;

public class Events {

    private String type;
    private List<Attributes> attributes;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setAttributes(List<Attributes> attributes) {
        this.attributes = attributes;
    }

    public List<Attributes> getAttributes() {
        return attributes;
    }

}