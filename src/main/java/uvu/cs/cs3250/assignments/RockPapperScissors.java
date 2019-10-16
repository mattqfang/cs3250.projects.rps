package uvu.cs.cs3250.assignments;

public class RockPapperScissors{
	public static String playGame(String played) {
		String player1 = "A";
		String player2 = "B";
		String draw = "DRAW";
		String error = "ERROR";
		if(played == null || played == "") {
			return error;
		}
		played = played.replaceAll("\\W", "");
		played = played.toUpperCase();
		int rounds = played.length();
		if(rounds%2 == 1) {
			return error;
		}
		char A, B;
		char rock, paper, scissors;
		int playerA = 0;
		int playerB = 0;
		int i = 0;
		rock = 'R'; 
		paper = 'P';
		scissors = 'S';
		A = '?';
		B = '?';
		do{
			if(Character.isLetter(A) && Character.isLetter(B)) {
				if(A != B) {
					if(A == rock) {
						if(B == paper) {
							playerB += 1;
						}
						else if(B == scissors) {
							playerA += 1;
						}
					}
					else if(A == paper) {
						if(B == rock) {
							playerA += 1;
						}
						else if(B == scissors) {
							playerB += 1;
						}
					}
					else if(A == scissors) {
						if(B == rock) {
							playerB += 1;
						}
						else if(B == paper) {
							playerA += 1;
						}
					}
				}		
				A = '?';
				B = '?';
			}
			if(i < 6) {
				char q = played.charAt(i);
				if(q == 'P' || q == 'R' || q == 'S') {
					if(Character.isLetter(q) && !Character.isLetter(A)) {
						A = played.charAt(i);
						i += 1;
					}
					else if(Character.isLetter(q) && !Character.isLetter(B)){
						B = played.charAt(i);
						i += 1;
					}
				}else {
					return error;
				}
			}
			else {
				i += 1;
			}
		}while(rounds >= i);
		if (playerA == playerB) {
			return draw;
		}
		else if(playerA >= playerB) {
			return player1;
		}
		else if(playerA <= playerB) {
			return player2;
		}
		return error;
	}
}
		
