package cs3250.projects.rps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class RPSTest {
	
	//Null
	@Test
	public void testRPSWinner_null() {
		assertEquals("String is null", RPS.rpsWinner(null) );
	}
	
	//Empty String
	@Test
	public void testRPSWinner_emptyString() {
		assertEquals("String is empty", RPS.rpsWinner("") );
	}
	
	//one character string
	@Test
	public void testRPSWinner_oneCharacterString() {
		assertEquals("String must contain 2 letters (RPS) seperated by commas", RPS.rpsWinner("R, PS, RP, S"));
	}
	
	//Three plus character string
	@Test
	public void testRPSWinner_threePlusCharacterString() {
		assertEquals("String must contain 2 letters (RPS) seperated by commas", RPS.rpsWinner("RS, PSR, RP, SR"));
	}
	
	//Non RPS Letter
	@Test
	public void testRPSWinner_nonRPSLetter() {
		assertEquals("String must only contain letters R, P, and S", RPS.rpsWinner("RS, TR, RR, SS"));
	}
	
	//Has Special Character
	@Test
	public void testRPSWinner_specialCharacter() {
		assertEquals("String must only contain letters R, P, and S", RPS.rpsWinner("[S, PR, RR, SS"));
	}
	
	//Has Numbers
	@Test
	public void testRPSWinner_numberCharacter() {
		assertEquals("String must only contain letters R, P, and S", RPS.rpsWinner("RS, PR, R1, SS"));
	}
	
	//Draw case
	@Test
	public void testRPSWinner_draw() {
		assertEquals("Draw", RPS.rpsWinner("RS, SS, RP, PS, SP, RR"));
	}
	
	//A wins
	@Test
	public void testRPSWinner_aWin() {
		assertEquals("Player A Wins", RPS.rpsWinner("RS, SP, RP, PR, RS"));
	}
	
	//B wins
	@Test
	public void testRPSWinner_bWin() {
		assertEquals("Player B Wins", RPS.rpsWinner("SR, SP, RP, PS"));
	}
	
	//upper and lower case
	//Draw case
	@Test
	public void testRPSWinner_draw_differentCase() {
		assertEquals("Draw", RPS.rpsWinner("RS, sS, RP, rR"));
	}
		
	//A wins
	@Test
	public void testRPSWinner_aWin_differentCase() {
		assertEquals("Player A Wins", RPS.rpsWinner("rS, Sp, rP, PR, RS, pp"));
	}
		
	//B wins
	@Test
	public void testRPSWinner_bWin_differentCase() {
		assertEquals("Player B Wins", RPS.rpsWinner("sr, Sp, rp, PS, rr"));
	}
	
	//B wins
	@Test
	public void testRPSWinner_bWin_noSpaceBetweenLetters() {
		assertEquals("Player B Wins", RPS.rpsWinner("sr,Sp,rp,PS,rr"));
	}
	
}
