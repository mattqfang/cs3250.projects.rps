class RockPaperScissors{
	public static void main(String[] args) {
		;
	}
	public String play(String[] games){
		int aWins = 0;
		int bWins = 0;
		
		for(int i = 0; i < games.length; i++) {
			if(games[i].length() > 2) {
				return "Invalid game!";	
			}
			else {
				switch(games[i]) {
				case "RR": {
					break;
				}
				case "RP": {
					bWins++;
					break;
				}
				case "RS": {
					aWins++;
					break;
				}
				case "PR": {
					aWins++;
					break;
				}
				case "PP": {
					break;
				}
				case "PS": {
					bWins++;
					break;
				}
				case "SR": {
					bWins++;
					break;
				}
				case "SP": {
					aWins++;
					break;
				}
				case "SS": {
					break;
				}
				}
			}
		}
		
		if (aWins == bWins) {
			return "DRAW";
		}
		
		return aWins > bWins ? "A" : "B";
	}
}