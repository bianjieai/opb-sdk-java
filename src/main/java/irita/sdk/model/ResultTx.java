package irita.sdk.model;

import irita.sdk.constant.enums.EventEnum;

import java.util.Optional;

public class ResultTx extends RpcBase<Result> {
    public int getCode() {
        if (this.getResult().getCode() != null) { // for sync_tx
            return this.getResult().getCode();
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
}