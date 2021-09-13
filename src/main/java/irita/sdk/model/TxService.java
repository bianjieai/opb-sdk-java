package irita.sdk.model;

import irita.sdk.exception.IritaSDKException;
import org.bouncycastle.crypto.CryptoException;
import proto.cosmos.tx.v1beta1.TxOuterClass;

import java.io.IOException;

public interface TxService {

    /**
     * Single sign a transaction
     *
     * @param txBody  TxBody to be signed
     * @param offline Offline signing, default `false`
     * @return The signed tx
     * @throws IritaSDKException if the signing failed
     */
    TxOuterClass.Tx signTx(BaseTx baseTx, TxOuterClass.TxBody txBody, boolean offline) throws IritaSDKException, IOException, CryptoException;

    /**
     * verify a transaction
     *
     * @param tx
     * @param providerAddress
     * @param pubKey
     * @return
     * @throws IritaSDKException
     */
/*    boolean verifyTx(TxOuterClass.Tx tx, String providerAddress, String pubKey) throws IritaSDKException, IOException;

    void setOptions(IritaClientOption options);*/
}