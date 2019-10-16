package rps;

import static org.junit.Assert.*;

import org.junit.Test;

public class RPSTest {

	@Test
	public void testplayRPS_null() {
		String expected = "Not a valid RPS game";
		String actual = Game.playRPS("");
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMixedCase() {
		String expected = "A";
		String actual = Game.playRPS("pR");
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSingleRound() {
		String expected = "A";
		String actual = Game.playRPS("RS");
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPaperCoversRock() {
		String expected = "B";
		String actual = Game.playRPS("RP");
		assertEquals(expected, actual);
	}
	
	@Test
	public void testScissorsCutsPaper() {
		String expected = "A";
		String actual = Game.playRPS("SP");
		assertEquals(expected, actual);
	}
	
	@Test
	public void testWinnerIsA() {
		String expected = "A";
		String actual = Game.playRPS("RS, SP");
		assertEquals(expected, actual);
	}
	
	@Test
	public void testWinnerISB() {
		String expected = "B";
		String actual = Game.playRPS("PS, SR");
		assertEquals(expected, actual);
	}
	
	@Test
	public void testIsDraw() {
		String expected = "DRAW";
		String actual = Game.playRPS("RR, RR");
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDigitInRound() {
		String expected = "Not a valid RPS game";
		String actual = Game.playRPS("R3, RR");
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSpecialCharInRound() {
		String expected = "Not a valid RPS game";
		String actual = Game.playRPS("SS, *R");
		assertEquals(expected, actual);
	}
	
	@Test
	public void testNotCommaSeperated() {
		String expected = "Each round must be seperated by a ','";
		String actual = Game.playRPS("RRRR");
		assertEquals(expected, actual);
	}
	
	@Test
	public void testInvalidNumberPlays() {
		String expected = "Each round must contain a play from both players";
		String actual = Game.playRPS("SS,S");
		assertEquals(expected, actual);
	}
}
