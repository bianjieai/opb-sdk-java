package irita.sdk.model.ws.block;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Validator {

    @JsonProperty(value = "pub_key_types")
    private List<String> pubKeyTypes;

    public void setPubKeyTypes(List<String> pubKeyTypes) {
        this.pubKeyTypes = pubKeyTypes;
    }

    public List<String> getPubKeyTypes() {
        return pubKeyTypes;
    }

}