package irita.sdk.client;

import irita.sdk.config.ClientConfig;
import irita.sdk.config.OpbConfig;
import irita.sdk.key.KeyManager;
import irita.sdk.module.bank.BankClient;
import irita.sdk.module.nft.NftClient;
import irita.sdk.module.tibc.TibcClient;

public class IritaClient {
    private BaseClient baseClient;
    private NftClient nftClient;
    private BankClient bankClient;
    private TibcClient tibcClient;

    private IritaClient() {
    }

    public IritaClient(ClientConfig clientConfig, OpbConfig opbConfig, KeyManager km) {
        BaseClient baseClient = new BaseClient(clientConfig, opbConfig, km);
        this.baseClient = baseClient;
        this.nftClient = new NftClient(baseClient);
        this.bankClient = new BankClient(baseClient);
        this.tibcClient = new TibcClient(baseClient);
    }


    public BaseClient getBaseClient() {
        return baseClient;
    }

    public IritaClient setBaseClient(BaseClient baseClient) {
        this.baseClient = baseClient;
        return this;
    }

    public NftClient getNftClient() {
        return nftClient;
    }

    public IritaClient setNftClient(NftClient nftClient) {
        this.nftClient = nftClient;
        return this;
    }

    public BankClient getBankClient() {
        return bankClient;
    }

    public IritaClient setBankClient(BankClient bankClient) {
        this.bankClient = bankClient;
        return this;
    }

    public TibcClient getTibcClient() {
        return tibcClient;
    }

    public IritaClient setTibcClient(TibcClient tibcClient) {
        this.tibcClient = tibcClient;
        return this;
    }
}
