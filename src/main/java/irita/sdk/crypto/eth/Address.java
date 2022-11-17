package irita.sdk.crypto.eth;

import com.fasterxml.jackson.annotation.JsonCreator;
import org.apache.tuweni.bytes.Bytes;
import org.apache.tuweni.bytes.Bytes32;
import org.apache.tuweni.bytes.DelegatingBytes;

public class Address extends DelegatingBytes {

    public static final int SIZE = 20;

    public Address(final Bytes bytes) {
        super(bytes);
    }

    public static Address wrap(final Bytes value) {
        return new Address(value);
    }


    public static Address extract(final Bytes32 hash) {
        return wrap(hash.slice(12, 20));
    }


    @JsonCreator
    public static Address fromHexString(final String str) {
        if (str == null) return null;
        return wrap(Bytes.fromHexStringLenient(str, SIZE));
    }
}
