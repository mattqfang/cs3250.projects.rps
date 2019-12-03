package rps;

import org.junit.Test;

public class test {
	@Test
	public void testAwin() {
		rps.RPSGAME("RS, SP, RS, SP");
	}
	@Test
	public void testBwin() {
		rps.RPSGAME("PR, PR, RS, RS");
	}
	@Test
	public void testDraw() {
		rps.RPSGAME("PP, PP, PP, PP");
	}
	@Test
	public void testWronginput() {
		rps.RPSGAME("AA, BB, CC, DD");
	}
	@Test
	public void testnull() {
		rps.RPSGAME("");
	}
}