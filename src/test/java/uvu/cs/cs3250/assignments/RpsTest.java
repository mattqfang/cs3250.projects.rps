package uvu.cs.cs3250.assignments;

import static org.junit.Assert.assertEquals;
import java.security.InvalidParameterException;
import org.junit.Test;

public class RpsTest {
	public static Rps game = new Rps();

	@Test
	public void testAWins(){
		String moves = "rpr,sss";
		String winner = game.whoWins(moves);
		assertEquals(winner, "A");
	}

	@Test
	public void testBWins(){
		String moves = "rpr, psr";
		String winner = game.whoWins(moves);
		assertEquals(winner, "B");
	}

	@Test
	public void testTie(){
		String moves = "ps,sp";
		String winner = game.whoWins(moves);
		assertEquals(winner, "TIE");
	}
	@Test
	public void testStalemates(){
		String moves = "rrppss,rrppss";
		String winner = game.whoWins(moves);
		assertEquals(winner, "TIE");
	}

	@Test
	public void testCaseInsensitive(){
		String movesW = "psR,RPr";
		String winnerW = game.whoWins(movesW);
		assertEquals(winnerW, "A");

		String movesT = "rRpPSs,RRppSS";
		String winnerT = game.whoWins(movesT);
		assertEquals(winnerT, "TIE");
	}

	@Test
	public void testManyWhitespace(){
		String moves = "    rpssr ,   psrrs  ";
		String winner = game.whoWins(moves);
		assertEquals(winner, "B");
	}

	@Test(expected = InvalidParameterException.class)
	public void testWrongLength() {
		String moves = "rrppss,s";
		game.whoWins(moves);
	}

	@Test(expected = InvalidParameterException.class)
	public void testTooManyCommas(){
		String moves = "rrpp,ssrp,rpss";
		game.whoWins(moves);
	}

	@Test(expected = InvalidParameterException.class)
	public void testAllEmpty(){
		String moves = ",";
		game.whoWins(moves);
	}

	@Test(expected = InvalidParameterException.class)
	public void testOneEmpty(){
		String moves = "rps,";
		game.whoWins(moves);
	}

	@Test(expected = InvalidParameterException.class)
	public void testNoComma(){
		String moves = "rpsssr";
		game.whoWins(moves);
	}

	@Test(expected = InvalidParameterException.class)
	public void testInvalidCharAlpha(){
		String moves = "rpqwe,sirru";
		game.whoWins(moves);
	}

	@Test(expected = InvalidParameterException.class)
	public void testInvalidCharNum(){
		String moves = "rr192,sr371";
		game.whoWins(moves);
	}

}