package rps;

import static org.junit.Assert.*;
import org.junit.Test;

public class PlayerTest {
	@Test
	public void getLosesToTest() {
		Player p = Player.playerFactory('R');
		
		assertEquals("P", p.getLosesTo());
	}
	
	@Test
	public void getWinsToTest() {
		Player p = Player.playerFactory('R');
		
		assertEquals("S", p.getWinsTo());
	}
	
	@Test
	public void getNameTest() {
		Player p = Player.playerFactory('R');
		
		assertEquals("R", p.getName());
	}
	
	@Test
	public void compareTest() {
		Player rock = Player.playerFactory('R');
		Player paper = Player.playerFactory('P');
		Player scissors = Player.playerFactory('S');
		
		assertEquals(0, Player.compare(rock, rock));
		assertEquals(1, Player.compare(rock, scissors));
		assertEquals(-1, Player.compare(rock, paper));
		
		assertEquals(0, Player.compare(paper, paper));
		assertEquals(1, Player.compare(paper, rock));
		assertEquals(-1, Player.compare(paper, scissors));
		
		assertEquals(0, Player.compare(scissors, scissors));
		assertEquals(1, Player.compare(scissors, paper));
		assertEquals(-1, Player.compare(scissors, rock));
	}
	
	@Test
	public void playerFactoryTest() {
		Player rock = Player.playerFactory('R');
		Player paper = Player.playerFactory('P');
		Player scissors = Player.playerFactory('S');
		
		assertEquals("P", paper.getName());
		assertEquals("R", rock.getName());
		assertEquals("S", scissors.getName());
		
		rock = Player.playerFactory('r');
		paper = Player.playerFactory('p');
		scissors = Player.playerFactory('s');
		
		assertEquals("P", paper.getName());
		assertEquals("R", rock.getName());
		assertEquals("S", scissors.getName());
		
		Player n = Player.playerFactory('t');
		assertEquals(null, n);		
	}
}
