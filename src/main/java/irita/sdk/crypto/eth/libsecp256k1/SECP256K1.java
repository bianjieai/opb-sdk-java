package irita.sdk.crypto.eth.libsecp256k1;


import com.sun.jna.ptr.LongByReference;
import irita.sdk.crypto.eth.AbstractSECP256;
import irita.sdk.crypto.eth.SECPPublicKey;
import irita.sdk.crypto.eth.SECPSignature;
import org.apache.tuweni.bytes.Bytes;
import org.apache.tuweni.bytes.Bytes32;
import org.bouncycastle.math.ec.custom.sec.SecP256K1Curve;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Optional;

/*
 * Adapted from the BitcoinJ ECKey (Apache 2 License) implementation:
 * https://github.com/bitcoinj/bitcoinj/blob/master/core/src/main/java/org/bitcoinj/core/ECKey.java
 *
 *
 * Adapted from the web3j (Apache 2 License) implementations:
 * https://github.com/web3j/web3j/crypto/src/main/java/org/web3j/crypto/*.java
 */
public class SECP256K1 extends AbstractSECP256 {

    //private static final Logger LOG = LogManager.getLogger();

    private boolean useNative;

    public static final String CURVE_NAME = "secp256k1";

    public SECP256K1() {
        super(CURVE_NAME, SecP256K1Curve.q);

        // use the native library implementation, if it is available
        useNative = LibSecp256k1.CONTEXT != null;
        if (!useNative) {
            //LOG.info("Native secp256k1 not available");
        }
    }

    @Override
    public Optional<SECPPublicKey> recoverPublicKeyFromSignature(
            final Bytes32 dataHash, final SECPSignature signature) {
        if (useNative) {
            Optional<SECPPublicKey> result = recoverFromSignatureNative(dataHash, signature);
            if (!result.isPresent()) {
                throw new IllegalArgumentException("Could not recover public key");
            } else {
                return result;
            }
        } else {
            return super.recoverPublicKeyFromSignature(dataHash, signature);
        }
    }


    @Override
    protected BigInteger recoverFromSignature(
            final int recId, final BigInteger r, final BigInteger s, final Bytes32 dataHash) {
        if (useNative) {
            return recoverFromSignatureNative(dataHash, new SECPSignature(r, s, (byte) recId))
                    .map(key -> new BigInteger(1, key.getEncoded()))
                    .orElse(null);
        } else {
            return super.recoverFromSignature(recId, r, s, dataHash);
        }
    }

    private Optional<SECPPublicKey> recoverFromSignatureNative(
            final Bytes32 dataHash, final SECPSignature signature) {

        // parse the sig
        final LibSecp256k1.secp256k1_ecdsa_recoverable_signature parsedSignature =
                new LibSecp256k1.secp256k1_ecdsa_recoverable_signature();
        final Bytes encodedSig = signature.encodedBytes();
        if (LibSecp256k1.secp256k1_ecdsa_recoverable_signature_parse_compact(
                LibSecp256k1.CONTEXT,
                parsedSignature,
                encodedSig.slice(0, 64).toArrayUnsafe(),
                encodedSig.get(64))
                == 0) {
            throw new IllegalArgumentException("Could not parse signature");
        }

        // recover the key
        final LibSecp256k1.secp256k1_pubkey newPubKey = new LibSecp256k1.secp256k1_pubkey();
        if (LibSecp256k1.secp256k1_ecdsa_recover(
                LibSecp256k1.CONTEXT, newPubKey, parsedSignature, dataHash.toArrayUnsafe())
                == 0) {
            return Optional.empty();
        }

        // parse the key
        final ByteBuffer recoveredKey = ByteBuffer.allocate(65);
        final LongByReference keySize = new LongByReference(recoveredKey.limit());
        LibSecp256k1.secp256k1_ec_pubkey_serialize(
                LibSecp256k1.CONTEXT, recoveredKey, keySize, newPubKey, LibSecp256k1.SECP256K1_EC_UNCOMPRESSED);

        return Optional.of(
                SECPPublicKey.create(Bytes.wrapByteBuffer(recoveredKey).slice(1), ALGORITHM));
    }
}
