package cs3250.projects.rps;

import java.util.Scanner;

public class RockPaperScissors {

	public static String checkWinner(String input) {
		String[] games = input.split(",");
		int aWins = 0;
		int bWins = 0;
		for (String s : games) {
			s = s.trim();
			// If A has R and B has S, A wins
			if (s.substring(0, 1).equalsIgnoreCase("R") && 
					s.substring(1, 2).equalsIgnoreCase("S")) {
				++aWins;
			}
			// If A has S and B has R, B wins
			if (s.substring(0, 1).equalsIgnoreCase("S") && 
					s.substring(1, 2).equalsIgnoreCase("R")) {
				++bWins;
			}
			
			// If A has S and B has P, A wins
			if (s.substring(0, 1).equalsIgnoreCase("S") && 
					s.substring(1, 2).equalsIgnoreCase("P")) {
				++aWins;
			}
			
			// If A has P and B has S, B wins
			if (s.substring(0, 1).equalsIgnoreCase("P") && 
					s.substring(1, 2).equalsIgnoreCase("S")) {
				++bWins;
			}
			
			// If A has P and B has R, A wins
			if (s.substring(0, 1).equalsIgnoreCase("P") && 
					s.substring(1, 2).equalsIgnoreCase("R")) {
				++aWins;
			}
			
			// If A has R and B has P, B wins
			if (s.substring(0, 1).equalsIgnoreCase("R") && 
					s.substring(1, 2).equalsIgnoreCase("P")) {
				++bWins;
			}
		}
		
		if (aWins > bWins) {
			return "A";
		}
		
		else if (aWins < bWins) {
			return "B";
		}
		
		else {
			return "Draw";
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useDelimiter("\\s*,\\s*");;
		System.out.println("Rock, Paper, Scissors");
		System.out.println("Please input the moves of each game, with Player A's move "
				+ "coming first and Player B's\nmoves second. Games are separated by "
				+ "commas.\nFor example, 3 games would look like this: RP, SS, PR");
		System.out.println("Winner: " + checkWinner(input.nextLine()) + "!");
	}
}