package uvu.cs.cs3250.assignments;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class RockPaperScissorsTest {
	@Test
	public void testDetermineWinner_null() {
		assertEquals("", RockPaperScissors.determineWinner(null));
	}
	
	@Test
	public void testDetermineWinner_emptySpace() {
		assertEquals("", RockPaperScissors.determineWinner(""));
	}
	
	@Test
	public void testDetermineWinner_manySpaces() {
		assertEquals("", RockPaperScissors.determineWinner("     "));
	}
	
	@Test
	public void testDetermineWinner_spacesBeforeAndAfter() {
		assertEquals("A", RockPaperScissors.determineWinner("  PR  "));
	}
	
	@Test
	public void testDetermineWinner_invalidChars() {
		assertEquals("", RockPaperScissors.determineWinner("FP"));
	}
	
	@Test
	public void testDetermineWinner_badString() {
		assertEquals("", RockPaperScissors.determineWinner("*@&^*&^$(*&!"));
	}
	
	@Test
	public void testDetermineWinner_onlyComma() {
		assertEquals("", RockPaperScissors.determineWinner(","));
	}
	
	@Test
	public void testDetermineWinner_onlyR() {
		assertEquals("", RockPaperScissors.determineWinner("R"));
	}
	
	@Test
	public void testDetermineWinner_onlyP() {
		assertEquals("", RockPaperScissors.determineWinner("P"));
	}
	
	@Test
	public void testDetermineWinner_onlyS() {
		assertEquals("", RockPaperScissors.determineWinner("S"));
	}
	
	@Test
	public void testDetermineWinner_RS() {
		assertEquals("A", RockPaperScissors.determineWinner("RS"));
	}
	
	@Test
	public void testDetermineWinner_SR() {
		assertEquals("B", RockPaperScissors.determineWinner("SR"));
	}
	
	@Test
	public void testDetermineWinner_RP() {
		assertEquals("B", RockPaperScissors.determineWinner("RP"));
	}
	
	@Test
	public void testDetermineWinner_PR() {
		assertEquals("A", RockPaperScissors.determineWinner("PR"));
	}
	
	@Test
	public void testDetermineWinner_SP() {
		assertEquals("A", RockPaperScissors.determineWinner("SP"));
	}
	
	@Test
	public void testDetermineWinner_PS() {
		assertEquals("B", RockPaperScissors.determineWinner("PS"));
	}
	
	@Test
	public void testDetermineWinner_PSSP() {
		assertEquals("DRAW", RockPaperScissors.determineWinner("PS,SP"));
	}
	
	@Test
	public void testDetermineWinner_PSSPPS() {
		assertEquals("B", RockPaperScissors.determineWinner("PS,SP,PS"));
	}
	
	@Test
	public void testDetermineWinner_PP() {
		assertEquals("DRAW", RockPaperScissors.determineWinner("PP"));
	}
	
	@Test
	public void testDetermineWinner_RR() {
		assertEquals("DRAW", RockPaperScissors.determineWinner("RR"));
	}
	
	@Test
	public void testDetermineWinner_SS() {
		assertEquals("DRAW", RockPaperScissors.determineWinner("SS"));
	}
	
	@Test
	public void testDetermineWinner_noComma() {
		assertEquals("", RockPaperScissors.determineWinner("PSRS"));
	}
	
	@Test
	public void testDetermineWinner_fiveMixedRounds() {
		assertEquals("A", RockPaperScissors.determineWinner("PS,RR,SS,SP,RS"));
	}
}