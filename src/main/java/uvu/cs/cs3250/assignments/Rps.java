package uvu.cs.cs3250.assignments;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

public class Rps {

  Map<String, Integer> moveMap;
  String[][] winLoseMatrix = { { "", "B", "A" }, { "A", "", "B" }, { "B", "A", "" } };

  public String whoWins(String input) {
    initMoveMap();
    String[][] moves = sanitizeInput(input);

    int aScore = 0;
    int bScore = 0;

    for (int i = 0; i < moves[0].length; i++) {
      int aMove = moveMap.get(moves[0][i]);
      int bMove = moveMap.get(moves[1][i]);

      String roundResult = winLoseMatrix[aMove][bMove];

      if (roundResult.equals("A"))
        ++aScore;
      if (roundResult.equals("B"))
        ++bScore;
    }

    if (aScore == bScore)
      return "TIE";
    String result = (aScore > bScore ? "A" : "B");
    return result;

  }

  void initMoveMap() {
    moveMap = new HashMap<>();
    moveMap.put("r", 0);
    moveMap.put("p", 1);
    moveMap.put("s", 2);
  }

  String[][] sanitizeInput(String input) {

    if (input.matches(".*[^RPSrps, ].*"))
      throw new InvalidParameterException("Incorrect symbols in input.");

    String[] players = input.toLowerCase().replaceAll("\\s+", "").split(",", 0);

    if (players.length != 2)
      throw new InvalidParameterException("Expected two players");
    if (players[0].length() != players[1].length())
      throw new InvalidParameterException("Expected players to have same number of moves");

    String[] aMoves = players[0].split("");
    String[] bMoves = players[1].split("");
    String[][] playerMoves = { aMoves, bMoves };
    return playerMoves;
  }
}
