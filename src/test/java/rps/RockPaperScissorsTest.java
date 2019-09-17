import org.junit.Test;
import static org.junit.Assert.assertEquals;

import rps.RockPaperScissors;

public class RockPaperScissorsTest {
	@Test
	public void testAWins () {
		assertEquals("A", RockPaperScissors.fight("PR,PR,RP"));
		assertEquals("A", RockPaperScissors.fight("PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR"));
		assertEquals("A", RockPaperScissors.fight("SP"));
	}

	@Test
	public void testBWins () {
		assertEquals("B", RockPaperScissors.fight("RP,RP,PR"));
		assertEquals("B", RockPaperScissors.fight("RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP"));
		assertEquals("B", RockPaperScissors.fight("PS"));
	}

	@Test
	public void testDraw () {
		assertEquals("DRAW", RockPaperScissors.fight("RP,RP,PR,PR"));
		assertEquals("DRAW", RockPaperScissors.fight("RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR"));
	}

	@Test
	public void testIgnoreWhitespace () {
		assertEquals("A", RockPaperScissors.fight("PR  ,PR"));
	}

	@Test(expected = NullPointerException.class)
	public void testNullIsDraw () {
		RockPaperScissors.fight(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testBadInput () {
		RockPaperScissors.fight("RP,SP,Bad input");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testEmptyString () {
		RockPaperScissors.fight("");
	}
}

