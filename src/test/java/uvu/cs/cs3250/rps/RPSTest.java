package uvu.cs.cs3250.rps;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RPSTest {
	
	RockPaperScissors gameTest = new RockPaperScissors();
	
	@Test
	public void testRPSGame_noValidInput() {
		assertEquals("Failed", gameTest.rpsGame(", #, "), "No valid input entered");
	}
	
	@Test
	public void testRPSGame_playerAWin() {
		assertEquals("Failed", gameTest.rpsGame("PR, SR,PP,RS"), "Player A is the Winner!");
	}
	
	@Test
	public void testRPSGame_playerBWin() {
		assertEquals("Failed", gameTest.rpsGame("RP, SR,PP,RR"), "Player B is the Winner!");
	}

	@Test
	public void testRPSGame_playerBWin2() {
		assertEquals("Failed", gameTest.rpsGame("RP, SR,PP,RR,rr,rp,sR,Ps"), "Player B is the Winner!");
	}
	
	@Test
	public void testRPSGame_draw() {
		assertEquals("Failed", gameTest.rpsGame("RP, RR,PP,PR"), "Draw");
	}

	@Test
	public void testformatUserInput_removeSpecialCharacters() {
		assertEquals("Failed", gameTest.formatUserInput("RP, SR,PP$,RR"), "RPSRPPRR");
	}
	
	@Test
	public void testformatUserInput_makeUpperCase() {
		assertEquals("Failed", gameTest.formatUserInput("rP, Sr,pp,RR"), "RPSRPPRR");
	}
	
	@Test
	public void test_roundWinCheckDraw() {
		assertEquals("Failed", gameTest.roundWinCheck("RR"), 3);
	}
	
	@Test
	public void test_roundWinCheckB() {
		assertEquals("Failed", gameTest.roundWinCheck("RP"), 2);
	}
	
	@Test
	public void test_roundWinCheckA() {
		assertEquals("Failed", gameTest.roundWinCheck("SP"), 1);
	}

	


	
}
