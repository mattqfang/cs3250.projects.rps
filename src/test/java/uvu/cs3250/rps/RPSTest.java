package uvu.cs3250.rps;

import org.junit.Test;
import static org.junit.Assert.*;

public class RPSTest {
    @Test
    public void testPlayerAWins() {
        RPS game = new RPS();
        assertEquals("Player A wins", game.match("RS,PP,SP"));
    }
    @Test
    public void testNotPlayerBWins() {
        RPS game = new RPS();
        assertNotEquals("Player B wins", game.match("RS,PP,SP"));
    }
    @Test
    public void testPlayerBWins() {
        RPS game = new RPS();
        assertEquals("Player B wins", game.match("SR,RS,PR,SR,RP"));
    }
    @Test
    public void testHandleDraw() {
        RPS game = new RPS();
        assertEquals("Draw", game.match("SR,RS,PR,SR,PP"));
    }
    @Test
    public void testHandleExtendedInput() {
        RPS game = new RPS();
        assertEquals("Player A wins",
                game.match("SR,RS,PR,SR,RP,RR,PS,RS,SP,SR,PP,RR,PR,RP,SP,RP,RS,SP, " +
                        "SR,RS,PR,SR,RP,RR,PS,RS,SP,SR,PP,RR,PR,RP,SP,RP,RS,SP"));
    }
    @Test
    public void testInvalidCharacters() {
        RPS game = new RPS();
        assertEquals("Draw", game.match("QQ,HG,  bf   ,  $z,**,23,{a"));
    }
    @Test
    public void testInvalidCharactersPlayerBWins() {
        RPS game = new RPS();
        assertEquals("Player B wins", game.match("SR,RS,QQ,HG,bf,$z,**,23,{a,PP,RP"));
    }
    @Test
    public void testLowerCaseInput() {
        RPS game = new RPS();
        assertEquals("Player A wins", game.match("sp,rs,pp,sr,sp,rr,rp"));
    }
    @Test
    public void testIncorrectRoundLengths() {
        RPS game = new RPS();
        assertEquals("Draw", game.match("ssrp,pss,sssrssp,psprs,psr"));
    }
    @Test
    public void testIncorrectRoundLengthsPlayerAWin() {
        RPS game = new RPS();
        assertEquals("Player A wins", game.match("ssrp,pss,sp,sssrssp,rp,psprs,pr,psr"));
    }



}
