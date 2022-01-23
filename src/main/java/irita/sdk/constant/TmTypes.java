package irita.sdk.constant;

// Reserved event types (alphabetically sorted).
public class TmTypes {
    // Block level events for mass consumption by users.
    // These events are triggered from the state package,
    // after a block has been committed.
    // These are also used by the tx indexer for async indexing.
    // All of this data can be fetched through the rpc.
    public static final String EVENT_NEW_BLOCK = "NewBlock";
    public static final String EVENT_NEW_BLOCK_HEADER = "NewBlockHeader";
    public static final String EVENT_NEW_EVIDENCE = "NewEvidence";
    public static final String EVENT_TX = "Tx";
    public static final String EVENT_VALIDATOR_SET_UPDATES = "ValidatorSetUpdates";


    // Internal consensus events.
    // These are used for testing the consensus state machine.
    // They can also be used to build real-time consensus visualizers.
    public static final String EVENT_COMPLETE_PROPOSAL = "CompleteProposal";
    public static final String EVENT_LOCK = "Lock";
    public static final String EVENT_NEW_ROUND = "NewRound";
    public static final String EVENT_POLKA = "Polka";
    public static final String EVENT_RELOCK = "Relock";
    public static final String EVENT_TIMEOUT_PROPOSE = "TimeoutPropose";
    public static final String EVENT_TIMEOUT_WAIT = "TimeoutWait";
    public static final String EVENT_UNLOCK = "Unlock";
    public static final String EVENT_VALID_BLOCK = "ValidBlock";
    public static final String EVENT_VOTE = "Vote";
}
