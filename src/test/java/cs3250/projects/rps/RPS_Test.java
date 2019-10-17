package cs3250.projects.rps;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RPS_Test {
	@Test
	public void TestPlayRPS_A_Wins() {
		String winner = RPS.playRPS("PR, RS, SP");
		assertEquals("A", winner);
	}
	@Test
	public void TestPlayRPS_B_Wins() {
		String winner = RPS.playRPS("PS, SR, RP");
		assertEquals("B", winner);
	}
	@Test
	public void TestPlayRPS_Draw() {
		String winner = RPS.playRPS("PP, RR, SS, PR, PS");
		assertEquals("DRAW", winner);
	}
	@Test
	public void TestPlayRPS_One_Player_Glitch() {
		String winner = RPS.playRPS("P, R, S, S, R, S");
		assertEquals("DRAW", winner);
	}
	@Test
	public void TestPlayRPS_Three_Player_Glitch() {
		String winner = RPS.playRPS("PRR, RSS, SRS, SPP, RRP, SSS");
		assertEquals("DRAW", winner);
	}
	@Test
	public void TestPlayRPS_A_wins_But_with_Garbage() {
		String winner = RPS.playRPS("WR, ON, G!, RS");
		assertEquals("A", winner);
	}
	@Test
	public void TestPlayRPS_A_Wins_But_with_Garbage_2() {
		String winner = RPS.playRPS("PR, TP, RS, RT, SP");
		assertEquals("A", winner);
	}
	@Test
	public void TestPlayRPS_No_Commas() {
		String winner = RPS.playRPS("PRTPRSRTSP");
		assertEquals("DRAW", winner);
	}
	@Test
	public void TestPlayRPS_B_Wins_And_Then_No_Commas() {
		String winner = RPS.playRPS("SR, PRTPRSRTSP");
		assertEquals("B", winner);
	}
	@Test
	public void TestPlayRPS_Cheat_Code_B() {
		String winner = RPS.playRPS("B BRIBES THE JUDGE.");
		assertEquals("B", winner);
	}
	@Test
	public void TestPlayRPS_Cheat_Code_A() {
		String winner = RPS.playRPS("A BRIBES THE JUDGE.");
		assertEquals("A", winner);
	}
	@Test
	public void TestPlayRPS_Empty() {
		String winner = RPS.playRPS("");
		assertEquals("DRAW", winner);
	}
	@Test
	public void TestPlayRPS_Null() {
		String winner = RPS.playRPS(null);
		assertEquals(null, winner);
	}
}
