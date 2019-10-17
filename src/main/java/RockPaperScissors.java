import java.util.ArrayList;
import java.util.List;

public class RockPaperScissors {

    public static String determineWinner(String input){
        String[] plays = input.trim().split(",");

        int pAScore = 0;
        int pBScore = 0;

        String pAMove = "";
        String pBMove = "";

        for(String round : plays){
            round.trim();
            if(round.length()!=2) return "Unexpected input: "+round;
            pAMove = round.substring(0,1);
            pBMove = round.substring(1,2);

            switch(pAMove){
                case "R":
                    switch(pBMove){
                        case "R":
                            break;
                        case "P":
                            pBScore++;
                            break;
                        case "S":
                            pAScore++;
                            break;
                        default:
                            return "Unexpected input: "+round;
                    }
                    break;
                case "P":
                    switch(pBMove){
                        case "R":
                            pAScore++;
                            break;
                        case "P":
                            break;
                        case "S":
                            pBScore++;
                            break;
                        default:
                            return "Unexpected input: "+round;
                    }
                    break;
                case "S":
                    switch(pBMove){
                        case "R":
                            pBScore++;
                            break;
                        case "P":
                            pAScore++;
                            break;
                        case "S":
                            break;
                        default:
                            return "Unexpected input: "+round;
                    }
                    break;
                default:
                    return "Unexpected input: "+round;
            }
        }

        if(pAScore > pBScore) return "A";
        else if(pAScore < pBScore) return "B";
        else return "DRAW";

    }
}
