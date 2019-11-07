import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.List;

public class Rps {
  List<String> aWins = Arrays.asList("RS", "PR", "SP");
  List<String> bWins = Arrays.asList("RP", "PS", "SR");

  public String whoWins(String input) {
    String[] moves = sanitizeInput(input);
    int aScore = 0;
    int bScore = 0;

    for (String round : moves) {
      if (aWins.contains(round))
        ++aScore;
      if (bWins.contains(round))
        ++bScore;
    }

    if (aScore == bScore)
      return "TIE";
    return (aScore > bScore ? "A" : "B");
  }

  String[] sanitizeInput(String input) {

    if (input.matches(".*[^RPSrps, ].*"))
      throw new InvalidParameterException("Incorrect symbols in input.");
    String[] game = input.toUpperCase().replaceAll("\\s+", "").split(",", 0);
    if (game.length == 0)
      throw new InvalidParameterException("No moves provided");

    for (String round : game) {
      if (round.length() != 2) {
        throw new InvalidParameterException("Invalid round provided");
      }
    }
    return game;
  }
}
