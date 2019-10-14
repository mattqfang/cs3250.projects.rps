package rps;

public class Game {
	public static String playGame(String input) throws InvalidInput {
		if (input == null)
			throw new InvalidInput("Input is null");
		
		int p1Score = 0;
		int p2Score = 0;
		int comparison;
		Player p1;
		Player p2;
		String[] playerInput = input.toUpperCase().trim().split(",");
		
		if (playerInput.length == 0) {
			throw new InvalidInput("No player input available.");
		}

		for (int i = 0; i < playerInput.length; i++) {
			if (playerInput[i].length() != 2)
				throw new InvalidInput();
			
			// Create players
			p1 = Game.createPlayer(playerInput[i].charAt(0));
			p2 = Game.createPlayer(playerInput[i].charAt(1));
			
			// Get score
			comparison = Player.compare(p1, p2);
			if (comparison == 1)
				p1Score++;
			if (comparison == -1)
				p2Score++;
		}

		// Return the result of who won.
		if (p1Score > p2Score)
			return "A";
		if (p1Score < p2Score)
			return "B";
		return "DRAW";
	}
	
	private static Player createPlayer (char input) throws InvalidInput {
		Player player;
		
		if (input == 'P')
			player = new Paper();
		else if (input == 'S')
			player = new Scissors();
		else if (input == 'R')
			player = new Rock();
		else
			throw new InvalidInput("Player 1 input isn't R, P, or S");
		
		return player;
	}
}
