package uvu.cs.cs3250.rps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UnitTests 
{
	@Test
	public void testWinnerA()
	{
		String winner = RockPaperScissors.Play("PR,SP,RS");
		
		assertEquals("A", winner);
	}
	
	@Test
	public void testWinnerB()
	{
		String winner = RockPaperScissors.Play("RP,PS,SR");
		
		assertEquals("B", winner);
	}
	
	@Test
	public void testWinnerDraw()
	{
		String winner = RockPaperScissors.Play("RR,PP,SS");
		
		assertEquals("DRAW", winner);
	}
	
	@Test
	public void testNoInput()
	{
		String winner = RockPaperScissors.Play(null);
		
		assertEquals("Invalid Input", winner);	
	}
	
	@Test
	public void testNumbers()
	{
		String winner = RockPaperScissors.Play("12,14,15");
		
		assertEquals("DRAW", winner);
	}
	
	@Test
	public void testWrongDelimiter()
	{
		String winner = RockPaperScissors.Play("PR-SP-PR");
		
		assertEquals("Invalid Input", winner);
	}
	
}
