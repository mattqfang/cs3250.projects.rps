package uvu.cs.cs3250.projects;

import java.util.ArrayList;
import java.util.List;

public class RockPaperScissors {

    public String rockPaperScissors (String match) {
        String badInput = "Improper game input A & B both forfeit";

        if (match == null || match.length() == 0) return badInput;

        int numPlayers = 2;
        List<String> rounds = new ArrayList<>();
        String[] allMoves = match.split("[^prsPRS]+");
        String flattenedStr = String.join("", allMoves);
        for (int i = 0; i < flattenedStr.length(); i += numPlayers) {
            rounds.add(flattenedStr.substring(i, Math.min(flattenedStr.length(), i + numPlayers)));
        }

        String winner = "";
        int aGameCount = 0;
        int bGameCount = 0;

        for (String round : rounds) {
            if (round.length() < numPlayers) return badInput;
            if (round.equalsIgnoreCase("pr")) {
                aGameCount++;
            }
            else if (round.equalsIgnoreCase("sp")) {
                aGameCount++;
            }
            else if (round.equalsIgnoreCase("rs")) {
                aGameCount++;
            }
            else if (round.equalsIgnoreCase("rp")) {
                bGameCount++;
            }
            else if (round.equalsIgnoreCase("ps")) {
                bGameCount++;
            }
            else if (round.equalsIgnoreCase("sr")){
                bGameCount++;
            }
        }

        if (aGameCount > bGameCount) winner = "A wins";
        else if (aGameCount < bGameCount) winner = "B wins";
        else winner = "Draw";

        return winner;
    }

}