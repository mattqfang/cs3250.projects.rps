package rps;

class Player {
	/*
	 * Variables
	 */
	private String losesTo;
	private String winsTo;
	private String name;
	
	/*
	 * Constructor
	 */
	// Constructor is private because we want to control how Players are created in the factory function
	private Player(String name, String wins, String loses) {
		this.name = name;
		this.winsTo = wins;
		this.losesTo = loses;
	}

	public String getLosesTo() {
		return losesTo;
	}
	
	public String getWinsTo() {
		return winsTo;
	}
	
	public String getName() {
		return name;
	}

	public static int compare(Player right, Player left) {
		if (right.getLosesTo() == left.getName())
			return -1;
		if (right.getWinsTo() == left.getName())
			return 1;
		return 0;
	}
	
	public static Player playerFactory(char input) {
		input = Character.toUpperCase(input);

		if (input == 'P')
			// Return a Paper player
			return new Player("P", "R", "S");
		if (input == 'R')
			// Return a Rock player
			return new Player("R", "S", "P");
		if (input == 'S')
			// Return a Scissors player
			return new Player("S", "P", "R");
		
		return null;
	}
}