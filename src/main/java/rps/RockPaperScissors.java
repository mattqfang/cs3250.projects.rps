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
	final private static int 	REQUIRED_STRING_LENGTH = 2,
								INT_ONE = 1,
								INT_NEGATIVE_ONE = -1,
								INT_TWO = 2,
								INT_ZERO = 0;
	
	static Pattern patternValidGameCharacters = Pattern.compile(REGEX_VALID_RPS_CHARS);
	
	public static String getRPSWinner(String str) {
		if(str == null || str.isEmpty()) 
			return EMPTY_STRING;
		
		str = str.replaceAll(REGEX_SPACE, NO_SPACE).toLowerCase();	
		
		String[] resultArray = str.split(COMMA);
		
		if(resultArray.length == INT_ZERO) 
			return NO_GAME_CHARACTERS_IN_STRING;
	
		int result = 0;

		for (String item : resultArray) {
			if(item.length() != REQUIRED_STRING_LENGTH)
				return INVALID_STRING_LENGTH;
		
			if(!patternValidGameCharacters.matcher(item).matches())
				return INVALID_GAME_CHARACTERS;

			String player1 = item.substring(INT_ZERO, INT_ONE);
			String player2 = item.substring(INT_ONE, INT_TWO);

			if(player1.equalsIgnoreCase(player2)) 
				player1 = TIE_GAME;
			
			switch (player1) {
			case ROCK:
				result += (player2.equalsIgnoreCase(SCISSORS))  ? INT_ONE : INT_NEGATIVE_ONE;
				break;
			case PAPER:
				result += (player2.equalsIgnoreCase(ROCK))      ? INT_ONE : INT_NEGATIVE_ONE;
				break;
			case SCISSORS:
				result += (player2.equalsIgnoreCase(PAPER))     ? INT_ONE : INT_NEGATIVE_ONE;
				break;
			case TIE_GAME:
				result += INT_ZERO;
				break;
			default:
				return INVALID_GAME_CHARACTERS;
			}
		}	
		return result > INT_ZERO ? WINNER_PLAYER1 : result < INT_ZERO ? WINNER_PLAYER2 : TIE_GAME;
	}
}
