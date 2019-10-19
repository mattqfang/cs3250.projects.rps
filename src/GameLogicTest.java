import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameLogicTest {
	GameLogic gl = new GameLogic();

//	@Test
//	void testInputValidator() {

//	}

	@Test
	void testR_P() {
		assertEquals(gl.getWinner("R , P"), "B is the winner!");
	}
	
	@Test
	void test_R_P_() {
		assertEquals(gl.getWinner(" R , P "), "B is the winner!");
	}
	
	@Test
	void testP_P() {
		assertEquals(gl.getWinner("P , P"), "Draw! Play again.");
	}
	
	@Test
	void testP_R() {
		assertEquals(gl.getWinner("P , R"), "A is the winner!");
	}
	
	@Test
	void testSP() {
		assertEquals(gl.getWinner("S,P"), "A is the winner!");
	}
}
