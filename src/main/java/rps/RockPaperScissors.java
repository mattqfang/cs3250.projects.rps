package rps;

import java.util.regex.Pattern;

public class RockPaperScissors {
	final private static String ROCK = "r",
								PAPER = "p",
								SCISSORS = "s",
								EMPTY_STRING = "String is empty",
								INVALID_STRING_LENGTH = "String doesn't meet length requirements",
								INVALID_GAME_CHARACTERS = "Invalid r, p, s characters",
								NO_GAME_CHARACTERS_IN_STRING = "No r, p, s characters found in string",
								WINNER_PLAYER1 = "A",
								WINNER_PLAYER2 = "B",
								TIE_GAME = "Tie",
								REGEX_VALID_RPS_CHARS = "([rps]{2})",
								REGEX_SPACE = "\\s",
								NO_SPACE = "",
								COMMA = ",";
	final private static int 	REQUIRED_STRING_LENGTH = 2;
	
	static Pattern patternValidGameCharacters = Pattern.compile(REGEX_VALID_RPS_CHARS);
	
	public static String getRPSWinner(String str) {
		if(str == null || str.isEmpty()) 
			return EMPTY_STRING;
		
		str = str.replaceAll(REGEX_SPACE, NO_SPACE).toLowerCase();	
		
		String[] resultArray = str.split(COMMA);
		
		if(resultArray.length == 0) 
			return NO_GAME_CHARACTERS_IN_STRING;
	
		int result = 0;

		for (String item : resultArray) {
			if(item.length() != REQUIRED_STRING_LENGTH)
				return INVALID_STRING_LENGTH;
		
			if(!patternValidGameCharacters.matcher(item).matches())
				return INVALID_GAME_CHARACTERS;
			
			if((comparePlayerSelections(item.trim()) == Integer.MIN_VALUE))
				return INVALID_GAME_CHARACTERS;
			
			result += comparePlayerSelections(item.trim()) ;
		}	
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
		case TIE_GAME:
			return 0;
		default:
			return Integer.MIN_VALUE;
		}
	}
}
