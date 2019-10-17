
import static org.junit.Assert.*;

import org.junit.Test;



public class rpsTest {

	@Test
	public void aWinner() 
	{
		RockPaperScissors rsp = new RockPaperScissors();
		String input = "RS,RS,PR,PP";
		String winner = rsp.declareWinner(input);
		assertEquals("A", winner);
	}
		
	@Test
	public void drawTest() 
	{
		RockPaperScissors rsp = new RockPaperScissors();
		String input = "RR,PP,SS";
		String winner = rsp.declareWinner(input);
		assertEquals("DRAW", winner);
		
	}
	
	@Test
	public void bWinner() 
	{
		RockPaperScissors rsp = new RockPaperScissors();
		String input = "SR,RP,PR,PP,SS,SR";
		String winner = rsp.declareWinner(input);
		assertEquals("B", winner);
	}
		
	@Test
	public void lowerCase() 
	{
		RockPaperScissors rsp = new RockPaperScissors();
		String input = "rs,RS,pR,Pp";
		String winner = rsp.declareWinner(input);
		assertEquals("A", winner);
	}

}
