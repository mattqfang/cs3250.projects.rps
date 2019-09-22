package uvu.cs.cs3250.assignments;

public class RockPaperScissors {
	
	public static String determineWinner(String rpsMatches) {
		if(rpsMatches ==  null) {
			return "";
		}
		rpsMatches = rpsMatches.trim();
		
		if(rpsMatches.length() < 2
				|| rpsMatches.charAt(0) == ' ') {
			return "";
		}
		
		rpsMatches.toUpperCase();
		
		boolean endOfString = false;
		int stringIndex = 0;
		int aWins = 0;
		int bWins = 0;
		int whileSafeguard = 100;
		
		while(!endOfString && whileSafeguard > 0) {
			
			if(rpsMatches.length() >= (stringIndex + 2)) {
				char playerAThrow = rpsMatches.charAt(stringIndex);
				char playerBThrow = rpsMatches.charAt(stringIndex + 1);
				stringIndex = stringIndex + 2;
				if((playerAThrow == 'R'
						|| playerAThrow == 'P'
						|| playerAThrow == 'S')
						&& (playerBThrow == 'R'
						|| playerBThrow == 'P'
						|| playerBThrow == 'S')) {
					char winner = whoWon(playerAThrow, playerBThrow);
					
					if(winner == 'A') {
						aWins++;
					} else if(winner == 'B') {
						bWins++;
					}
					
				} else {
					return "";
				}
			} else {
				return "";
			}
			
			if(rpsMatches.length() <= (stringIndex + 1)) {
				endOfString = true;
			} else if(!(rpsMatches.charAt(stringIndex) == ',')) {
				return "";
			} else {
				stringIndex++;
			}
			
			whileSafeguard--;
		}
		
		if(aWins > bWins) {
			return "A";
		} else if(bWins > aWins) {
			return "B";
		} else {
			return "DRAW";
		}
	}
	
	private static char whoWon(char playerAThrow, char playerBThrow) {
		if((playerAThrow == 'R' && playerBThrow == 'S')
				|| (playerAThrow == 'P' && playerBThrow == 'R')
				|| (playerAThrow == 'S' && playerBThrow == 'P')) {
			return 'A';
		} else if((playerAThrow == 'R' && playerBThrow == 'P')
				|| (playerAThrow == 'P' && playerBThrow == 'S')
				|| (playerAThrow == 'S' && playerBThrow == 'R')) {
			return 'B';
		} else {
			return 'D';
		}
	}
}
