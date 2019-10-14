package rps;

public class Rock extends Player{
	protected void setWinConditions() {
		this.setName("R");
		this.setLosesTo("P");
		this.setWinsTo("S");
	}
}
