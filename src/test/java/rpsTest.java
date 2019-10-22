import static org.junit.Assert.*;

import org.junit.Test;



public class rpsTest {

	@Test
	public void drawTest() {
		RockPaperScissors rps = new RockPaperScissors();
		String data[] = {"RR", "RP", "PR", "SS"};
		String result = rps.play(data);
		assertEquals("DRAW", result);
		
	}
	@Test
	public void aWinTest() {
		RockPaperScissors rps = new RockPaperScissors();
		String data[] = {"RS", "PR", "SP", "SS", "RP"};
		String result = rps.play(data);
		assertEquals("A", result);
		
	}
	@Test
	public void BWinTest() {
		RockPaperScissors rps = new RockPaperScissors();
		String data[] = {"RP", "PS", "SR", "RR", "PP", "PR"};
		String result = rps.play(data);
		assertEquals("B", result);
		
	}
	@Test
	public void invalidTest() {
		RockPaperScissors rps = new RockPaperScissors();
		String data[] = {"RP", "SR", "PP", "SS", "RR", "PR", "RPS"};
		String result = rps.play(data);
		assertEquals("Invalid game!", result);
		
	}
	


}
