import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.security.InvalidParameterException;

public class RpsTest {
	public static Rps game = new Rps();

	@Test
	public void testAWins() {
		String moves = "rs,ps,rs";
		String winner = game.whoWins(moves);
		assertEquals(winner, "A");
	}

	@Test
	public void testBWins() {
		String moves = "rp,ps,rr";
		String winner = game.whoWins(moves);
		assertEquals(winner, "B");
	}

	@Test
	public void testTie() {
		String moves = "ps,sp";
		String winner = game.whoWins(moves);
		assertEquals(winner, "TIE");
	}

	@Test
	public void testStalemates() {
		String moves = "rr,rr,pp,pp,ss,ss";
		String winner = game.whoWins(moves);
		assertEquals(winner, "TIE");
	}

	@Test
	public void testCaseInsensitive() {
		String movesW = "pR,sP,Rr";
		String winnerW = game.whoWins(movesW);
		assertEquals(winnerW, "A");

		String movesT = "rR,RR,pp,Pp,SS,sS";
		String winnerT = game.whoWins(movesT);
		assertEquals(winnerT, "TIE");
	}

	@Test
	public void testManyWhitespace() {
		String moves = "  rp, ps, sr,  sr ,  rs";
		String winner = game.whoWins(moves);
		assertEquals(winner, "B");
	}

	@Test(expected = InvalidParameterException.class)
	public void testWrongLength() {
		String moves = "rs,rp,s,sp,r";
		game.whoWins(moves);
	}

	@Test(expected = InvalidParameterException.class)
	public void testAllEmpty() {
		String moves = ",";
		game.whoWins(moves);
	}

	@Test(expected = InvalidParameterException.class)
	public void testOneEmpty() {
		String moves = "rps,";
		game.whoWins(moves);
	}

	@Test(expected = InvalidParameterException.class)
	public void testNoComma() {
		String moves = "rpsssr";
		game.whoWins(moves);
	}

	@Test(expected = InvalidParameterException.class)
	public void testInvalidCharAlpha() {
		String moves = "rp,qw,es,ir";
		game.whoWins(moves);
	}

	@Test(expected = InvalidParameterException.class)
	public void testInvalidCharNum() {
		String moves = "rs, rr, 12, 31, 84";
		game.whoWins(moves);
	}

}
