package rps;

public class Scissors extends Player{
	protected void setWinConditions() {
		this.setName("S");
		this.setLosesTo("R");
		this.setWinsTo("P");
	}
}
