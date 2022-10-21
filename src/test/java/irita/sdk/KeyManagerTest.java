package irita.sdk;

import irita.sdk.key.KeyInfo;
import irita.sdk.key.KeyManager;
import irita.sdk.key.KeyManagerFactory;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/**
 * @author : ori
 * @date : 2022/10/20 14:31
 */
public class KeyManagerTest {

	@Test
	public void multiKey() throws InterruptedException {
		KeyManager km1 = KeyManagerFactory.createDefault();
		KeyManager km2 = KeyManagerFactory.createDefault();
		int threadNum = 10;
		Map<String, String> addrNameMap = new ConcurrentHashMap<>();
		CountDownLatch cdl = new CountDownLatch(threadNum);
		for (int i = 0; i < threadNum; i++) {
			int finalI = i;
			new Thread(() -> {
				try {
					for (int j = 0; j < 100; j++) {
						String mnemonic;
						try {
							mnemonic = km2.add();
						} catch (Exception e) {
							e.printStackTrace();
							return;
						}
						String name = "aa" + finalI + "-" + j;
						String password = "12345678";
						km1.recover(name, password, mnemonic);
						KeyInfo keyInfo = km1.getKeyDAO().read(name, password);
						if (!addrNameMap.containsKey(keyInfo.getAddress())) {
							addrNameMap.put(keyInfo.getAddress(), name);
						} else {
							throw new RuntimeException("duplicate addr");
						}
						System.out.println(name + "-" + keyInfo.getAddress());
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					cdl.countDown();
				}
			}).start();
		}
		cdl.await();
		Thread.sleep(1000);
	}
}
