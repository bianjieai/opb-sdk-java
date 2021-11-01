/**
 * Copyright 2021 jb51.net
 */
package irita.sdk.model.tx;

import java.util.List;

/**
 * Auto-generated: 2021-11-01 13:58:11
 *
 * @author jb51.net (i@jb51.net)
 * @website http://tools.jb51.net/code/json2javabean
 */
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