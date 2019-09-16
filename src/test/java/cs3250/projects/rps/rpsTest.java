package cs3250.projects.rps;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class rpsTest {

	@Test 
	public void bWin() {		
		assertEquals("Player B wins!", rps.rpsWins("RP, PP, PS, SP"));		
	}
	
	@Test
	public void aWin() {
		assertEquals("Player A wins!", rps.rpsWins("PR, RS, RR, SP"));
	}
	
	@Test
	public void draw() {
		assertEquals("It's a draw", rps.rpsWins("RR, RS, PS, PP"));
	}
	
	@Test 
	public void bWin1() {		
		assertEquals("Player B wins!", rps.rpsWins(" RP, PS , PS, RS  "));		
	}
	
	@Test
	public void aWin1() {
		assertEquals("Player A wins!", rps.rpsWins("    P  R, RS   ,  RR  , RS  "));
	}
	
	@Test
	public void draw1() {
		assertEquals("It's a draw", rps.rpsWins("   RR , S S        ,           RR, P         P  "));
	}
	
	@Test
	public void case_empty() {
		assertEquals("Error: invalid input.", rps.rpsWins(""));
	}

}
