package uvu.cs.cs3250.assignments;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RPSTest {
	@Test
	public void testIsArray_null() {
		assertEquals("ERROR", RockPapperScissors.playGame(null));
	}
	
	@Test 
	public void testIsArray_empty() {
		assertEquals("ERROR", RockPapperScissors.playGame(""));
	}
	
	@Test
	public void testIsPlayerA_Win_true() {
		assertEquals("A", RockPapperScissors.playGame("PR, SP, RS"));
	}
	
	@Test
	public void testIsPlayerB_Win_true_() {
		assertEquals("B", RockPapperScissors.playGame("RP, PS, SR"));
	}
	
	@Test
	public void testIsDraw_true() {
		assertEquals("DRAW", RockPapperScissors.playGame("RP, SS, RS"));
	}
	
	@Test
	public void testIsPlayerA_WinSpecChar_true() { 
		assertEquals("A", RockPapperScissors.playGame("P)S, #RS&, !@RS"));
	}
	
	@Test 
	public void testIsPlayerA_WinLowerCase_true() {
		assertEquals("A", RockPapperScissors.playGame("pr, pr, sp, rs"));
	}
	
	@Test
	public void testIsPlayerA_true_WinDiffCases() {
		assertEquals("A", RockPapperScissors.playGame("pR, Ps, rS"));
	}
	
	@Test
	public void testIsExtraCharInGame_false() {
		assertEquals("ERROR", RockPapperScissors.playGame("RSH, RSP, SP"));
	}
}
