/**
 * Copyright 2021 jb51.net
 */
package irita.sdk.model.block;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * Auto-generated: 2021-11-01 9:42:4
 *
 * @author jb51.net (i@jb51.net)
 * @website http://tools.jb51.net/code/json2javabean
 */
public class Results {

    @JSONField(name = "DeliverTx")
    private List<Delivertx> delivertx;
    @JSONField(name = "EndBlock")
    private Endblock endblock;
    @JSONField(name = "BeginBlock")
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