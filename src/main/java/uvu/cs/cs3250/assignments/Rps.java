package uvu.cs.cs3250.assignments;
import java.security.InvalidParameterException;


public class Rps {
  
  public String whoWins(String input) {
    String moves = input.toLowerCase();
    if (input.matches(".*[^RPSrps, ].*"))
      throw new InvalidParameterException("Incorrect symbols in input.");
 
    String[] players = moves
      .toLowerCase()
      .replaceAll("\\s+", "")
      .split(",", 0);

    if (players.length !=2)
      throw new InvalidParameterException("Expected two players");
    if (players[0].length() != players[1].length()) 
      throw new InvalidParameterException("Expected players to have same number of moves");

    int aScore = 0;
    int bScore = 0;

    for (int i = 0; i < players[0].length(); i++) {
      char aMove = players[0].charAt(i);
      char bMove = players[1].charAt(i);

      if (aMove == 'r') {
        if (bMove == 'p') bScore++;
        if (bMove == 's') aScore++;
      }

      if (aMove == 'p') {
        if (bMove == 's') bScore++;
        if (bMove == 'r') aScore++;
      }

      if (aMove == 's') {
        if (bMove == 'r') bScore++;
        if (bMove == 'p') aScore++;
      }
    }

    if (aScore == bScore) return "TIE";
    String result = (aScore > bScore ? "A": "B");
    return result;

  }
}
