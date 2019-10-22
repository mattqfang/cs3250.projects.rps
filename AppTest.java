package cs3250.RPS;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigorous Test :-)
     */
    public void testApp()
    {
    	String test1 = "RPR";
        assertFalse( App.main(test1) );
        String test2 = "RP,RR";
        assertTrue( App.main(test2) );
        String test3 = "RP,       RR";
        assertTrue( App.main(test3) );
        String test4 = "RP,RR,rr,SS,ss,R        P, rs, sp,      s                   R   ,        RR, PP, pp, rp, sp,    s        s , rr";
        assertTrue( App.main(test4) );
        String test5 = "ROCK PAPER, PAPER SCISSORS";
        assertFalse( App.main(test5) );
        String test6 = "";
        assertFalse( App.main(test6) );
        String test7 = null;
        assertFalse( App.main(test7) );
    }
}
