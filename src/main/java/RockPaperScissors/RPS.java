package RockPaperScissors;

public class RPS {
	
	public static void main(String[] args) {
		System.out.println("started");
		
		RPS rps = new RPS();
		String winner = rps.checkWinner("ps, sp, rp");
		
		System.out.println("winner is " + winner);
		
		System.out.println("done");
	}
	
	public String checkWinner(String input) {
		Integer playerA = 0; 
		Integer playerB = 0;
		
		for(String s: input.toUpperCase().split(",")) {
			switch (s.trim()) {
			case "RS":
			case "PR":
			case "SP":
				playerA++;
				break;
			case "SR":
			case "RP":
			case "PS":
				playerB++;
				break;
			case "RR":
			case "PP":
			case "SS":
				break;
			default:
				return "Invalid input";
			}
		}
		
		System.out.println(playerA + ", " + playerB);
		
		if(playerA==playerB) {
			return "DRAW";
		}
		else if(playerA < playerB) {
			return "B";
		}
		else {
			return "A";
		}
	}

}
/*
 * use trim to remove spaces
 * 'distill' input
 * break into substrings
 * count wins
 * return winner
 */

// return "A" "B" OR "DRAW"
// What about incorrect input?