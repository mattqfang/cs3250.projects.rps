package rps;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Before;

public class RockPaperScissorsTest {
	final private String EMPTY_STRING = "String is empty",
						 WINNER_PLAYER1 = "A",
						 WINNER_PLAYER2 = "B",
						 TIE_GAME = "Tie",
						 INVALID_STRING_LENGTH = "String doesn't meet length requirements",
						 NO_GAME_CHARACTERS_IN_STRING = "No r, p, s characters found in string",
						 INVALID_GAME_CHARS = "Invalid r, p, s characters";
	private RockPaperScissors rps;
	
	@Before
	public void setUp() throws IOException {
		rps = new RockPaperScissors();
	}
	
	@Test
	public void testIsStringNull() {
		assertEquals(EMPTY_STRING, rps.getRPSWinner(null));
	}
	
	@Test
	public void testIsStringEmpty() {
		assertEquals(EMPTY_STRING, rps.getRPSWinner(""));
	}
	
	@Test
	public void testIsStringTie() {
		assertEquals(TIE_GAME, rps.getRPSWinner("pp,pp,pp,pp"));
	}
	
	@Test
	public void testIsStringBWins() {
		assertEquals(WINNER_PLAYER2, rps.getRPSWinner("pp,pp,ps,ps"));
	}
	
	@Test
	public void testIsStringAWins() {
		assertEquals(WINNER_PLAYER1, rps.getRPSWinner("rs,rs,pp,pp"));
	}
	
	@Test
	public void testStringOnlyCommasNoLetters() {
		assertEquals(NO_GAME_CHARACTERS_IN_STRING, rps.getRPSWinner(",,,"));
	}
	
	@Test
	public void testStringAllCommas() {
		assertEquals(NO_GAME_CHARACTERS_IN_STRING, rps.getRPSWinner(",,,,,,,,,,,"));
	}
	
	@Test
	public void testStringNumberInSet() {
		assertEquals(INVALID_GAME_CHARS, rps.getRPSWinner("1p,pp,pp,pp"));
	}
	 
	@Test
	public void testStringInvalidLetterCommand() {
		assertEquals(INVALID_GAME_CHARS, rps.getRPSWinner("pp, pp, pp ,pa"));
	}
	
	@Test
	public void testStringNoCommas() {
		assertEquals(INVALID_STRING_LENGTH, rps.getRPSWinner("appppppp"));
	}
	
	@Test
	public void testStringAdditionalCharacterSet() {
		assertEquals(WINNER_PLAYER1, rps.getRPSWinner("sp, pp, pp ,pp, pp"));
	}
	
	@Test
	public void testStringAdditionalCharInSet() {
		assertEquals(INVALID_STRING_LENGTH, rps.getRPSWinner("sp, pp, psp ,pp"));
	}
	
	@Test
	public void testStringMissingSomeSets() {
		assertEquals(WINNER_PLAYER1, rps.getRPSWinner("sp, ,  ,"));
	}	
	
	@Test
	public void testStringIgnoreCaseOfValidChars() {
		assertEquals(WINNER_PLAYER2, rps.getRPSWinner("PP, PS,  ps,   ps"));
	}	
	
	@Test
	public void testStringUnicodeSpace() {
		assertEquals(INVALID_STRING_LENGTH, rps.getRPSWinner("\\sP, PS,  ps,   ps"));
	}
	
	@Test
	public void testStringUnicodeScisscorChar() {
		char c = '\u0161';
		String sStr = "" + c + c + "," + c + c + "," + c + c + "," + c + c;
		assertEquals(INVALID_GAME_CHARS, rps.getRPSWinner(sStr));
	}
	
	@Test
	public void testStringCharacterSetWithDollarSign() {
		assertEquals(INVALID_GAME_CHARS, rps.getRPSWinner("$P, PS,  ps,   ps"));
	} 
	
	@Test
	public void testStringOneGame() {
		assertEquals(WINNER_PLAYER1, rps.getRPSWinner("sP"));
	}
}
