package irita.sdk.model.ws.block;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import irita.sdk.model.Events;

public class ResultEndBlock {

    @JsonProperty(value = "validator_updates")
    private List<String> validatorUpdates;
    @JsonProperty(value = "consensus_param_updates")
    private ConsensusParamUpdates consensusParamUpdates;
    private List<Events> events;

    public void setValidatorUpdates(List<String> validatorUpdates) {
        this.validatorUpdates = validatorUpdates;
    }

    public List<String> getValidatorUpdates() {
        return validatorUpdates;
    }

    public void setConsensusParamUpdates(ConsensusParamUpdates consensusParamUpdates) {
        this.consensusParamUpdates = consensusParamUpdates;
    }

    public ConsensusParamUpdates getConsensusParamUpdates() {
        return consensusParamUpdates;
    }

    public void setEvents(List<Events> events) {
        this.events = events;
    }

    public List<Events> getEvents() {
        return events;
    }

}