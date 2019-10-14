package rps;

public class Paper extends Player{
	protected void setWinConditions() {
		this.setName("P");
		this.setLosesTo("S");
		this.setWinsTo("R");
	}
}
