package test;

import rps.RPS;
import org.junit.Test;

import static org.junit.Assert.fail;

public class rpsTest {
    @Test
    public void testMultiPlayerRR() {
        boolean test = RPS.decisionMessageMultiplayer(0,0).equals("It's a tie! Try again!");
        if (!test) {
            fail("Didn't match");
        }
    }

    @Test
    public void testMultiPlayerPP() {
        boolean test = RPS.decisionMessageMultiplayer(1,1).equals("It's a tie! Try again!");
        if (!test) {
            fail("Didn't match");
        }
    }

    @Test
    public void testMultiPlayerSS() {
        boolean test = RPS.decisionMessageMultiplayer(2,2).equals("It's a tie! Try again!");
        if (!test) {
            fail("Didn't match");
        }
    }

    @Test
    public void testMultiPlayerRP() {
        boolean test = RPS.decisionMessageMultiplayer(0,1).equals("Paper beats rock! Player 2 wins!");
        if (!test) {
            fail("Didn't match");
        }
    }

    @Test
    public void testMultiPlayerRS() {
        boolean test = RPS.decisionMessageMultiplayer(0,2).equals("Rock beats scissors! Player 1 wins!");
        if (!test) {
            fail("Didn't match");
        }
    }

    @Test
    public void testMultiPlayerPR() {
        boolean test = RPS.decisionMessageMultiplayer(1,0).equals("Paper beats rock! Player 1 wins!");
        if (!test) {
            fail("Didn't match");
        }
    }

    @Test
    public void testMultiPlayerPS() {
        boolean test = RPS.decisionMessageMultiplayer(1,2).equals("Scissor beats paper! Player 2 wins!");
        if (!test) {
            fail("Didn't match");
        }
    }

    @Test
    public void testMultiPlayerSR() {
        boolean test = RPS.decisionMessageMultiplayer(2,0).equals("Rock beats scissors! Player 2 wins!");
        if (!test) {
            fail("Didn't match");
        }
    }

    @Test
    public void testMultiPlayerSP() {
        boolean test = RPS.decisionMessageMultiplayer(2,1).equals("Scissor beats paper! Player 1 wins!");
        if (!test) {
            fail("Didn't match");
        }
    }

    // single player
    @Test
    public void testSinglePlayerRR() {
        boolean test = RPS.decisionMessageSingle(0,0).equals("It's a tie! Try again!");
        if (!test) {
            fail("Didn't match");
        }
    }

    @Test
    public void testSinglePlayerPP() {
        boolean test = RPS.decisionMessageSingle(1,1).equals("It's a tie! Try again!");
        if (!test) {
            fail("Didn't match");
        }
    }

    @Test
    public void testSinglePlayerSS() {
        boolean test = RPS.decisionMessageSingle(2,2).equals("It's a tie! Try again!");
        if (!test) {
            fail("Didn't match");
        }
    }

    @Test
    public void testSinglePlayerRP() {
        boolean test = RPS.decisionMessageSingle(0,1).equals("Paper beats rock! You lost! :(");
        if (!test) {
            fail("Didn't match");
        }
    }

    @Test
    public void testSinglePlayerRS() {
        boolean test = RPS.decisionMessageSingle(0,2).equals("Rock beats scissors! You won!");
        if (!test) {
            fail("Didn't match");
        }
    }

    @Test
    public void testSinglePlayerPR() {
        boolean test = RPS.decisionMessageSingle(1,0).equals("Paper beats rock! You won!");
        if (!test) {
            fail("Didn't match");
        }
    }

    @Test
    public void testSinglePlayerPS() {
        boolean test = RPS.decisionMessageSingle(1,2).equals("Scissor beats paper! You lost! :(");
        if (!test) {
            fail("Didn't match");
        }
    }

    @Test
    public void testSinglePlayerSR() {
        boolean test = RPS.decisionMessageSingle(2,0).equals("Rock beats scissors! You lost! :(");
        if (!test) {
            fail("Didn't match");
        }
    }

    @Test
    public void testSinglePlayerSP() {
        boolean test = RPS.decisionMessageSingle(2,1).equals("Scissor beats paper! You won!");
        if (!test) {
            fail("Didn't match");
        }
    }
}
