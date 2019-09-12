package rps;

public class Game {
	public static String playGame(String input) {
		String[] foo = input.toUpperCase().trim().split(",");
		int p1Score = 0;
		int p2Score = 0;
		char p1;
		char p2;
		
		for (int i = 0; i < foo.length; i++) {
			if (foo[i].length() != 2) {
				// TODO: Raise exception
			}
			p1 = foo[i].charAt(0);
			p2 = foo[i].charAt(1);
			
			if (p1 == 'P') {
				if (p2 == 'R')
					p1Score++;
				else if (p2 == 'S')
					p2Score++;
			}
			else if (p1 == 'R') {
				if (p2 == 'P')
					p2Score++;
				else if (p2 == 'S')
					p1Score++;
			}
			else if (p1 == 'S'){
				if (p2 == 'P')
					p1Score++;
				else if (p2 == 'R')
					p2Score++;
			}
			else {
				// TODO: Raise exception
			}
		}

		if (p1Score > p2Score) {
			return "A";
		}
		if (p1Score < p2Score) {
			return "B";
		}
		return "DRAW";
	}
}
