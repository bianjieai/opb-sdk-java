package irita.sdk.model.ws.block;

import java.util.List;

public class ResultBeginBlock {

    private List<String> events;

    public void setEvents(List<String> events) {
        this.events = events;
    }

    public List<String> getEvents() {
        return events;
    }

}