package irita.sdk.model.block;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Results {
    @JsonProperty(value = "DeliverTx")
    private List<Delivertx> delivertx;
    @JsonProperty(value = "EndBlock")
    private Endblock endblock;
    @JsonProperty(value = "BeginBlock")
    private Beginblock beginblock;

    public void setDelivertx(List<Delivertx> delivertx) {
        this.delivertx = delivertx;
    }

    public List<Delivertx> getDelivertx() {
        return delivertx;
    }

    public void setEndblock(Endblock endblock) {
        this.endblock = endblock;
    }

    public Endblock getEndblock() {
        return endblock;
    }

    public void setBeginblock(Beginblock beginblock) {
        this.beginblock = beginblock;
    }

    public Beginblock getBeginblock() {
        return beginblock;
    }

}