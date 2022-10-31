package irita.sdk;

import com.google.protobuf.GeneratedMessageV3;
import irita.sdk.client.BaseClient;
import irita.sdk.client.IritaClient;
import irita.sdk.constant.enums.BroadcastMode;
import irita.sdk.model.*;
import irita.sdk.model.block.BlockDetail;
import irita.sdk.model.tx.Condition;
import irita.sdk.model.tx.EventQueryBuilder;
import irita.sdk.model.tx.Events;
import irita.sdk.util.Bech32Utils;
import irita.sdk.util.KeyUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.web3j.utils.Numeric;
import proto.nft.Tx;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class ClientTest extends ConfigTest {
	private IritaClient client;
	public static final String mnemonic = "start vacant crop magnet cricket math quarter pass emotion hidden tray lake rail drift length wreck lock voice type nose whisper this impose test";

	@BeforeEach
	public void init() {
		client = getTestClient();
	}

	@Test
	@Disabled
	public void queryAccount() {
		String addr = "iaa1ytemz2xqq2s73ut3ys8mcd6zca2564a5lfhtm3";
		Account account = client.getBaseClient().queryAccount(addr);
		assertEquals(addr, account.getAddress());
	}

	@Test
	@Disabled
	public void simulateTx() throws IOException {
		BaseClient baseClient = client.getBaseClient();
		BaseTx baseTx = new BaseTx(10000, new Fee("10000", "ugas"), BroadcastMode.Commit);
		Account account = baseClient.queryAccount(baseTx);
		Tx.MsgIssueDenom msg = Tx.MsgIssueDenom
				.newBuilder()
				.setId("testfjdsklf21A3")
				.setName("testfjdsklf213")
				.setSchema("nullschema")
				.setSender(account.getAddress())
				.build();

		List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
		GasInfo gasInfo = baseClient.simulateTx(msgs, baseTx, null);
		System.out.println(gasInfo);
	}

	@Test
	@Disabled
	public void queryTx() throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		String hash = "D49C463FAB1273ADE4D3CABE61E069DE56BBDF778200CB2B78E26A2659035127";//tibc
		ResultQueryTx resultQueryTx = client.getBaseClient().queryTx(hash);
		assertNotNull(resultQueryTx);
	}

	@Test
	@Disabled
	public void queryTxs() throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
		EventQueryBuilder builder = EventQueryBuilder.newEventQueryBuilder()
				.AddCondition(Condition.newCond("tibc_nft_transfer", "sender").eq("iaa18e23vvukxgatgzm4fgqkdggxecurkf39ytw7ue"));
//                .AddCondition(Condition.newCond("send_packet", "packet_sequence").eq(4));
		int page = 1;
		int size = 10;
		ResultSearchTxs resultSearchTxs = client.getBaseClient().queryTxs(builder, page, size);
		assertNotNull(resultSearchTxs);
	}

	@Test
	@Disabled
	public void queryTxFeePayer() throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		String hash = "1308492A88B0F2E09D4DFF8E9483EDE462EC293405B1A94272291808D0E382B2";//
		ResultQueryTx resultQueryTx = client.getBaseClient().queryTx(hash);
		assertNotNull(resultQueryTx);

		// 判断是否是智能合约交易
		if (resultQueryTx.getTx().getBody().getMsgs().get(0) instanceof proto.ethermint.evm.v1.Tx.MsgEthereumTx) {
			// 从交易结果中解析交易的签名者，并根据以下逻辑过滤出签名者信息
			String senderAddr = resultQueryTx.getResult().getEvents().stream()
					.filter(e -> e.getType().equals("message"))
					.map(Events::getAttributes)
					.reduce((attributes, attributes2) -> {
						attributes.addAll(attributes2);
						return attributes;
					})
					.orElse(Collections.emptyList())
					.stream()
					.filter(attribute -> "sender".equals(attribute.getKey()) && attribute.getValue().startsWith("0x"))
					.map(attribute -> Bech32Utils.hexToBech32("iaa", Numeric.cleanHexPrefix(attribute.getValue())))
					.distinct().findFirst().orElse("");
			System.out.println("付钱的人是：" + senderAddr);
			return;
		}
		String granter = resultQueryTx.getTx().getAuthInfo().getFee().getGranter();
		String payer = resultQueryTx.getTx().getAuthInfo().getFee().getPayer();
		String txSigner = KeyUtils.parseAddrFromPubKeyAny(resultQueryTx.getTx().getAuthInfo().getSignerInfos(0).getPublicKey());
		// granter/payer/txSigner优先级按序排列
		System.out.println("付钱的人是：" + (!"".equals(granter) ? granter : (!"".equals(payer) ? payer : txSigner)));
	}

	@Test
	@Disabled
	public void queryBlock() throws IOException {
		BlockDetail blockDetail = client.getBaseClient().queryBlock("33105");
		assertNotNull(blockDetail);
	}
}
