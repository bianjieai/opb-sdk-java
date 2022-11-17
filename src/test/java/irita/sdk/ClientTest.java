package irita.sdk;

import com.google.protobuf.GeneratedMessageV3;
import irita.sdk.client.BaseClient;
import irita.sdk.client.IritaClient;
import irita.sdk.constant.enums.BroadcastMode;
import irita.sdk.crypto.eth.LegacyTransaction;
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
		String hash = "7C47C95BE8F8794E89D2104313411193D8270F94147ED08E354C74704140A00B";//
		ResultQueryTx resultQueryTx = client.getBaseClient().queryTx(hash);
		assertNotNull(resultQueryTx);
		// 判断是否是智能合约交易
		if (resultQueryTx.getTx().getBody().getMsgs().get(0) instanceof proto.ethermint.evm.v1.Tx.MsgEthereumTx) {
			List<GeneratedMessageV3> messageList = resultQueryTx.getTx().getBody().getMsgs();
			for (GeneratedMessageV3 generatedMessageV3 : messageList) {
				proto.ethermint.evm.v1.Tx.MsgEthereumTx msgEthereumTx = proto.ethermint.evm.v1.Tx.MsgEthereumTx.parseFrom(generatedMessageV3.toByteString());
				proto.ethermint.evm.v1.Tx.LegacyTx legacyTx = proto.ethermint.evm.v1.Tx.LegacyTx.parseFrom(msgEthereumTx.getData().getValue());
				LegacyTransaction legacyTransaction = new LegacyTransaction(legacyTx);
				String addr = legacyTransaction.getSender();
				System.out.println("付钱的人是："+ addr);
			}
			return;
		}
		String granter = resultQueryTx.getTx().getAuthInfo().getFee().getGranter();
		String payer = resultQueryTx.getTx().getAuthInfo().getFee().getPayer();
		String txSigner = KeyUtils.parseAddrFromPubKeyAny(resultQueryTx.getTx().getAuthInfo().getSignerInfos(0).getPublicKey());
		System.out.println("付钱的人是：" + (!"".equals(granter) ? granter : (!"".equals(payer) ? payer : txSigner)));
	}

	@Test
	@Disabled
	public void queryBlock() throws IOException {
		BlockDetail blockDetail = client.getBaseClient().queryBlock("10254529");
		assertNotNull(blockDetail);
	}
}
