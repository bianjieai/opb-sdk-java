package irita.sdk.model.ws.tx;

public class Result {
    private String query;
    private Data data;
    private Events events;

    public void setQuery(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void setEvents(Events events) {
        this.events = events;
    }

    public Events getEvents() {
        return events;
    }

}