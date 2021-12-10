package irita.sdk.model.block;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

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