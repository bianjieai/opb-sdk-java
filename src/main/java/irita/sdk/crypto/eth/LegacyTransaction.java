package irita.sdk.crypto.eth;


import irita.sdk.util.Bech32Utils;
import org.apache.tuweni.bytes.Bytes;
import org.apache.tuweni.bytes.Bytes32;
import org.apache.tuweni.bytes.MutableBytes;
import org.apache.tuweni.units.bigints.UInt256;
import org.bouncycastle.asn1.sec.SECNamedCurves;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.web3j.utils.Numeric;
import proto.ethermint.evm.v1.Tx;

import java.math.BigInteger;
import java.util.Optional;
import java.util.function.Consumer;

import static com.google.common.base.Preconditions.checkArgument;

public class LegacyTransaction {

    public  BigInteger curveOrder;

    private long nonce;

    private Optional<Wei> gasPrice;

    private Optional<Wei> maxPriorityFeePerGas;

    private Optional<Wei> maxFeePerGas;

    private long gasLimit;

    private Optional<Address> to;

    private Wei value;

    private SECPSignature signature;

    private Bytes payload;

    private Optional<BigInteger> chainId;

    private Optional<BigInteger> v;

    private volatile Bytes32 hashNoSignature;

    protected volatile Address sender;

    private TransactionType transactionType;

    private final SignatureAlgorithm instance = null;

    public SignatureAlgorithm getInstance() {

        if (instance != null) {
            return instance;
        }
        return SignatureAlgorithmType.DEFAULT_SIGNATURE_ALGORITHM_TYPE.get();
    }

    public LegacyTransaction(Tx.LegacyTx legacyTx) {
        this.transactionType = TransactionType.FRONTIER;
        this.nonce = legacyTx.getNonce();
        this.gasPrice =  Optional.of(Wei.of(Long.parseLong(legacyTx.getGasPrice())));
        this.maxFeePerGas =  Optional.empty();
        this.gasLimit = legacyTx.getGas();
        this.to = Optional.of(Address.fromHexString(legacyTx.getTo()));
        this.value = Wei.of(Long.parseLong(legacyTx.getValue()));
        this.signature = getSignature(Numeric.toBigInt(legacyTx.getR().toByteArray()), Numeric.toBigInt(legacyTx.getS().toByteArray()), new Byte((byte) (legacyTx.getV().toByteArray()[0]-27)+""), getCurveOrder(curveOrder));
        this.payload =Bytes.wrap(legacyTx.getData().toByteArray());
        this.sender =null;
        this.chainId =Optional.empty();
        this.v =Optional.of(Numeric.toBigInt(legacyTx.getV().toByteArray()));
        this.maxPriorityFeePerGas = Optional.empty();
    }


    private SECPSignature getSignature(BigInteger R, BigInteger S, byte recId, BigInteger curveOrder) {
        return SECPSignature.create(R, S, recId, curveOrder);
    }

    public SECPSignature getSignature(){
        return signature;
    }

    private BigInteger getCurveOrder (BigInteger curveOrder){
        if (curveOrder == null){
            X9ECParameters params = SECNamedCurves.getByName("secp256k1");
            ECDomainParameters curve =new ECDomainParameters(params.getCurve(), params.getG(), params.getN(), params.getH());
            return curve.getN();
        }
        return curveOrder;
    }

    public String getSender() {
        if (sender == null) {
            final SECPPublicKey publicKey =
                    getInstance()
                            .recoverPublicKeyFromSignature(getOrComputeSenderRecoveryHash(), signature)
                            .orElseThrow(
                                    () ->
                                            new IllegalStateException(
                                                    "Cannot recover public key from signature for " + this));
            sender = Address.extract(Hash.hash(publicKey.getEncodedBytes()));
        }
        String addr = sender.toHexString().substring(2);
        return Bech32Utils.hexToBech32("iaa",Numeric.cleanHexPrefix(addr));
    }

    private Bytes32 getOrComputeSenderRecoveryHash() {
        if (hashNoSignature == null) {
            hashNoSignature =
                    computeSenderRecoveryHash(
                            transactionType,
                            nonce,
                            gasPrice.orElse(null),
                            maxPriorityFeePerGas.orElse(null),
                            maxFeePerGas.orElse(null),
                            gasLimit,
                            to,
                            value,
                            payload,
                            chainId);
        }
        return hashNoSignature;
    }

    private Bytes32 computeSenderRecoveryHash(final TransactionType transactionType, final long nonce, final Wei gasPrice, final Wei maxPriorityFeePerGas, final Wei maxFeePerGas, final long gasLimit, final Optional<Address> to, final Wei value, final Bytes payload, final Optional<BigInteger> chainId) {
        if (transactionType.requiresChainId()) {
            checkArgument(chainId.isPresent(), "Transaction type %s requires chainId", transactionType);
        }
        final Bytes preimage = frontierPreimage(nonce, gasPrice, gasLimit, to, value, payload, chainId);
        return Hash.keccak256(preimage);
    }

    private Bytes frontierPreimage(final long nonce, final Wei gasPrice, final long gasLimit, final Optional<Address> to, final Wei value, final Bytes payload, final Optional<BigInteger> chainId) {
        return encode(
                rlpOutput -> {
                    rlpOutput.startList();
                    rlpOutput.writeLongScalar(nonce);
                    rlpOutput.writeUInt256Scalar(gasPrice);
                    rlpOutput.writeLongScalar(gasLimit);
                    rlpOutput.writeBytes(to.map(Bytes::copy).orElse(Bytes.EMPTY));
                    rlpOutput.writeUInt256Scalar(value);
                    rlpOutput.writeBytes(payload);
                    if (chainId.isPresent()) {
                        rlpOutput.writeBigIntegerScalar(chainId.get());
                        rlpOutput.writeUInt256Scalar(UInt256.ZERO);
                        rlpOutput.writeUInt256Scalar(UInt256.ZERO);
                    }
                    rlpOutput.endList();
                });
    }

    public Bytes encode(final Consumer<RLPOutput> writer) {
        final BytesValueRLPOutput out = new BytesValueRLPOutput();
        writer.accept(out);
        return out.encoded();
    }

    public class BytesValueRLPOutput extends AbstractRLPOutput {
        public Bytes encoded() {
            final int size = encodedSize();
            if (size == 0) {
                return Bytes.EMPTY;
            }

            final MutableBytes output = MutableBytes.create(size);
            writeEncoded(output);
            return output;
        }
    }
}
