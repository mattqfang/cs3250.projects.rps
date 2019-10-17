package uvu.cs.cs3250.rps;

public class RockPaperScissors 
{
	public static String Play(String game)
	{
		// Check for null
		if (game == null)
			return "Invalid Input";
		
		// Split up the input string
		String[] rounds = game.split(",");
		
		// Check if the wrong delimiter was used
		if (rounds.length == 1 && rounds[0].length() > 2) { return "Invalid Input"; }
		
		// Create the score variables
		int scoreA = 0;
		int scoreB = 0;
		
		// Loop through the array
		for (int i = 0; i < rounds.length; i++)
		{
			// Test what the input is
			if (rounds[i].trim().equalsIgnoreCase("rp")) { scoreB++; } // Paper beats rock, B wins
			else if (rounds[i].trim().equalsIgnoreCase("pr")) { scoreA++; } // Paper beats rock, B wins
			else if (rounds[i].trim().equalsIgnoreCase("ps")) { scoreB++; } // Scissors beats paper, B wins
			else if (rounds[i].trim().equalsIgnoreCase("sp")) { scoreA++; } // Scissors beats paper, A wins
			else if (rounds[i].trim().equalsIgnoreCase("rs")) { scoreA++; } // Rock beats scissors, A wins
			else if (rounds[i].trim().equalsIgnoreCase("sr")) { scoreB++; } // Rock beats scissors, B wins
			else if (rounds[i].trim().equalsIgnoreCase("rr")) {} // Same chosen, Draw
			else if (rounds[i].trim().equalsIgnoreCase("pp")) {} // Same chosen, Draw
			else if (rounds[i].trim().equalsIgnoreCase("ss")) {} // Same chosen, Draw
			else { System.out.println("Incorrect Format for round " + i); } // Anything else is incorrect input
		}
		
		if (scoreA > scoreB) { return "A"; }
		else if (scoreA < scoreB) { return "B"; }
		else { return "DRAW"; }
	}
}
