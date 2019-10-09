import static org.junit.Assert.assertEquals;

import org.junit.Test;

//IDEAS FOR HAPPY TESTS :)

public class RPSTest {
	@Test
	public void testRPS() {
		assertEquals("B", RPS.winner("RP,PP,PS,SP"));
	}
	//IDEAS FOR SAD TESTS :(
	@Test
	public void testSpaces() {
		assertEquals("B", RPS.winner("R P, PP, PS, SP "));
	}
	@Test
	public void testDraw() {
		assertEquals("Draw", RPS.winner("RP, PP, SS, SP "));
	}
	@Test
	public void testLowerCase() {
		assertEquals("A", RPS.winner("rs, pp, ss, sp"));
	}
	@Test
	public void testEmpty() {
		assertEquals("Error: String is Empty.", RPS.winner(""));
	}
	
}




