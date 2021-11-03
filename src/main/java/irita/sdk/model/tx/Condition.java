package irita.sdk.model.tx;

import org.apache.commons.lang3.StringUtils;

public class Condition {
    private String key;
    private Object value;
    private String op;

    public Condition(String key) {
        this.key = key;
    }

    public static Condition newCond(String typ, String attrKey) {
        return new Condition(String.format("%s.%s", typ, attrKey));
    }

    public Condition lte(Object value) {
        return this.fill(value, "<=");
    }

    public Condition gte(Object value) {
        return this.fill(value, ">=");
    }

    public Condition lt(Object value) {
        return this.fill(value, "<");
    }

    public Condition gt(Object value) {
        return this.fill(value, ">");
    }

    public Condition eq(Object value) {
        return this.fill(value, "=");
    }

    private Condition fill(Object value, String op) {
        this.value = value;
        this.op = op;
        return this;
    }

    @Override
    public String toString() {
        if (StringUtils.isEmpty(this.key) || StringUtils.isEmpty(this.op)) {
            return "";
        }
        return String.format("%s%s'%s'", this.key, this.op, this.value);
    }
}
