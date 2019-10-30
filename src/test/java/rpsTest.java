import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class rpsTest {

    @Test
    public void testSingleGame() {
        assertEquals("A", rps.runMatch("RS"));
    }

    @Test
    public void testSingleGame1() {
        assertEquals("B", rps.runMatch("SR"));
    }

    @Test
    public void testSingleGame2() {
        assertEquals("B", rps.runMatch("rp"));
    }

    @Test
    public void testSingleGame3() {
        assertEquals("A", rps.runMatch("pr"));
    }

    @Test
    public void testSingleGame4() {
        assertEquals("A", rps.runMatch("sp"));
    }

    @Test
    public void testSingleGame5() {
        assertEquals("B", rps.runMatch("ps"));
    }

    @Test
    public void testSingleGame6() {
        assertEquals("DRAW", rps.runMatch("pp"));
    }

    @Test
    public void testSingleGame7() {
        assertEquals("DRAW", rps.runMatch("ss"));
    }

    @Test
    public void testSingleGame8() {
        assertEquals("DRAW", rps.runMatch("rr"));
    }

    @Test
    public void test() {
        String testGame = "rp,ps, r r, rp";
        assertEquals("B", rps.runMatch(testGame));
    }

    @Test
    public void testAllCombos() {
        String testGame = "rp, rs, rr, pr, ps, pp, sr, sp, ss";
        assertEquals("DRAW", rps.runMatch(testGame));
    }

    @Test
    public void emptyTest() {
        assertEquals("DRAW", rps.runMatch(""));
    }

    @Test
    public void testBadFormatting() {
        String testGame = "rp, rs, rr, pr, ps, pp, sr, sp, ss, rp, rs, rr, pr, ps, pp, sr rp, rs, rr, pr, ps, pp, sr";
        assertEquals("DRAW", rps.runMatch(testGame));
    }
}
