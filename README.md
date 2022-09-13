- [opb-sdk-java](#opb-sdk-java)
    - [引入 opb-sdk-java](#引入-opb-sdk-java)
        - [从maven中央仓库引入 (load from central maven)](#从maven中央仓库引入-load-from-central-maven)
        - [手动下载引入 (manual load)](#手动下载引入-manual-load)
    - [Key Manger管理](#key-manger管理)
        - [0 新生成一个助记词(如果已有 私钥/keystore/助记词 忽略此步骤)](#0-新生成一个助记词如果已有-私钥keystore助记词-忽略此步骤)
        - [1 恢复私钥 (recover privKey)](#1-恢复私钥-recover-privkey)
            - [1.1 从助记词恢复(recover from mnemonic)](#11-从助记词恢复recover-from-mnemonic)
            - [1.2 从私钥(recover from privKey)](#12-从私钥recover-from-privkey)
            - [1.3 从keystore恢复(recover from keystore)](#13-从keystore恢复recover-from-keystore)
        - [2 导出(export)](#2-导出export)
    - [怎样使用opb-sdk-java(How to use opb-sdk-java)](#怎样使用opb-sdk-javahow-to-use-opb-sdk-java)
        - [1-1 初始化OpbClient (连接测试网 connect testnet)](#1-1-初始化opbclient-连接测试网-connect-testnet)
        - [1-2 初始化OpbClient (连接开放联盟链 connect open alliance chain)](#1-2-初始化opbclient-连接开放联盟链-connect-open-alliance-chain)
        - [2 构造 txBodyBz (construct txBodyBz)](#2-构造-txbodybz-construct-txbodybz)
        - [3 构造 authInfoBz (construct authInfoBz)](#3-构造-authinfobz-construct-authinfobz)
        - [4 签名 / 其它发送交易的方法 (sign / user other method to send tx)](#4-签名--其它发送交易的方法-sign--user-other-method-to-send-tx)
    - [离线HASH (offline hash calculate)](#离线hash-offline-hash-calculate)
    - [使用NFT模块(Use NftClient)](#使用nft模块use-nftclient)
        - [1. 新增一个denom(issue denom)](#1-新增一个denomissue-denom)
        - [2. 发行一个nft(mint nft)](#2-发行一个nftmint-nft)
        - [3. 编辑/修改存在的nft(edit nft)](#3-编辑修改存在的nftedit-nft)
        - [4. 销毁nft(burn nft)](#4-销毁nftburn-nft)
        - [5. 查询denom (query denom)](#5-查询denom-query-denom)
        - [6. 通过owner查询 (query by owner)](#6-通过owner查询-query-by-owner)
    - [使用TIBC模块(Use TibcClient)](#使用tibc模块use-tibcclient)
        - [1. 发起NFT跨链交易(tibc-nft-transfer transfer)](#1-发起nft跨链交易tibc-nft-transfer-transfer)
        - [2. 查询NFT跨链交易的commitment(tibc packet packet-commitment)](#2-查询nft跨链交易的commitmenttibc-packet-packet-commitment)
    - [使用授权模块 (Use PermClient)](#使用授权模块-use-permclient)
        - [1. 授予某个地址权限 (Assign role to specify address)](#1-授予某个地址权限-assign-role-to-specify-address)
        - [2. 查询地址的当前权限 (Current role of input address)](#2-查询地址的当前权限-current-role-of-input-address)
        - [3. 删除某个地址权限 (Assign role to specify address)](#3-删除某个地址权限-assign-role-to-specify-address)
        - [4. perm模块的其他查询和交易 (other query and tx in this module)](#4-perm模块的其他查询和交易-other-query-and-tx-in-this-module)
    - [FeeGrant(代付)模块使用](#FeeGrant(代付)模块使用)
        - [1. FeeGrant(代付)模块使用](#1.-设置代付的账号)
        - [2. FeeGrant的方法说明](#2.-FeeGrant的方法说明)
        - [3. 代付功能dem](#3.-代付功能demo)
    - [单元测试 (Unit Test Demo)](#单元测试-unit-test-demo)

# opb-sdk-java

opb-sdk-java (open alliance chain SDK java)

## 引入 opb-sdk-java

### 从maven中央仓库引入 (load from central maven)

https://mvnrepository.com/artifact/io.github.bianjieai

```xml

<dependency>
    <groupId>io.github.bianjieai</groupId>
    <artifactId>opb-sdk</artifactId>
    <version>${version}</version>
</dependency>
```

### 手动下载引入 (manual load)

从 Asset 页面下载jar包，并手动将jar包上传到私服

## Key Manger管理

### 0 新生成一个助记词(如果已有 私钥/keystore/助记词 忽略此步骤)

```java
        KeyManager km=KeyManagerFactory.createDefault();
        String mnemonic=km.add();
        System.out.println("助记词："+mnemonic);
        System.out.println("地址："+km.getCurrentKeyInfo().getAddress());
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

### 1-1 初始化OpbClient (连接测试网 connect testnet)

```java
        String mnemonic="opera vivid pride shallow brick crew found resist decade neck expect apple chalk belt sick author know try tank detail tree impact hand best";
        KeyManager km=KeyManagerFactory.createDefault();
        km.recover(mnemonic);

        // projectID: 填你的 projectID
        String nodeUri="http://testnet.bianjie.ai:26657";
        String grpcAddr="testnet.bianjie.ai:9090";
        String chainId="testing";
        ClientConfig clientConfig=new ClientConfig(nodeUri,grpcAddr,chainId);
        OpbConfig opbConfig=null;

        OpbClient client=new OpbClient(clientConfig,opbConfig,km);
        assertEquals("iaa1ytemz2xqq2s73ut3ys8mcd6zca2564a5lfhtm3",km.getCurrentKeyInfo().getAddress());
```

### 1-2 初始化OpbClient (连接开放联盟链 connect open alliance chain)

```java
        String mnemonic="opera vivid pride shallow brick crew found resist decade neck expect apple chalk belt sick author know try tank detail tree impact hand best";
        KeyManager km=KeyManagerFactory.createDefault();
        km.recover(mnemonic);

        // projectID: 填你的 projectID
        String nodeUri="https://opbningxia.bsngate.com:18602/api/${projectID}/rpc";
        String grpcAddr="opbningxia.bsngate.com:18603";
        String chainId="wenchangchain";
        ClientConfig clientConfig=new ClientConfig(nodeUri,grpcAddr,chainId);
        OpbConfig opbConfig=new OpbConfig(${projectID},${projectKey},km.getCurrentKeyInfo().getAddress()); // 如果没有 projectKey 传null
        // 开启 TLS 连接
        opbConfig.setRequireTransportSecurity(true);

        OpbClient client=new OpbClient(clientConfig,opbConfig,km);
        assertEquals("iaa1ytemz2xqq2s73ut3ys8mcd6zca2564a5lfhtm3",km.getCurrentKeyInfo().getAddress());
```

```java
    // tips: 连接大唐链需要修改bench32前缀
    km.setHrp("dtc");
```

### 2 构造 txBodyBz (construct txBodyBz)

```java
        // 该 client 类型：opbClient
        BaseClient baseClient=client.getBaseClient();
                TxEngine txEngine=baseClient.getTxEngine();

                // 以 editNft 交易为例构造 txBody
                Tx.MsgEditNFT msg=Tx.MsgEditNFT
                .newBuilder()
                .setDenomId(denomID)
                .setId(id)
                .setName(name)
                .setUri(uri)
                .setData(data)
                .setSender(baseClient.getCurrentAddr())
                .build();
                List<GeneratedMessageV3> msgs=Collections.singletonList(msg);
        TxOuterClass.TxBody txBody=txEngine.buildTxBody(msgs);
        byte[]txBodyBz=txBody.toByteArray();
```

### 3 构造 authInfoBz (construct authInfoBz)

参见前一下小结，需要先构造 txBody (see previous of this content, construct txBody first)

```java
        TxOuterClass.TxBody txBody=txEngine.buildTxBody(msgs);
        TxOuterClass.Tx tx=txEngine.signTx(txBody,baseTx,baseClient.queryAccount());
        TxOuterClass.AuthInfo authInfo=tx.getAuthInfo();
        byte[]authInfoBz=authInfo.toByteArray();
```

### 4 签名 / 其它发送交易的方法 (sign / user other method to send tx)

```java
        // 使用 txEngine 签名交易
        TxOuterClass.Tx tx=txEngine.signTx(txBody,baseTx,baseClient.queryAccount());
                byte[]txBz=tx.toByteArray();
                // 使用 rpcClient 将签名好的 txBz 直接发送到区块链
                RpcClient rpcClient=baseClient.getRpcClient();
                ResultTx resultTx=rpcClient.broadcastTx(txBz,BroadcastMode.Commit);
                // ---
                // 当然也可以自己使用 httpClient 进行发送，将 txBz 进行 base64 编码，并使用 jsonRpc 发送， 代码如下
                JsonRpc jsonRpc=JsonRpc.WrapTxBytes(txBytes,"broadcast_tx_commit");
                String str=httpUtils.post(rpcUri,JSON.toJSONString(jsonRpc)); // rpcUri: 链uri，第二个参数post 的body
```

## 离线HASH (offline hash calculate)

```java
        String txHash=client.getBaseClient().buildTxHash(msg,baseTx,account);
```

## 使用NFT模块(Use NftClient)

> 完整 Demo 示例详见: [NftDemo.java](./src/test/java/irita/sdk/NftDemo.java)

### 1. 新增一个denom(issue denom)

```java
        BaseTx baseTx=new BaseTx(200000,new Fee("200000","ugas"),BroadcastMode.Commit);
        String denomID="denomid"+new Random().nextInt(1000);
        String denomName="test_name"+new Random().nextInt(1000);
        String schema="no shcema";

        IssueDenomRequest req=new IssueDenomRequest()
        .setId(denomID)
        .setName(denomName)
        .setSchema(schema);
        ResultTx resultTx=nftClient.issueDenom(req,baseTx);
```

### 2. 发行一个nft(mint nft)

```java
        BaseTx baseTx=new BaseTx(200000,new Fee("200000","ugas"),BroadcastMode.Commit);
        MintNFTRequest mintReq=new MintNFTRequest()
        .setDenom(denomID)
        .setId(nftID)
        .setName(nftName)
        .setUri(uri)
        .setData(data)
        .setRecipient(km.getAddr());
        ResultTx resultTx=nftClient.mintNft(mintReq,baseTx);
```

### 3. 编辑/修改存在的nft(edit nft)

```java
        BaseTx baseTx=new BaseTx(200000,new Fee("200000","ugas"),BroadcastMode.Commit);
        String newName="new_name";
        String newUri="http://xx.com";
        String newData="new_data";
        EditNFTRequest editReq=new EditNFTRequest()
        .setDenom(denomID)
        .setName(newName)
        .setId(nftID)
        .setUri(newUri)
        .setData(newData);
        ResultTx resultTx=nftClient.editNft(editReq,baseTx);
```

### 4. 销毁nft(burn nft)

```java
        BaseTx baseTx=new BaseTx(200000,new Fee("200000","ugas"),BroadcastMode.Commit);
        BurnNFTRequest burnNFTReq=new BurnNFTRequest()
        .setDenom(denomID)
        .setId(nftID);
        Result resultTx=nftClient.burnNft(burnNFTReq,baseTx);
```

### 5. 查询denom (query denom)

```java
        QueryDenomResp denom=nftClient.queryDenom(denomID);

        // next is findAll
        List<QueryDenomResp> denoms=nftClient.queryDenoms(null);
```

### 6. 通过owner查询 (query by owner)

```java
        QueryOwnerResp owner=nftClient.queryOwner(denomID,km.getAddr());
```

## 使用TIBC模块(Use TibcClient)

### 1. 发起NFT跨链交易(tibc-nft-transfer transfer)

```java
        BaseTx baseTx=new BaseTx(200000,new Fee("300000","stake"),BroadcastMode.Commit);
        String class_="denom01";
        String id="nft26";
        String destChainName="iris-test1";
        String relayerChainName="";
        String receiver="iaa14u80vaseg99lxej9cvlmfz96xe8mvv6p6g469p";
        ResultTx resultTx=tibcClient.nftTransfer(class_,id,receiver,destChainName,relayerChainName,baseTx);
```

### 2. 查询NFT跨链交易的commitment(tibc packet packet-commitment)

```java
        BaseTx baseTx=new BaseTx(200000,new Fee("300000","stake"),BroadcastMode.Commit);
        String destChain="iris-test1";
        String sourceChain="iris-test2";
        long sequence=2;
        QueryOuterClass.QueryPacketCommitmentResponse commitment=tibcClient.packetCommitment(destChain,sourceChain,sequence);
```

## 使用授权模块 (Use PermClient)

### 1. 授予某个地址权限 (Assign role to specify address)

```java
        Perm.Role role=Perm.Role.BLACKLIST_ADMIN;
        ResultTx resultTx=permClient.assignRoles(acc,Collections.singletonList(role),baseTx);
        assertNotNull(resultTx.getResult().getHash());
```

### 2. 查询地址的当前权限 (Current role of input address)

```java
        List<Perm.Role>roles=permClient.queryRoles(acc);
```

### 3. 删除某个地址权限 (Assign role to specify address)

```java
        permClient.unAssignRoles(acc,Collections.singletonList(role),baseTx);
```

### 4. perm模块的其他查询和交易 (other query and tx in this module)

查看 permClient 下的方法 (see method in perClient.java)

## FeeGrant(代付)模块使用

### 1. 设置代付的账号

```java
        BaseTx baseTx=new BaseTx(200000,new Fee("300000","ugas"),BroadcastMode.Commit);
        baseTx.setFeeGranter("FeeGranter 地址");
```

### 2. FeeGrant的方法说明

```text
GrantAllowance(String granter, String grantee, BaseTx baseTx)：授予全部额度
GrantAllowance(String granter, String grantee, String denom, String amount, Timestamp timestamp, BaseTx baseTx) ：授予指定额度
RevokeAllowance(String granter, String grantee, BaseTx baseTx) ：撤销授权
```

### 3. 代付功能demo

详见 FeeGrantTest.java
按@Order(1,2,3)依次运行

## 单元测试 (Unit Test Demo)

[ServiceDemoTest.java](./src/test/java/irita/sdk/ServiceDemoTest.java)

[MsgsDemoTest.java](./src/test/java/irita/sdk/MsgsDemoTest.java)

[NftDemoTest.java](./src/test/java/irita/sdk/NftDemoTest.java)

[ClientTest.java](./src/test/java/irita/sdk/ClientTest.java)

[ComGovContractTest.java](./src/test/java/irita/sdk/ComGovContractTest.java)

[HttpUtilsTest.java](./src/test/java/irita/sdk/HttpUtilsTest.java)

[IdentityClientTest.java](./src/test/java/irita/sdk/IdentityClientTest.java)

[IOUtilTest.java](./src/test/java/irita/sdk/IOUtilTest.java)

[Secp256k1KeyManagerTest.java](./src/test/java/irita/sdk/Secp256k1KeyManagerTest.java)

[Sm2KeyManagerTest.java](./src/test/java/irita/sdk/Sm2KeyManagerTest.java)

[MsgsTest.java](./src/test/java/irita/sdk/MsgsTest.java)

[NftTest.java](./src/test/java/irita/sdk/NftTest.java)

[PermTest.java](./src/test/java/irita/sdk/PermTest.java)

[RecordTest.java](./src/test/java/irita/sdk/RecordTest.java)

[TibcTest.java](./src/test/java/irita/sdk/TibcTest.java)

[WasmTest.java](./src/test/java/irita/sdk/WasmTest.java)

[FeeGrantTest.java](./src/test/java/irita/sdk/FeeGrantTest.java)

