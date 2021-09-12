# opb-sdk-java

opb-sdk-java

## Key Manger管理

### 1 恢复私钥

#### 1.1 从助记词恢复（recover from mnemonic）

```java
        String mnemonic="opera xxx ..."；
        KeyManager km=KeyManagerFactory.createDefault();
        km.recover(mnemonic);
```

#### 1.2 从私钥（recover from privKey）

```java
        BigInteger privKey=new BigInteger("3c49175daf981965679bf88d2690e22144424e16c84e9d397ddb58b63603eeec",16);
        KeyManager km=KeyManagerFactory.createKeyManger(AlgoEnum.SM2);
        km.recover(privKey);
```

#### 1.3 从keystore恢复（recover from keystore）

```java
        String keystore="-----BEGIN TENDERMINT PRIVATE KEY-----\n"+
        "salt: 183EF9B57DEF8EF8C3AD9D21DE672E1B\n"+
        "type: sm2\n"+
        "kdf: bcrypt\n"+
        "\n"+
        "cpreEPwi0X3yIdsAIf94fR6s8L1TnDAQd/r4ifID6GmQX5a+4ehMmnTp2JjDpUe5\n"+
        "kpgRI7CzF0DjKpPLvY9V9ZSXJFN42LHWscxqQ1E=\n"+
        "=nJvd\n"+
        "-----END TENDERMINT PRIVATE KEY-----";

        InputStream input=new ByteArrayInputStream(keystore.getBytes(StandardCharsets.UTF_8));
        KeyManager km=KeyManagerFactory.createDefault();
        km.recover(input,"123456");
```

### 2 导出（export）

```java
        BigInteger privKey=new BigInteger("3c49175daf981965679bf88d2690e22144424e16c84e9d397ddb58b63603eeec",16);
        KeyManager km=KeyManagerFactory.createDefault();
        km.recover(privKey);

        String keystore=km.export("123456");
        System.out.println(keystore);
```

## 怎样使用opb-sdk-java（How to use opb-sdk-java）

### 1 初始化OpbClient (连接文昌链)

```java
        String mnemonic = "opera vivid pride shallow brick crew found resist decade neck expect apple chalk belt sick author know try tank detail tree impact hand best";
        KeyManager km = KeyManagerFactory.createDefault();
        km.recover(mnemonic);

        // projectID: 填你的 projectID
        String nodeUri = "https://opbt.bsngate.com:18602/api/projectID/rpc";
        String grpcAddr = "opbt.bsngate.com:18603";
        String chainId = "wenchangchain";
        ClientConfig clientConfig = new ClientConfig(nodeUri, grpcAddr, chainId);
        OpbConfig opbConfig = new OpbConfig(projectID, projectKey: 如果没有填null, km.getAddr());
        OpbConfig opbConfig = null;

        OpbClient client = new OpbClient(clientConfig, opbConfig, km);
        assertEquals("iaa1ytemz2xqq2s73ut3ys8mcd6zca2564a5lfhtm3", km.getAddr());
```

## 使用NFT模块（Use NftClient）

### 1. 新增一个denom（issue denom）

```java
        BaseTx baseTx = new BaseTx(200000, new Fee("200000", "uirita"), BroadcastMode.Commit);
        String denomID = "denomid" + new Random().nextInt(1000);
        String denomName = "test_name" + new Random().nextInt(1000);
        String schema = "no shcema";

        IssueDenomRequest req = new IssueDenomRequest()
        .setId(denomID)
        .setName(denomName)
        .setSchema(schema);
        ResultTx resultTx = nftClient.issueDenom(req, baseTx);
```

### 2. 发行一个nft（mint nft）

```java
        BaseTx baseTx = new BaseTx(200000, new Fee("200000", "uirita"), BroadcastMode.Commit);
        MintNFTRequest mintReq = new MintNFTRequest()
        .setDenom(denomID)
        .setId(nftID)
        .setName(nftName)
        .setUri(uri)
        .setData(data)
        .setRecipient(km.getAddr());
        ResultTx resultTx = nftClient.mintNft(mintReq, baseTx);
```

### 3. 编辑/修改存在的nft（edit nft）

```java
        BaseTx baseTx = new BaseTx(200000, new Fee("200000", "uirita"), BroadcastMode.Commit);
        String newName = "new_name";
        String newUri = "http://xx.com";
        String newData = "new_data";
        EditNFTRequest editReq = new EditNFTRequest()
                .setDenom(denomID)
                .setName(newName)
                .setId(nftID)
                .setUri(newUri)
                .setData(newData);
        ResultTx resultTx = nftClient.editNft(editReq, baseTx);
```

### 4. 销毁nft（burn nft）

```java
        BaseTx baseTx = new BaseTx(200000, new Fee("200000", "uirita"), BroadcastMode.Commit);
        BurnNFTRequest burnNFTReq = new BurnNFTRequest()
                .setDenom(denomID)
                .setId(nftID);
        Result resultTx = nftClient.burnNft(burnNFTReq, baseTx);
```

### 5. 查询denom

```java
        QueryDenomResp denom = nftClient.queryDenom(denomID);

        // next is findAll
        List<QueryDenomResp> denoms = nftClient.queryDenoms(null);
```

### 6. 通过owner查询
```java
        QueryOwnerResp owner = nftClient.queryOwner(denomID, km.getAddr());
```