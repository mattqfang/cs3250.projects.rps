// I, Dallen Baldwin, assert that this source code was either written by myself
// or provided by my instructor. For all intents and purposes, it is original.

package uvu.cs.cs3250.assignments;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RockPaperScissorsTest {

    @Test
    public void testForNull() {
        assertFalse(RockPaperScissors.isValidGame(null));
    }

    @Test
    public void testForDigits() {
        String digits = "12, 23, 32";
        assertFalse(RockPaperScissors.isValidGame(digits));
    }

    @Test
    public void testForIllegalCharacters() {
        String illegal = "RR, $R, PS";
        assertFalse(RockPaperScissors.isValidGame(illegal));
    }

    @Test
    public void testForWords() {
        String words = "Rock, Paper, Paper, Scissors, Rock, Rock";
        assertFalse(RockPaperScissors.isValidGame(words));
    }

    @Test
    public void testForMorePlayers() {
        String word = "RR, RPS";
        assertFalse(RockPaperScissors.isValidGame(word));
    }

    @Test
    public void testValidGame_noSpaces() {
        String noSpaces = "RR,SS,PP,RP,PP";
        assertTrue(RockPaperScissors.isValidGame(noSpaces));
    }

    @Test
    public void testValidGame_withSpaces() {
        String withSpaces = "PR, SP, SR, SR, RS";
        assertTrue(RockPaperScissors.isValidGame(withSpaces));
    }

    @Test
    public void testValidGame_mixedSpaces() {
        String mixedSpaces = "PS, PS, SP ,RR,PR";
        assertTrue(RockPaperScissors.isValidGame(mixedSpaces));
    }

    @Test
    public void playValidGame_hanShotFirst() {
        String validGame = "RS ,RR ,SR ,RS";
        // 1, d, 2, 1
        assertEquals("Player A wins!", RockPaperScissors.playRPS(validGame));
    }

    @Test
    public void playValidGame_greedoShotFirst() {
        String validGame = "SR, PP, RS, SR";
        // 2, d, 1, 2
        assertEquals("Player B wins!", RockPaperScissors.playRPS(validGame));
    }

    @Test
    public void playValidGame_draw() {
        String validGame = "PP ,SR, RS,RR";
        // d, 2, 1, d
        assertEquals("It's a Draw!", RockPaperScissors.playRPS(validGame));
    }

    @Test
    public void playValidGame_actuallyInvalid() {
        String inValidGame = "$P, R@";
        assertEquals("Sorry. The game is invalid", RockPaperScissors.playRPS(inValidGame));
    }

}