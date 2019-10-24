package uvu.cs.cs3250.projects;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RockPaperScissorsTest {

    @Test
    public void testNormalInput() {
        RockPaperScissors winnerA = new RockPaperScissors();
        String winner = winnerA.rockPaperScissors("RS, PR, SP, PP, PS");
        assertEquals("A wins", winner);
    }
    @Test
    public void testNoSeparators() {
        RockPaperScissors winnerA = new RockPaperScissors();
        String winner = winnerA.rockPaperScissors("RSPRSPPPPS");
        assertEquals("A wins", winner);
    }
    @Test
    public void testRandomCharacterSeparators() {
        RockPaperScissors winnerA = new RockPaperScissors();
        String winner = winnerA.rockPaperScissors("RS,  8 9, PR; SP[PP0PS");
        assertEquals("A wins", winner);
    }
    @Test
    public void testNullInput() {
        RockPaperScissors winnerA = new RockPaperScissors();
        String winner = winnerA.rockPaperScissors(null);
        assertEquals("Improper game input A & B both forfeit", winner);
    }
    @Test
    public void testEmptyString() {
        RockPaperScissors winnerA = new RockPaperScissors();
        String winner = winnerA.rockPaperScissors("");
        assertEquals("Improper game input A & B both forfeit", winner);
    }
    @Test
    public void testThreePlayersOdd() {
        RockPaperScissors winnerA = new RockPaperScissors();
        String winner = winnerA.rockPaperScissors("PRS, PPR, SPP, RRP, RRR");
        assertEquals("Improper game input A & B both forfeit", winner);
    }
    @Test
    public void testOneInput() {
        RockPaperScissors winnerA = new RockPaperScissors();
        String winner = winnerA.rockPaperScissors("P");
        assertEquals("Improper game input A & B both forfeit", winner);
    }
}