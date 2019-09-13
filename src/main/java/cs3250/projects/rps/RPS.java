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
				switch(moves[i].charAt(0)) {
				case 'R':
					switch(moves[i].charAt(1)) {
					case 'R':
						//Draw
						break;
					case 'P':
						bWins++;
						break;
					case 'S':
						aWins++;
						break;
					default:
						return "String must only contain letters R, P, and S";
					}
					break;
				case 'P':
					switch(moves[i].charAt(1)) {
					case 'R':
						aWins++;
						break;
					case 'P':
						//Draw
						break;
					case 'S':
						bWins++;
						break;
					default:
						return "String must only contain letters R, P, and S";
					}
					break;
				case 'S':
					switch(moves[i].charAt(1)) {
					case 'R':
						bWins++;
						break;
					case 'P':
						aWins++;
						break;
					case 'S':
						//Draw
						break;
					default:
						return "String must only contain letters R, P, and S";
					}
					break;
				default:
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
