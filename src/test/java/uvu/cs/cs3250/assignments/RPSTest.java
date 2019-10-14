package uvu.cs.cs3250.assignments;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class RPSTest 
{
	@Test
	public void TestNullInput()
	{
		assertTrue(RPS.CheckWinner(null).equals("INVALID INPUT"));
	}
	
	@Test
	public void TestValidDraw()
	{
		assertTrue(RPS.CheckWinner("PS,SP,RP,PR,PP").equals("DRAW"));
	}
	
	@Test
	public void TestValidWinnerA()
	{
		assertTrue(RPS.CheckWinner("RS,PR,SP").equals("A"));
	}
	
	@Test
	public void TestValidWinnerB()
	{
		assertTrue(RPS.CheckWinner("SR, RP, PS").equals("B"));
	}
	
	@Test
	public void TestSpaceTrimming()
	{
		assertFalse(RPS.CheckWinner(" PP , RR , SS ,").equals("INVALID INPUT"));
	}
	
	@Test
	public void TestInvalidInput()
	{
		assertTrue(RPS.CheckWinner("asdf").equals("INVALID INPUT"));
	}
	
	
}
