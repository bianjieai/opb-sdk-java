package irita.sdk.model.tx;

import java.util.ArrayList;
import java.util.List;

public class EventQueryBuilder {
    private List<String> conditions = new ArrayList();

    public static EventQueryBuilder newEventQueryBuilder() {
        return new EventQueryBuilder();
    }

    public EventQueryBuilder AddCondition(Condition c) {
        if (c == null) {
            return null;
        }
        this.conditions.add(c.toString());
        return this;
    }

    public String build() {
        StringBuilder sb = new StringBuilder();
        for (String condition : this.conditions) {
            if (sb.length() > 0) {
                sb.append(" AND ");
            }
            sb.append(condition);
        }
        return sb.toString();
    }
}
