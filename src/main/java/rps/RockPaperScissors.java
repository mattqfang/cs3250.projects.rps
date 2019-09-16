package rps;

import java.util.regex.Pattern;

public class RockPaperScissors {
	final private static String ROCK = "r",
								PAPER = "p",
								SCISSORS = "s",
								EMPTY_STRING = "String is empty",
								INVALID_STRING_LENGTH = "String doesn't meet length requirements",
								STRING_MISSING_DELIMITER = "String must be delimited by commas",
								INVALID_GAME_CHARACTERS = "Invalid r, p, s characters",
								WINNER_PLAYER1 = "A",
								WINNER_PLAYER2 = "B",
								TIE_GAME = "Tie",
								REGEX_VALID_STRING = "([rps]{2})(,[rps]{2}){3}",
								REGEX_SPACE = "\\s",
								NO_SPACE = "",
								COMMA = ",";
	final private static int 	REQUIRED_STRING_LENGTH = 11;
	
	static Pattern patternValidGameString = Pattern.compile(REGEX_VALID_STRING);

	public static String getRPSWinner(String str) {
		if(str == null || str.isEmpty()) 
			return EMPTY_STRING;
		
		if(!str.contains(COMMA)) 
			return STRING_MISSING_DELIMITER;
		
		str = str.replaceAll(REGEX_SPACE, NO_SPACE).toLowerCase();
		
		if(str.length() != REQUIRED_STRING_LENGTH) 
			return INVALID_STRING_LENGTH;
		
		if(!patternValidGameString.matcher(str).matches())
			return INVALID_GAME_CHARACTERS;
		
		String[] resultArray = str.split(COMMA);
		
		int result = 0;

		for (String item : resultArray)
			result += comparePlayerSelections(item.trim());
			
		return result > 0 ? WINNER_PLAYER1 : result < 0 ? WINNER_PLAYER2 : TIE_GAME;
	}

	private static int comparePlayerSelections(String selection) {
		String player1 = selection.substring(0, 1);
		String player2 = selection.substring(1, 2);

		if(player1.equalsIgnoreCase(player2)) 
			player1 = TIE_GAME;
		
		switch (player1) {
		case ROCK:
			return (player2.equalsIgnoreCase(SCISSORS)) ? 1 : -1;
		case PAPER:
			return (player2.equalsIgnoreCase(ROCK)) ? 1 : -1;
		case SCISSORS:
			return (player2.equalsIgnoreCase(PAPER)) ? 1 : -1;
		default:
			return 0;
		}
	}
}
