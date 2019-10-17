import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RockPaperScissors_Test {
    @Test
    public void ValidInput_PlayerAWins(){
        String input = "RS,RP,PS,PR,PP,RS,SP";
        assertEquals("A",RockPaperScissors.determineWinner(input));
    }

    @Test
    public void ValidInput_PlayerBWins(){ //TODO: WRITE
        String input = "RS,RP,PS,PS,PP,RP,SP";
        assertEquals("B",RockPaperScissors.determineWinner(input));
    }

    @Test
    public void ValidInput_Draw(){ //TODO: WRITE
        String input = "RS,RP,PS,PR,PP,RR,SS";
        assertEquals("DRAW",RockPaperScissors.determineWinner(input));
    }

    @Test
    public void InvalidInput_UnacceptableCharacter(){ //TODO: WRITE
        String input = "RS,RP,PQ,PR,PP,RS,SP";
        assertEquals("Unexpected input: PQ",RockPaperScissors.determineWinner(input));
    }

    @Test
    public void InvalidInput_TooManyCharacters(){ //TODO: WRITE
        String input = "RS,RPP,PS,PR,PP,RS,SP";
        assertEquals("Unexpected input: RPP",RockPaperScissors.determineWinner(input));
    }

    @Test
    public void InvalidInput_TooFewCharacters(){ //TODO: WRITE
        String input = "RS,RP,P,PR,PP,RS,SP";
        assertEquals("Unexpected input: P",RockPaperScissors.determineWinner(input));
    }

}
