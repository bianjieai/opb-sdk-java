/**
 * Copyright 2021 jb51.net
 */
package irita.sdk.model.block;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * Auto-generated: 2021-11-01 10:40:28
 *
 * @author jb51.net (i@jb51.net)
 * @website http://tools.jb51.net/code/json2javabean
 */
public class Validator {

    @JSONField(name = "pub_key_types")
    private List<String> pubKeyTypes;

    public void setPubKeyTypes(List<String> pubKeyTypes) {
        this.pubKeyTypes = pubKeyTypes;
    }

    public List<String> getPubKeyTypes() {
        return pubKeyTypes;
    }

}