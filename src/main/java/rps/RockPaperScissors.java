package rps;

public class RockPaperScissors {
	public static String fight (String input) {
		int A_wins = 0;
		int B_wins = 0;
		for (String move: input.split(",")) {
			move = move.replaceAll("\\s", "");
			// System.out.println("move: '" + move + "'");
			switch (move) {
				case "RR":
					break;
				case "RP":
					B_wins++;
					break;
				case "RS":
					A_wins++;
					break;
				case "PR":
					A_wins++;
					break;
				case "PP":
					break;
				case "PS":
					B_wins++;
					break;
				case "SR":
					B_wins++;
					break;
				case "SP":
					A_wins++;
					break;
				case "SS":
					break;
				default:
					throw new IllegalArgumentException();
			}
		}
		// System.out.println(A_wins);
		// System.out.println(B_wins);
		if (A_wins > B_wins) {
			return "A";
		} else if (A_wins < B_wins) {
			return "B";
		} else {
			return "DRAW";
		}
	}
}
