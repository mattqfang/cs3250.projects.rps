package rps;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest {

	@Test
	public void testPlayGame() throws InvalidInput {
		// Paper
		assertEquals("DRAW", Game.playGame("Pp"));
		assertEquals("A", Game.playGame("PR"));
		assertEquals("B", Game.playGame("pS"));
		
		// Rock
		assertEquals("B", Game.playGame("rP"));
		assertEquals("DRAW", Game.playGame("rR"));
		assertEquals("A", Game.playGame("RS"));
		
		// Scissors
		assertEquals("A", Game.playGame("SP"));
		assertEquals("B", Game.playGame("sR"));
		assertEquals("DRAW", Game.playGame("Ss"));

		// Longer strings
		assertEquals("A", Game.playGame("RS,RP,RR,PR"));
		assertEquals("DRAW", Game.playGame("RS,RP,RR"));
		assertEquals("B", Game.playGame("RS,RP,RR,PR,PS,RP"));
		
		// Really long string
		assertEquals("B", Game.playGame("RS,RP,RR,PR,PS,RP,RS,RP,RR,PR,PS,RP,RS,RP,RR,PR,PS,RP,RS,RP,RR,PR,PS,RP,RS,RP,RR,PR,PS,RP"));
	}
	
	// Empty string tests
	@Test(expected=InvalidInput.class)
	public void commaStringTest() throws InvalidInput{
		Game.playGame(",,,,,,,,,,");
	}
	
	@Test(expected=InvalidInput.class)
	public void emptyStringTest() throws InvalidInput{
		Game.playGame("");
	}
	
	@Test(expected=InvalidInput.class)
	public void nullTest() throws InvalidInput{
		Game.playGame(null);
	}
	
	@Test(expected=InvalidInput.class)
	public void allSpacesTest() throws InvalidInput{
		Game.playGame("            ");
	}

	// Not valid formatting
	@Test(expected=InvalidInput.class)
	public void oddSpacingTest() throws InvalidInput{
		Game.playGame(" R S, RP");
	}
	
	@Test(expected=InvalidInput.class)
	public void forgotCommaTest() throws InvalidInput{
		Game.playGame("RSRP,SR");
	}
	
	@Test(expected=InvalidInput.class)
	public void invalidCommandTest() throws InvalidInput{
		Game.playGame("PT,RS");
	}
}
