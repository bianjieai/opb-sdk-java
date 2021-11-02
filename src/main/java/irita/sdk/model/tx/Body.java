package irita.sdk.model.tx;

import com.google.protobuf.GeneratedMessageV3;

import java.util.List;

public class Body {
    private List<GeneratedMessageV3> msgs;
    private String memo;
    private Long timeOutHeight;

    public List<GeneratedMessageV3> getMsgs() {
        return msgs;
    }

    public void setMsgs(List<GeneratedMessageV3> msgs) {
        this.msgs = msgs;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Long getTimeOutHeight() {
        return timeOutHeight;
    }

    public void setTimeOutHeight(Long timeOutHeight) {
        this.timeOutHeight = timeOutHeight;
    }
}
