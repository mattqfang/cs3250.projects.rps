package cs3250.projects.rps;

public class RPS {
	public static String rpsWinner(String playerMoves) {
		if(playerMoves == null) {
			return "String is null";
		}
		else if(playerMoves == "") {
			return "String is empty";
		}
		else {
			String[] moves = playerMoves.toUpperCase().split(",");
			int aWins = 0;
			int bWins = 0;
			for(int i = 0; i < moves.length; i++) {
				moves[i] = moves[i].trim();
				if(moves[i].length() != 2) {
					return "String must contain 2 letters (RPS) seperated by commas";
				}
				//A Wins Conditions
				else if((moves[i].charAt(0) == 'R' && moves[i].charAt(1) == 'S') || (moves[i].charAt(0) == 'P' && moves[i].charAt(1) == 'R') || (moves[i].charAt(0) == 'S' && moves[i].charAt(1) == 'P')) {
					aWins++;
				}
				//B Wins Conditions
				else if((moves[i].charAt(0) == 'S' && moves[i].charAt(1) == 'R') || (moves[i].charAt(0) == 'R' && moves[i].charAt(1) == 'P') || (moves[i].charAt(0) == 'P' && moves[i].charAt(1) == 'S')) {
					bWins++;
				}
				//Draw Cases
				else if((moves[i].charAt(0) == 'R' && moves[i].charAt(1) == 'R') || (moves[i].charAt(0) == 'P' && moves[i].charAt(1) == 'P') || (moves[i].charAt(0) == 'S' && moves[i].charAt(1) == 'S')) {
					//Draw Do Nothing
				}
				//Non RPS character
				else {
					return "String must only contain letters R, P, and S";
				}
				
			}
			if(aWins == bWins) {
				return "Draw";
			}
			else if(aWins > bWins) {
				return "Player A Wins";
			}
			else {
				return "Player B Wins";
			}
		}
	}
}
