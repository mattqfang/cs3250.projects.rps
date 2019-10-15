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
	public void TestPlayRPS_Garbage() {
		String winner = RPS.playRPS("WR, ON, G!, RS");
		assertEquals("A", winner);
	}
}
