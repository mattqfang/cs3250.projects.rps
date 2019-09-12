package rps;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest {

	@Test
	public void test() {
		assertEquals("A", Game.playGame("RS,RP,RR,PR"));
		assertEquals("DRAW", Game.playGame("RS,RP,RR"));
		assertEquals("B", Game.playGame("RS,RP,RR,PR,PS,RP"));
		assertEquals("DRAW", Game.playGame(",,,,,,,,,,"));
	}

}
