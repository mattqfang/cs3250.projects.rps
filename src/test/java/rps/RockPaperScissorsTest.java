package rps;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RockPaperScissorsTest {
	final private String EMPTY_STRING = "String is empty",
						 WINNER_PLAYER1 = "A",
						 WINNER_PLAYER2 = "B",
						 TIE_GAME = "Tie",
						 INVALID_STRING_LENGTH = "String doesn't meet length requirements",
						 NO_GAME_CHARACTERS_IN_STRING = "No r, p, s characters found in string",
						 INVALID_GAME_CHARS = "Invalid r, p, s characters";
	@Test
	public void testIsStringNull() {
		assertEquals(EMPTY_STRING, RockPaperScissors.getRPSWinner(null));
	}
	
	@Test
	public void testIsStringEmpty() {
		assertEquals(EMPTY_STRING, RockPaperScissors.getRPSWinner(""));
	}
	
	@Test
	public void testIsStringTie() {
		assertEquals(TIE_GAME, RockPaperScissors.getRPSWinner("pp,pp,pp,pp"));
	}
	
	@Test
	public void testIsStringBWins() {
		assertEquals(WINNER_PLAYER2, RockPaperScissors.getRPSWinner("pp,pp,ps,ps"));
	}
	
	@Test
	public void testIsStringAWins() {
		assertEquals(WINNER_PLAYER1, RockPaperScissors.getRPSWinner("rs,rs,pp,pp"));
	}
	
	@Test
	public void testStringOnlyCommasNoLetters() {
		assertEquals(NO_GAME_CHARACTERS_IN_STRING, RockPaperScissors.getRPSWinner(",,,"));
	}
	
	@Test
	public void testStringAllCommas() {
		assertEquals(NO_GAME_CHARACTERS_IN_STRING, RockPaperScissors.getRPSWinner(",,,,,,,,,,,"));
	}
	
	@Test
	public void testStringNumberInSet() {
		assertEquals(INVALID_GAME_CHARS, RockPaperScissors.getRPSWinner("1p,pp,pp,pp"));
	}
	
	@Test
	public void testStringNumberInSetWithSpaces() {
		assertEquals(INVALID_GAME_CHARS, RockPaperScissors.getRPSWinner("1p, pp, pp ,pp"));
	}
	 
	@Test
	public void testStringInvalidLetterCommand() {
		assertEquals(INVALID_GAME_CHARS, RockPaperScissors.getRPSWinner("pp, pp, pp ,pa"));
	}
	
	@Test
	public void testStringNoCommas() {
		assertEquals(INVALID_STRING_LENGTH, RockPaperScissors.getRPSWinner("appppppp"));
	}
	
	@Test
	public void testStringAdditionalCharacterSet() {
		assertEquals(WINNER_PLAYER1, RockPaperScissors.getRPSWinner("sp, pp, pp ,pp, pp"));
	}
	
	@Test
	public void testStringAdditionalCharInSet() {
		assertEquals(INVALID_STRING_LENGTH, RockPaperScissors.getRPSWinner("sp, pp, psp ,pp"));
	}
	
	@Test
	public void testStringMissingSomeSets() {
		assertEquals(WINNER_PLAYER1, RockPaperScissors.getRPSWinner("sp, ,  ,"));
	}	
	
	@Test
	public void testStringIgnoreCaseOfValidChars() {
		assertEquals(WINNER_PLAYER2, RockPaperScissors.getRPSWinner("PP, PS,  ps,   ps"));
	}	
	
	@Test
	public void testStringUnicodeSpace() {
		assertEquals(INVALID_STRING_LENGTH, RockPaperScissors.getRPSWinner("\\sP, PS,  ps,   ps"));
	}
	
	@Test
	public void testStringUnicodeScisscorChar() {
		char c = '\u0161';
		String sStr = "" + c + c + "," + c + c + "," + c + c + "," + c + c;
		assertEquals(INVALID_GAME_CHARS, RockPaperScissors.getRPSWinner(sStr));
	}
	
	@Test
	public void testStringCharacterSetWithDollarSign() {
		assertEquals(INVALID_GAME_CHARS, RockPaperScissors.getRPSWinner("$P, PS,  ps,   ps"));
	} 
	
	@Test
	public void testStringOneGame() {
		assertEquals(WINNER_PLAYER1, RockPaperScissors.getRPSWinner("sP"));
	}
}
