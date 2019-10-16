
import static org.junit.Assert.*;

import org.junit.Test;



public class rpsTest {

	@Test
	public void drawTest() {
		RockPaperScissors rsp = new RockPaperScissors();
		String data[] = {"RR", "PP", "SS", "SR", "RP", "PS","RR", "PP", "SS","RS", "SP", "PR","RR", "PP", "SS"};
		String result = rsp.shoot(data);
		assertEquals("DRAW", result);
		
	}
	@Test
	public void aWinTest() {
		RockPaperScissors rsp = new RockPaperScissors();
		String data[] = {"RS", "SP", "PR","RR", "PP", "SS"};
		String result = rsp.shoot(data);
		assertEquals("A", result);
		
	}
	@Test
	public void BWinTest() {
		RockPaperScissors rsp = new RockPaperScissors();
		String data[] = {"SR", "RP", "PS","RR", "PP", "SS"};
		String result = rsp.shoot(data);
		assertEquals("B", result);
		
	}
	@Test
	public void invalidTest() {
		RockPaperScissors rsp = new RockPaperScissors();
		String data[] = {"SR", "RP", "PS","RR", "PP", "SSS"};
		String result = rsp.shoot(data);
		assertEquals("error: only 2 players allowed", result);
		
	}
	


}
