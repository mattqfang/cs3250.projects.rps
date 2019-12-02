package RockPaperScissors;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RPSTest {
	private RPS rps;
	
	@Before
	public void setUp() {
		rps = new RPS();
	}
	
	@Test
	public void test1() {
		String data = "rp, sr, ps";
		String returned = rps.checkWinner(data);
		assertEquals("B", returned);
	}
	
	@Test
	public void test2() {
		String data = " pp , RR , sS ";
		String returned = rps.checkWinner(data);
		assertEquals("DRAW", returned);
	}
	
	@Test
	public void test3() {
		String data = "Sp, rS, pr";
		String returned = rps.checkWinner(data);
		assertEquals("A", returned);
	}
	
	@Test
	public void test4() {
		String data = "";
		String returned = rps.checkWinner(data);
		assertEquals("Invalid input", returned);
	}
	
	@Test
	public void test5() {
		String data = "p";
		String returned = rps.checkWinner(data);
		assertEquals("Invalid input", returned);
	}

}


// return "A" "B" OR "DRAW"
// what about incorrect input?