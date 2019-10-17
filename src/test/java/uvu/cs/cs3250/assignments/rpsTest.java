package uvu.cs.cs3250.assignments;

import org.junit.Test;
import static org.junit.Assert.*;

public class rpsTest {
	@Test
	public void testrps_AWins() {
		assertEquals("A", rps.findWinner("PS, PR, RS"));
	}
	
	@Test
	public void testrps_BWins() {
		assertEquals("B", rps.findWinner("PS, PR, RP"));
	}
	
	@Test
	public void testrps_InvalidInput() {
		//null is returned if an invalid character is in the input string
		assertEquals(null, rps.findWinner("OS, PR, RP"));
	}
	
	@Test
	public void testrps_AllDraws() {
		assertEquals("Draw", rps.findWinner("SS, RR, PP, RR"));
	}
	
	@Test
	public void testrps_OneMatchAWins() {
		assertEquals("A", rps.findWinner("PR"));
	}
	
	@Test
	public void testrps_OneMatchBWins() {
		assertEquals("B", rps.findWinner("SR"));
	}
	
	@Test
	public void testrps_InvalidInput_OneChar() {
		assertEquals(null, rps.findWinner("S"));
	}
	
	@Test
	public void testrps_AWins_WithADrawMatch() {
		assertEquals("A", rps.findWinner("RP, RR, RS, SP"));
	}
	
	@Test
	public void testrps_InvalidInput_OneCharMatch() {
		assertEquals(null, rps.findWinner("RP, SP, SR, P"));
	}
}
