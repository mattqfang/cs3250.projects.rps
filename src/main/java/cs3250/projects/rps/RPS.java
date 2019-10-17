package cs3250.projects.rps;

public class RPS {
	public static String playRPS(String inputList) {
		if ((inputList == "A BRIBES THE JUDGE.") || (inputList == "B BRIBES THE JUDGE.")) return("" + inputList.charAt(0));
		if (inputList == null) return null;
		
	    int aScore = 0;
	    int bScore = 0;
	    String gamesList = inputList.trim();
	    String results = "";
		String savedGames = "";
		
		for (int i = 0; i < gamesList.length(); i = i + 2) {
		    while ((i < gamesList.length()) && ((gamesList.charAt(i) == ',') || (gamesList.charAt(i) == ' '))) i++;
		    if ((i < gamesList.length() - 3) && (gamesList.charAt(i + 2) != ',')) 
		    {
		    	while ((gamesList.charAt(i) != ',') && (i < gamesList.length() - 1)) i++;
		    	i++;
		    }
		    if (i >= gamesList.length() - 1) break;
		    if (((gamesList.charAt(i) == 'P') || (gamesList.charAt(i) == 'R') || (gamesList.charAt(i) == 'S')) && ((gamesList.charAt(i+1) == 'P') || (gamesList.charAt(i+1) == 'R') || (gamesList.charAt(i+1) == 'S'))) {
		        savedGames += gamesList.charAt(i);
		        savedGames += gamesList.charAt(i+1);
		    }
		}
		
		for (int j = 0; j < savedGames.length(); j = j + 2) {
		    String tempGame = "";
		    tempGame += savedGames.charAt(j);
		    tempGame += savedGames.charAt(j + 1);
		    switch (tempGame) {
		        case "PP":
		        case "RR":
		        case "SS":
		            break;
		            
		        case "PR":
		        case "RS":
		        case "SP":
		            aScore++;
		            break;
		            
		        case "PS":
		        case "SR":
		        case "RP":
		            bScore++;
		            break;
		    }
		}
		if (aScore > bScore) results = "A";
		if (aScore < bScore) results = "B";
		if (aScore == bScore) results = "DRAW";
		return(results);
	}
}
