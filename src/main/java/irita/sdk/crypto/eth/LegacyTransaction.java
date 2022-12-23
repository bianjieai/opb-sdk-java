package irita.sdk.crypto.eth;


import irita.sdk.util.Bech32Utils;
import org.apache.tuweni.bytes.Bytes;
import org.apache.tuweni.bytes.Bytes32;
import org.apache.tuweni.bytes.MutableBytes;
import org.apache.tuweni.units.bigints.UInt256;
import org.bouncycastle.asn1.sec.SECNamedCurves;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.jetbrains.annotations.NotNull;
import org.web3j.utils.Numeric;
import proto.ethermint.evm.v1.Evm;
import proto.ethermint.evm.v1.Tx;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import static com.google.common.base.Preconditions.checkArgument;
import static irita.sdk.constant.Constant.IRITA_EVM_CHAIN_ID;
import static irita.sdk.constant.Constant.IRITA_EVM_CHAIN_ID_MUL;

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
    private Optional<List<AccessListEntry>> maybeAccessList;

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
        this.signature = getSignature(Numeric.toBigInt(legacyTx.getR().toByteArray()), Numeric.toBigInt(legacyTx.getS().toByteArray()), getV(legacyTx.getV().toByteArray()), getCurveOrder(curveOrder));
        this.payload =Bytes.wrap(legacyTx.getData().toByteArray());
        this.sender =null;
        this.chainId = getChainId(legacyTx.getV().toByteArray());
        this.v =Optional.of(Numeric.toBigInt(legacyTx.getV().toByteArray()));
        this.maxPriorityFeePerGas = Optional.empty();
    }
    public LegacyTransaction(Tx.DynamicFeeTx dynamicFeeTx) {
        this.transactionType = TransactionType.EIP1559;
        this.nonce = dynamicFeeTx.getNonce();
        this.gasPrice =  Optional.empty();
        this.maxFeePerGas =  Optional.of(Wei.of(Long.parseLong(dynamicFeeTx.getGasTipCap())));
        this.gasLimit = dynamicFeeTx.getGas();
        this.to = Optional.of(Address.fromHexString(dynamicFeeTx.getTo()));
        this.value = Wei.of(Long.parseLong(dynamicFeeTx.getValue()));
        this.signature = getSignature(Numeric.toBigInt(dynamicFeeTx.getR().toByteArray()), Numeric.toBigInt(dynamicFeeTx.getS().toByteArray()), getV(dynamicFeeTx.getV().toByteArray()), getCurveOrder(curveOrder));
        this.payload =Bytes.wrap(dynamicFeeTx.getData().toByteArray());
        this.maybeAccessList =getMaybeAccessList(dynamicFeeTx.getAccessesList());
        this.sender =null;
        this.chainId = Optional.of(new BigInteger(IRITA_EVM_CHAIN_ID));
        this.v =Optional.of(Numeric.toBigInt(dynamicFeeTx.getV().toByteArray()));
        this.maxPriorityFeePerGas = Optional.of(Wei.of(Long.parseLong(dynamicFeeTx.getGasFeeCap())));
    }

    public LegacyTransaction(Tx.AccessListTx accessListTx) {
        this.transactionType = TransactionType.ACCESS_LIST;
        this.nonce = accessListTx.getNonce();
        this.gasPrice =  Optional.of(Wei.of(Long.parseLong(accessListTx.getGasPrice())));
        this.maxFeePerGas =  Optional.empty();
        this.gasLimit = accessListTx.getGas();
        this.to = Optional.of(Address.fromHexString(accessListTx.getTo()));
        this.value = Wei.of(Long.parseLong(accessListTx.getValue()));
        this.signature = getSignature(Numeric.toBigInt(accessListTx.getR().toByteArray()), Numeric.toBigInt(accessListTx.getS().toByteArray()), getV(accessListTx.getV().toByteArray()), getCurveOrder(curveOrder));
        this.payload =Bytes.wrap(accessListTx.getData().toByteArray());
        this.sender =null;
        this.chainId = getChainId(accessListTx.getV().toByteArray());
        this.v =Optional.of(Numeric.toBigInt(accessListTx.getV().toByteArray()));
        this.maxPriorityFeePerGas = Optional.empty();
        this.maybeAccessList =getMaybeAccessList(accessListTx.getAccessesList());
    }

    @NotNull
    private Optional<BigInteger> getChainId(byte[] vb) {
        if (vb.length == 0){
            return Optional.empty();
        }
        BigInteger v = new BigInteger(vb);
        if (v.compareTo(new BigInteger(IRITA_EVM_CHAIN_ID).multiply(new BigInteger(IRITA_EVM_CHAIN_ID_MUL))) > 0) {
            return Optional.of(new BigInteger(IRITA_EVM_CHAIN_ID));
        }
        return Optional.empty();
    }

    private byte getV(byte[] txv) {
        if (txv.length == 0){
            return Byte.parseByte("0");
        }
        BigInteger v = new BigInteger(txv);
        if (v.compareTo(new BigInteger(IRITA_EVM_CHAIN_ID).multiply(new BigInteger(IRITA_EVM_CHAIN_ID_MUL))) > 0) {
            v = v.subtract(new BigInteger(IRITA_EVM_CHAIN_ID).multiply(new BigInteger(IRITA_EVM_CHAIN_ID_MUL))).subtract(new BigInteger("8"));
        }
        if (v.compareTo(BigInteger.valueOf(27L)) >= 0){
            v = v.subtract(new BigInteger("27"));
        }
        return v.toByteArray()[0];
    }

    private Optional<List<AccessListEntry>> getMaybeAccessList(List<Evm.AccessTuple> accessTuple){
        List<AccessListEntry> accessListEntries = new ArrayList<>();
        for (int i=0;i<accessTuple.size();i++){
            List<String> storeKeys = new ArrayList<>();
            storeKeys.add(accessTuple.get(i).getStorageKeys(i));
            AccessListEntry accessListEntry = AccessListEntry.createAccessListEntry(Address.fromHexString(accessTuple.get(i).getAddress()),storeKeys);
            accessListEntries.add(accessListEntry);
        }
        return Optional.of(accessListEntries);
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
                            maybeAccessList,
                            chainId);
        }
        return hashNoSignature;
    }

    private Bytes32 computeSenderRecoveryHash(final TransactionType transactionType, final long nonce, final Wei gasPrice, final Wei maxPriorityFeePerGas, final Wei maxFeePerGas, final long gasLimit, final Optional<Address> to, final Wei value, final Bytes payload,final Optional<List<AccessListEntry>> accessList, final Optional<BigInteger> chainId) {
        if (transactionType.requiresChainId()) {
            checkArgument(chainId.isPresent(), "Transaction type %s requires chainId", transactionType);
        }
        /*final Bytes preimage = frontierPreimage(nonce, gasPrice, gasLimit, to, value, payload, chainId);
        return Hash.keccak256(preimage);*/
        final Bytes preimage;
        switch (transactionType) {
            case FRONTIER:
                preimage = frontierPreimage(nonce, gasPrice, gasLimit, to, value, payload, chainId);
                break;
            case EIP1559:
                preimage =
                        eip1559Preimage(
                                nonce,
                                maxPriorityFeePerGas,
                                maxFeePerGas,
                                gasLimit,
                                to,
                                value,
                                payload,
                                chainId,
                                accessList);
                break;
            case ACCESS_LIST:
                preimage =
                        accessListPreimage(
                                nonce,
                                gasPrice,
                                gasLimit,
                                to,
                                value,
                                payload,
                                accessList.orElseThrow(
                                        () ->
                                                new IllegalStateException(
                                                        "Developer error: the transaction should be guaranteed to have an access list here")),
                                chainId);
                break;
            default:
                throw new IllegalStateException(
                        "Developer error. Didn't specify signing hash preimage computation");
        }
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

    private Bytes eip1559Preimage(
            final long nonce,
            final Wei maxPriorityFeePerGas,
            final Wei maxFeePerGas,
            final long gasLimit,
            final Optional<Address> to,
            final Wei value,
            final Bytes payload,
            final Optional<BigInteger> chainId,
            final Optional<List<AccessListEntry>> accessList) {
        final Bytes encoded =
                encode(
                        rlpOutput -> {
                            rlpOutput.startList();
                            rlpOutput.writeBigIntegerScalar(chainId.orElseThrow());
                            rlpOutput.writeLongScalar(nonce);
                            rlpOutput.writeUInt256Scalar(maxPriorityFeePerGas);
                            rlpOutput.writeUInt256Scalar(maxFeePerGas);
                            rlpOutput.writeLongScalar(gasLimit);
                            rlpOutput.writeBytes(to.map(Bytes::copy).orElse(Bytes.EMPTY));
                            rlpOutput.writeUInt256Scalar(value);
                            rlpOutput.writeBytes(payload);
                            writeAccessList(rlpOutput, accessList);
                            rlpOutput.endList();
                        });
        return Bytes.concatenate(Bytes.of(TransactionType.EIP1559.getSerializedType()), encoded);
    }

    public Bytes encode(final Consumer<RLPOutput> writer) {
        final BytesValueRLPOutput out = new BytesValueRLPOutput();
        writer.accept(out);
        return out.encoded();
    }
    public static void writeAccessList(
            final RLPOutput out, final Optional<List<AccessListEntry>> accessListEntries) {
        if (accessListEntries.isEmpty()) {
            out.writeEmptyList();
        } else {
            out.writeList(
                    accessListEntries.get(),
                    (accessListEntry, accessListEntryRLPOutput) -> {
                        accessListEntryRLPOutput.startList();
                        out.writeBytes(accessListEntry.getAddress());
                        out.writeList(
                                accessListEntry.getStorageKeys(),
                                (storageKeyBytes, storageKeyBytesRLPOutput) ->
                                        storageKeyBytesRLPOutput.writeBytes(storageKeyBytes));
                        accessListEntryRLPOutput.endList();
                    });
        }
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

    private Bytes accessListPreimage(
            final long nonce,
            final Wei gasPrice,
            final long gasLimit,
            final Optional<Address> to,
            final Wei value,
            final Bytes payload,
            final List<AccessListEntry> accessList,
            final Optional<BigInteger> chainId) {
        final Bytes encode =
                encode(
                        rlpOutput -> {
                            rlpOutput.startList();
                            encodeAccessListInner(
                                    chainId, nonce, gasPrice, gasLimit, to, value, payload, accessList, rlpOutput);
                            rlpOutput.endList();
                        });
        return Bytes.concatenate(Bytes.of(TransactionType.ACCESS_LIST.getSerializedType()), encode);
    }

    public static void encodeAccessListInner(
            final Optional<BigInteger> chainId,
            final long nonce,
            final Wei gasPrice,
            final long gasLimit,
            final Optional<Address> to,
            final Wei value,
            final Bytes payload,
            final List<AccessListEntry> accessList,
            final RLPOutput rlpOutput) {
        rlpOutput.writeBigIntegerScalar(chainId.orElseThrow());
        rlpOutput.writeLongScalar(nonce);
        rlpOutput.writeUInt256Scalar(gasPrice);
        rlpOutput.writeLongScalar(gasLimit);
        rlpOutput.writeBytes(to.map(Bytes::copy).orElse(Bytes.EMPTY));
        rlpOutput.writeUInt256Scalar(value);
        rlpOutput.writeBytes(payload);
    /*
    Access List encoding should look like this
    where hex strings represent raw bytes
    [
      [
        "0xde0b295669a9fd93d5f28d9ec85e40f4cb697bae",
        [
          "0x0000000000000000000000000000000000000000000000000000000000000003",
          "0x0000000000000000000000000000000000000000000000000000000000000007"
        ]
      ],
      [
        "0xbb9bc244d798123fde783fcc1c72d3bb8c189413",
        []
      ]
    ] */
        writeAccessList(rlpOutput, Optional.of(accessList));
    }
}
