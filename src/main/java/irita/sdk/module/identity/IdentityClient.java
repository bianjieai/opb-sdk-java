package irita.sdk.module.identity;

import com.google.protobuf.GeneratedMessageV3;
import irita.sdk.client.BaseClient;
import irita.sdk.model.Account;
import irita.sdk.model.BaseTx;
import irita.sdk.model.ResultTx;
import proto.identity.IdentityOuterClass;
import proto.identity.Tx;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class IdentityClient {
    private final BaseClient baseClient;

    public IdentityClient(BaseClient baseClient) {
        this.baseClient = baseClient;
    }

    public ResultTx createIdentity(String id, String pubkey, String pubkey_algo, String certificate, String credentials, BaseTx baseTx) throws IOException {
        Account account = baseClient.queryAccount(baseTx);

        IdentityOuterClass.PubKeyInfo pubKeyInfo = IdentityOuterClass.PubKeyInfo.newBuilder()
                .setPubKey(pubkey)
                .setAlgorithm(IdentityOuterClass.PubKeyAlgorithm.valueOf(pubkey_algo))
                .build();
        Tx.MsgCreateIdentity msg = Tx.MsgCreateIdentity.newBuilder()
                .setId(id).setPubKey(pubKeyInfo)
                .setCertificate(certificate)
                .setCredentials(credentials).
                setOwner(account.getAddress())
                .build();
        List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
        return baseClient.buildAndSend(msgs, baseTx, account);
    }

    public ResultTx updateIdentity(String id, String pubkey, String pubkey_algo, String certificate, String credentials, BaseTx baseTx) throws IOException {
        Account account = baseClient.queryAccount(baseTx);
        IdentityOuterClass.PubKeyInfo pubKeyInfo = IdentityOuterClass.PubKeyInfo.newBuilder()
                .setPubKey(pubkey)
                .setAlgorithm(IdentityOuterClass.PubKeyAlgorithm.valueOf(pubkey_algo))
                .build();
        Tx.MsgUpdateIdentity msg = Tx.MsgUpdateIdentity.newBuilder()
                .setId(id)
                .setPubKey(pubKeyInfo)
                .setCertificate(certificate)
                .setCredentials(credentials)
                .setOwner(account.getAddress())
                .build();

        List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
        return baseClient.buildAndSend(msgs, baseTx, account);
    }

}
