import org.junit.Test;
import static org.junit.Assert.assertEquals;

import rps.RockPaperScissors;

// TODO: break up all asserts into their own test cases
public class RockPaperScissorsTest {
	@Test
	public void testAWinsOne () {
		assertEquals("A", RockPaperScissors.fight("SP"));
	}

	@Test
	public void testAWinsMany () {
		assertEquals("A", RockPaperScissors.fight("PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR"));
	}

	@Test
	public void testBWinsOne () {
		assertEquals("B", RockPaperScissors.fight("PS"));
	}

	@Test
	public void testBWinsMany () {
		assertEquals("B", RockPaperScissors.fight("RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP"));
	}

	@Test
	public void testDrawOne () {
		assertEquals("DRAW", RockPaperScissors.fight("RP,PR"));
	}

	@Test
	public void testDrawMany () {
		assertEquals("DRAW", RockPaperScissors.fight("RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR,RP,PR"));
	}

	@Test
	public void testIgnoreWhitespace () {
		assertEquals("A", RockPaperScissors.fight("PR  ,PR"));
	}

	@Test(expected = NullPointerException.class)
	public void testNull () {
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

