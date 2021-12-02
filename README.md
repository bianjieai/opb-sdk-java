# opb-sdk-java

opb-sdk-java

## 引入 opb-sdk-java

从 Asset 页面下载jar包，并手动将jar包上传到私服

依赖如下
```xml
        <dependency>
            <groupId>com.github.bianjieai</groupId>
            <artifactId>opb-sdk</artifactId>
            <version>0.1.1</version>
        </dependency>
```

## Key Manger管理

### 0 新生成一个助记词(如果已有 私钥/keystore/助记词 忽略此步骤)

```java
        KeyManager km = KeyManagerFactory.createDefault();
        km.add();
        String mnemonic = km.getMnemonic();
        System.out.println(mnemonic);
```

### 1 恢复私钥 (recover privKey)

#### 1.1 从助记词恢复(recover from mnemonic)

```java
        String mnemonic="opera xxx ..."；
        KeyManager km=KeyManagerFactory.createDefault();
        km.recover(mnemonic);
```

#### 1.2 从私钥(recover from privKey)

```java
        BigInteger privKey=new BigInteger("3c49175daf981965679bf88d2690e22144424e16c84e9d397ddb58b63603eeec",16);
        KeyManager km=KeyManagerFactory.createKeyManger(AlgoEnum.SM2);
        km.recover(privKey);
```

#### 1.3 从keystore恢复(recover from keystore)

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

### 2 导出(export)

```java
        BigInteger privKey=new BigInteger("3c49175daf981965679bf88d2690e22144424e16c84e9d397ddb58b63603eeec",16);
        KeyManager km=KeyManagerFactory.createDefault();
        km.recover(privKey);

        String keystore=km.export("123456");
        System.out.println(keystore);
```

## 怎样使用opb-sdk-java(How to use opb-sdk-java)

### 1 初始化OpbClient (连接测试网)

```java
        String mnemonic = "opera vivid pride shallow brick crew found resist decade neck expect apple chalk belt sick author know try tank detail tree impact hand best";
        KeyManager km = KeyManagerFactory.createDefault();
        km.recover(mnemonic);

        // projectID: 填你的 projectID
        String nodeUri = "http://47.100.192.234:26657";
        String grpcAddr = "47.100.192.234:9090";
        String chainId = "testing";
        ClientConfig clientConfig = new ClientConfig(nodeUri, grpcAddr, chainId);
        OpbConfig opbConfig = null;

        OpbClient client = new OpbClient(clientConfig, opbConfig, km);
        assertEquals("iaa1ytemz2xqq2s73ut3ys8mcd6zca2564a5lfhtm3", km.getAddr());
```

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

        OpbClient client = new OpbClient(clientConfig, opbConfig, km);
        assertEquals("iaa1ytemz2xqq2s73ut3ys8mcd6zca2564a5lfhtm3", km.getAddr());
```

## 2 构造 txBodyBz (construct txBodyBz)

```java
        // 该 client 类型：opbClient
        BaseClient baseClient = client.getBaseClient();
        TxEngine txEngine = baseClient.getTxEngine();

        // 以 editNft 交易为例构造 txBody
        Tx.MsgEditNFT msg = Tx.MsgEditNFT
                .newBuilder()
                .setDenomId(denomID)
                .setId(id)
                .setName(name)
                .setUri(uri)
                .setData(data)
                .setSender(baseClient.getCurrentAddr())
                .build();
        List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
        TxOuterClass.TxBody txBody = txEngine.buildTxBody(msgs);
        byte[] txBodyBz = txBody.toByteArray();
```

## 3 构造 authInfoBz (construct authInfoBz)

参见前一下小结，需要先构造 txBody (see previous of this content, construct txBody first)

```java
        TxOuterClass.TxBody txBody = txEngine.buildTxBody(msgs);
        TxOuterClass.Tx tx = txEngine.signTx(txBody, baseTx, baseClient.queryAccount());
        TxOuterClass.AuthInfo authInfo = tx.getAuthInfo();
        byte[] authInfoBz = authInfo.toByteArray();
