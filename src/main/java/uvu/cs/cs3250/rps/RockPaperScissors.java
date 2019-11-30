package uvu.cs.cs3250.rps;

public class RockPaperScissors {

	public String formatUserInput(String userString) {					//takes input string and removes special
		String formattedString = userString.replaceAll("[^a-zA-Z]",""); //characters/numbers and makes it upper case
		formattedString = formattedString.toUpperCase();
		
		return formattedString;
	}
	
	public int roundWinCheck(String roundVal) {								//checks for win conditions returns 1 for 1st player win
		if (roundVal.equals("RS") || roundVal.equals("SP") || roundVal.equals("PR")) {	//2 for second player win, and 3 for draw
			return 1;
		}
		else if (roundVal.equals("SR") || roundVal.equals("PS") || roundVal.equals("RP")) {
			return 2;
		}
		else {
			return 3;
		}
	}
	
	public String rpsGame(String userInput) {
		String aWins = "Player A is the Winner!";
		String bWins = "Player B is the Winner!";
		String tie = "Draw";
		String invalidNum = "Invalid game instructions";
		String noGame = "No valid input entered";
		String roundString;
		int roundResult= 0;
		int playerAScore = 0;
		int playerBScore = 0;
		
		String gameString = formatUserInput(userInput);
		
		if (gameString.length() % 2 != 0) {		//if length of string is odd there is an invalid number of RPS moves
			return invalidNum;
		}
		
		for (int i = 0; i < gameString.length(); i++) {  	//runs through pairs of the input string to simulate game, tallies score
			roundString = gameString.substring(i, (i + 2));
			roundResult = roundWinCheck(roundString);
			if (roundResult == 1) {
				playerAScore += 1;
			}
			else if (roundResult == 2) {
				playerBScore += 1;
			}
			i++;
		}
		
		if (playerAScore > playerBScore) {
			return aWins;
		}
		else if (playerAScore < playerBScore) {
			return bWins;
		}
		else if (playerAScore == 0 && playerBScore == 0) {
			return noGame;
		}
		else {
			return tie;
		}
	}

}
