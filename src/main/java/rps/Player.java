package rps;

abstract class Player {
	/*
	 * Variables
	 */
	private String losesTo;
	private String winsTo;
	private String name;
	
	/*
	 * Constructor
	 */
	Player() {
		setWinConditions();
	}

	/*
	 * Abstract methods
	 */
	abstract void setWinConditions();
	
	/*
	 * Getters
	 */
	public String getLosesTo() {
		return losesTo;
	}
	
	public String getWinsTo() {
		return winsTo;
	}
	
	public String getName() {
		return name;
	}
	
	/*
	 * Setters
	 */
	public void setLosesTo(String lose) {
		this.losesTo = lose;
	}
	
	public void setWinsTo(String win) {
		this.winsTo = win;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	/*
	 * Methods
	 */
	public static int compare(Player right, Player left) {
		if (right.getLosesTo() == left.getName())
			return -1;
		if (right.getWinsTo() == left.getName())
			return 1;
		return 0;
	}
}