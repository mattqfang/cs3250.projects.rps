package cs3250.projects.rps;

public class rps {

	static public String rpsWins(String rounds) {
		
		String[] roundArr = rounds.split(",");
		String[] choices = {"0", "0"};
		int aWin = 0, bWin = 0, draw = 0;
		
		for(int i = 0; i < roundArr.length; i++) {
			choices = roundArr[i].trim().split("");
			
			switch(choices[0]) {
				case("R"):
					switch(choices[1]) {
					case("R"):
						draw += 1;
					break;
					case("P"):
						bWin += 1;
					break;
					case("S"):
						aWin += 1;
					break;
					}
				break;
				case("P"):
					switch(choices[1]) {
					case("R"):
						aWin += 1;
					break;
					case("P"):
						draw += 1;
					break;
					case("S"):
						bWin += 1;
					break;
					}
				break;
				case("S"):
					switch(choices[1]) {
					case("R"):
						bWin += 1;
					break;
					case("P"):
						aWin += 1;
					break;
					case("S"):
						draw += 1;
					break;
					}
				break;
			}			
		}
		
		if(aWin > bWin && aWin > draw)
			return "Player A wins!";
		else if(bWin > aWin && bWin > draw)
			return "Player B wins!";
		else
			return "It's a draw";
		
	}

}
