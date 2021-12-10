package irita.sdk.model.block;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Endblock {
    private List<String> events;
    @JsonProperty(value = "validator_updates")
    private String validatorUpdates;

    public void setEvents(List<String> events) {
        this.events = events;
    }

    public List<String> getEvents() {
        return events;
    }

    public void setValidatorUpdates(String validatorUpdates) {
        this.validatorUpdates = validatorUpdates;
    }

    public String getValidatorUpdates() {
        return validatorUpdates;
    }

}