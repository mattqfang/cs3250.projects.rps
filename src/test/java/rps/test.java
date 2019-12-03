package rps;

import org.junit.Test;

public class test {
	@Test
	public void testAwin() {
		rps.RPSGAME("RS, SP, RS, SP");
	}
	@Test
	public void testBwin() {
		rps.RPSGAME("RP, RP, SR, SR");
	}
	@Test
	public void testDraw() {
		rps.RPSGAME("PP, PP, PP, PP");
	}
	@Test
	public void testNULL() {
		rps.RPSGAME("");
	}
	@Test
	public void testInvalid() {
		rps.RPSGAME("AA, BB, CC, DD");
	}
	
}