package irita.sdk.model.ws.tx;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Events {
    @JsonProperty("coin_received.receiver")
    private List<String> coinReceivedReceiver;
    @JsonProperty("message.sender")
    private List<String> messageSender;
    @JsonProperty("complete_batch.request_context_id")
    private List<String> completeBatchRequestContextId;
    @JsonProperty("message.module")
    private List<String> messageModule;
    @JsonProperty("tx.signature")
    private List<String> txSignature;
    @JsonProperty("transfer.sender")
    private List<String> transferSender;
    @JsonProperty("transfer.amount")
    private List<String> transferAmount;
    @JsonProperty("respond_service.service_name")
    private List<String> respondServiceServiceName;
    @JsonProperty("respond_service.consumer")
    private List<String> respondServiceConsumer;
    @JsonProperty("tx.height")
    private List<String> txHeight;
    @JsonProperty("tx.acc_seq")
    private List<String> txAccSeq;
    @JsonProperty("coin_spent.spender")
    private List<String> coinSpentSpender;
    @JsonProperty("respond_service.request_context_id")
    private List<String> respondServiceRequestContextId;
    @JsonProperty("respond_service.provider")
    private List<String> respondServiceProvider;
    @JsonProperty("message.action")
    private List<String> messageAction;
    @JsonProperty("complete_batch.request_context_state")
    private List<String> completeBatchRequestContextState;
    @JsonProperty("respond_service.request_id")
    private List<String> respondServiceRequestId;
    @JsonProperty("tm.event")
    private List<String> tmEvent;
    @JsonProperty("coin_spent.amount")
    private List<String> coinSpentAmount;
    @JsonProperty("coin_received.amount")
    private List<String> coinReceivedAmount;
    @JsonProperty("transfer.recipient")
    private List<String> transferRecipient;
    @JsonProperty("tx.fee")
    private List<String> txFee;
    @JsonProperty("tx.hash")
    private List<String> txHash;

    public List<String> getCoinReceivedReceiver() {
        return coinReceivedReceiver;
    }

    public Events setCoinReceivedReceiver(List<String> coinReceivedReceiver) {
        this.coinReceivedReceiver = coinReceivedReceiver;
        return this;
    }

    public List<String> getMessageSender() {
        return messageSender;
    }

    public Events setMessageSender(List<String> messageSender) {
        this.messageSender = messageSender;
        return this;
    }

    public List<String> getCompleteBatchRequestContextId() {
        return completeBatchRequestContextId;
    }

    public Events setCompleteBatchRequestContextId(List<String> completeBatchRequestContextId) {
        this.completeBatchRequestContextId = completeBatchRequestContextId;
        return this;
    }

    public List<String> getMessageModule() {
        return messageModule;
    }

    public Events setMessageModule(List<String> messageModule) {
        this.messageModule = messageModule;
        return this;
    }

    public List<String> getTxSignature() {
        return txSignature;
    }

    public Events setTxSignature(List<String> txSignature) {
        this.txSignature = txSignature;
        return this;
    }

    public List<String> getTransferSender() {
        return transferSender;
    }

    public Events setTransferSender(List<String> transferSender) {
        this.transferSender = transferSender;
        return this;
    }

    public List<String> getTransferAmount() {
        return transferAmount;
    }

    public Events setTransferAmount(List<String> transferAmount) {
        this.transferAmount = transferAmount;
        return this;
    }

    public List<String> getRespondServiceServiceName() {
        return respondServiceServiceName;
    }

    public Events setRespondServiceServiceName(List<String> respondServiceServiceName) {
        this.respondServiceServiceName = respondServiceServiceName;
        return this;
    }

    public List<String> getRespondServiceConsumer() {
        return respondServiceConsumer;
    }

    public Events setRespondServiceConsumer(List<String> respondServiceConsumer) {
        this.respondServiceConsumer = respondServiceConsumer;
        return this;
    }

    public List<String> getTxHeight() {
        return txHeight;
    }

    public Events setTxHeight(List<String> txHeight) {
        this.txHeight = txHeight;
        return this;
    }

    public List<String> getTxAccSeq() {
        return txAccSeq;
    }

    public Events setTxAccSeq(List<String> txAccSeq) {
        this.txAccSeq = txAccSeq;
        return this;
    }

    public List<String> getCoinSpentSpender() {
        return coinSpentSpender;
    }

    public Events setCoinSpentSpender(List<String> coinSpentSpender) {
        this.coinSpentSpender = coinSpentSpender;
        return this;
    }

    public List<String> getRespondServiceRequestContextId() {
        return respondServiceRequestContextId;
    }

    public Events setRespondServiceRequestContextId(List<String> respondServiceRequestContextId) {
        this.respondServiceRequestContextId = respondServiceRequestContextId;
        return this;
    }

    public List<String> getRespondServiceProvider() {
        return respondServiceProvider;
    }

    public Events setRespondServiceProvider(List<String> respondServiceProvider) {
        this.respondServiceProvider = respondServiceProvider;
        return this;
    }

    public List<String> getMessageAction() {
        return messageAction;
    }

    public Events setMessageAction(List<String> messageAction) {
        this.messageAction = messageAction;
        return this;
    }

    public List<String> getCompleteBatchRequestContextState() {
        return completeBatchRequestContextState;
    }

    public Events setCompleteBatchRequestContextState(List<String> completeBatchRequestContextState) {
        this.completeBatchRequestContextState = completeBatchRequestContextState;
        return this;
    }

    public List<String> getRespondServiceRequestId() {
        return respondServiceRequestId;
    }

    public Events setRespondServiceRequestId(List<String> respondServiceRequestId) {
        this.respondServiceRequestId = respondServiceRequestId;
        return this;
    }

    public List<String> getTmEvent() {
        return tmEvent;
    }

    public Events setTmEvent(List<String> tmEvent) {
        this.tmEvent = tmEvent;
        return this;
    }

    public List<String> getCoinSpentAmount() {
        return coinSpentAmount;
    }

    public Events setCoinSpentAmount(List<String> coinSpentAmount) {
        this.coinSpentAmount = coinSpentAmount;
        return this;
    }

    public List<String> getCoinReceivedAmount() {
        return coinReceivedAmount;
    }

    public Events setCoinReceivedAmount(List<String> coinReceivedAmount) {
        this.coinReceivedAmount = coinReceivedAmount;
        return this;
    }

    public List<String> getTransferRecipient() {
        return transferRecipient;
    }

    public Events setTransferRecipient(List<String> transferRecipient) {
        this.transferRecipient = transferRecipient;
        return this;
    }

    public List<String> getTxFee() {
        return txFee;
    }

    public Events setTxFee(List<String> txFee) {
        this.txFee = txFee;
        return this;
    }

    public List<String> getTxHash() {
        return txHash;
    }

    public Events setTxHash(List<String> txHash) {
        this.txHash = txHash;
        return this;
    }
}