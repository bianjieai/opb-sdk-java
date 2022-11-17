package irita.sdk.crypto.eth;

import org.apache.tuweni.bytes.Bytes32;

import java.util.Optional;

public interface SignatureAlgorithm {
    // needs to be known at compile time otherwise triggers InsecureCryptoUsage error
    String ALGORITHM = "ECDSA";

    Optional<SECPPublicKey> recoverPublicKeyFromSignature(
            final Bytes32 dataHash, final SECPSignature signature);

}
