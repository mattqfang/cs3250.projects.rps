
package rps;

public class Game {
	
	
	
	static int playerA = 0;
	static int playerB = 0;
	
	static String playRPS(String game) {
		playerA = 0;
		playerB = 0;
		
		if(game.isEmpty() || game.matches(".*[^RPSrps, ].*")) {
			return "Not a valid RPS game";
		}
		game = game.toUpperCase();
		
		//String g = game.toUpperCase();
		String[] rounds = game.trim().split(",");
		
		for(int i=0; i < rounds.length; i++) {
			String round = rounds[i].trim();
			
			if(round.length() < 2) {
				return "Each round must contain a play from both players";
			}
			
			if(round.length() > 2) {
				return "Each round must be seperated by a ','";
			}
			
			if(round.charAt(0) == 'R') {
				playRock(round.charAt(1));
			}
			
			else if(round.charAt(0) == 'P') {
				playPaper(round.charAt(1));
			}
			
			else if(round.charAt(0) == 'S') {
				playScissors(round.charAt(1));
			}
		}
		
		return winner();
	}
	
	static void playRock(char move) {
		
		if(move == 'R') {
			// draw, no point
		}
		else if(move == 'P') {
			playerB++;
		}
		else if(move == 'S') {
			playerA++;
		}	
	}
	
	static void playPaper(char move) {
		
		if(move == 'R') {
			playerA++;
		}
		else if(move == 'P') {
			// draw, no point
		}
		else if(move == 'S') {
			playerB++;
		}
	}
	
	 static void playScissors(char move) {

		if(move == 'R') {
			playerB++;
		}
		else if(move == 'P') {
			playerA++;
		}
		else if(move == 'S') {
			// draw, no point
		}	
	}
	
	static String winner() {
		String winner;
		if(playerA > playerB) {
			winner = "A";
		}
		else if(playerA < playerB) {
			winner = "B";
		}
		else {
			winner = "DRAW";
		}
		
		return winner;
	}
}
