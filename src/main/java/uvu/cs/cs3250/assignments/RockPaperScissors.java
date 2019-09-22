package uvu.cs.cs3250.assignments;

public class RockPaperScissors {
	
	public static String determineWinner(String rpsMatches) {
		if(rpsMatches == null) {
			return "";
		}
		rpsMatches.trim();
		if(rpsMatches.length() < 2
				|| rpsMatches.charAt(0) == ' ') {
			return "";
		}
		
		
		
		return "hi";
	}

}