```

## 3 直接查询 / 直接发送交易 (tx send / query tx)

```java
        // 该 client 类型：opbClient
        // 使用 nftClient 进行查询
        NftClient nftClient = client.getNftClient();
        QueryOwnerResp resp = nftClient.queryOwner(denomID);
        System.out.println(resp);

        // 使用 nftClient 发送交易
        BaseTx baseTx = new BaseTx(10000, new Fee("10000", "uirita"), BroadcastMode.Commit);
        ResultTx resultTx = nftClient.mintNft(mintNFTReq, baseTx);
        String txHash = resultTx.getResult().getHash();
```


## 4 签名 / 其它发送交易的方法 (sign / user other method to send tx)

```java
        // 使用 txEngine 签名交易
        TxOuterClass.Tx tx = txEngine.signTx(txBody, baseTx, baseClient.queryAccount());
        byte[] txBz = tx.toByteArray();
        // 使用 rpcClient 将签名好的 txBz 直接发送到区块链
        RpcClient rpcClient = baseClient.getRpcClient();
        ResultTx resultTx = rpcClient.broadcastTx(txBz, BroadcastMode.Commit);

        
        // 当然也可以自己使用 httpClient 进行发送，将 txBz 进行 base64 编码，并使用 jsonRpc 发送， 代码如下
                JsonRpc jsonRpc = JsonRpc.WrapTxBytes(txBytes, "broadcast_tx_commit");
        String str = httpUtils.post(rpcUri, JSON.toJSONString(jsonRpc)); // rpcUri: 链uri，第二个参数post 的body
```

## 离线HASH (offline hash calculate)

```java
        String txHash = client.getBaseClient().buildTxHash(msg, baseTx, account);
```

## 使用NFT模块(Use NftClient)

### 1. 新增一个denom(issue denom)

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

### 2. 发行一个nft(mint nft)

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

### 3. 编辑/修改存在的nft(edit nft)

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

### 4. 销毁nft(burn nft)

```java
        BaseTx baseTx = new BaseTx(200000, new Fee("200000", "uirita"), BroadcastMode.Commit);
        BurnNFTRequest burnNFTReq = new BurnNFTRequest()
                .setDenom(denomID)
                .setId(nftID);
        Result resultTx = nftClient.burnNft(burnNFTReq, baseTx);
```

### 5. 查询denom (query denom)

```java
        QueryDenomResp denom = nftClient.queryDenom(denomID);

        // next is findAll
        List<QueryDenomResp> denoms = nftClient.queryDenoms(null);
```

### 6. 通过owner查询 (query by owner)
```java
        QueryOwnerResp owner = nftClient.queryOwner(denomID, km.getAddr());
```

## 使用TIBC模块(Use TibcClient)

### 1. 发起NFT跨链交易(tibc-nft-transfer transfer)

```java
        BaseTx baseTx = new BaseTx(200000, new Fee("300000", "stake"), BroadcastMode.Commit);
        String class_ = "denom01";
        String id = "nft26";
        String destChainName = "iris-test1";
        String relayerChainName = "";
        String receiver = "iaa14u80vaseg99lxej9cvlmfz96xe8mvv6p6g469p";
        ResultTx resultTx = tibcClient.nftTransfer(class_, id, receiver, destChainName, relayerChainName, baseTx);
```

### 2. 查询NFT跨链交易的commitment(tibc packet packet-commitment)

```java
        BaseTx baseTx = new BaseTx(200000, new Fee("300000", "stake"), BroadcastMode.Commit);
        String destChain = "iris-test1";
        String sourceChain = "iris-test2";
        long sequence = 2;
        QueryOuterClass.QueryPacketCommitmentResponse commitment = tibcClient.packetCommitment(destChain, sourceChain, sequence);
```

## 使用授权模块 (Use PermClient)

### 1. 授予某个地址权限 (Assign role to specify address)

```java
        Perm.Role role = Perm.Role.BLACKLIST_ADMIN;
        ResultTx resultTx = permClient.assignRoles(acc, Collections.singletonList(role), baseTx);
        assertNotNull(resultTx.getResult().getHash());
```

### 2. 查询地址的当前权限 (Current role of input address)

```java
        List<Perm.Role> roles = permClient.queryRoles(acc);
```

### 3. 删除某个地址权限 (Assign role to specify address)

```java
        permClient.unAssignRoles(acc, Collections.singletonList(role), baseTx);
```

### 4. perm模块的其他查询和交易 (other query and tx in this module)

查看 permClient 下的方法 (see method in perClient.java)