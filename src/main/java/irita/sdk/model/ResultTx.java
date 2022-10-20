package irita.sdk.model;

import irita.sdk.constant.enums.EventEnum;

import java.util.Optional;

public class ResultTx extends RpcBase {
    private Result result;

    public int getCode() {
        if (result.getCode() != null) { // for sync_tx
            return result.getCode();
        }

        int checkTxCode = this.getResult().getCheck_tx().getCode();
        int deliverTxCode = this.getResult().getDeliver_tx().getCode();
        return checkTxCode | deliverTxCode;
    }

    public String getEventValue(EventEnum eventEnum) {
        return Optional.of(getResult())
                .map(Result::getDeliver_tx)
                .map(x -> x.getEventValue(eventEnum))
                .orElse("");
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public Result getResult() {
        return result;
    }

}