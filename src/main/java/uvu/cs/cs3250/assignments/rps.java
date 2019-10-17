package uvu.cs.cs3250.assignments;

import java.util.ArrayList;
import java.util.regex.*;

public class rps {
	private static final int MATCH_SIZE = 2;
	
	public static String findWinner(String inputString) {
		ArrayList<String> matches = new ArrayList<String>();
		matches = getMatches(inputString);
		String returnString = "";
		
		if (matches.isEmpty()) {
			//System.out.println("Error! Invalid input");
			return null;
		}
		
		else {
			char playerA;
			char playerB;
			int playerAWins = 0;
			int playerBWins = 0;
			
			//System.out.println("The ArrayList is NOT empty");
			//System.out.println(matches.size());
			
			for (int i = 0; i < matches.size(); i++) {
				playerA = matches.get(i).charAt(0);
				playerB = matches.get(i).charAt(1);
				
				if (playerA == 'P') {
					if (playerB == 'R') {
						playerAWins++;
					}
					
					else if (playerB == 'S') {
						playerBWins++;
					}
				}
				
				else if (playerA == 'R') {
					if (playerB == 'S') {
						playerAWins++;
					}
					
					else if (playerB == 'P') {
						playerBWins++;
					}
				}
				
				else {
					if (playerB == 'P') {
						playerAWins++;
					}
					
					else if (playerB == 'R') {
						playerBWins++;
					}
				}
				
				//System.out.println(playerA + " " + playerB);
			}
			
			//System.out.println(playerAWins + " " + playerBWins);
			if (playerAWins > playerBWins) {
				returnString = "A";
			}
			
			else if (playerBWins > playerAWins) {
				returnString = "B";
			}
			
			else {
				returnString = "Draw";
			}
		}
		
		return returnString;
	}
	
	private static ArrayList<String> getMatches(String inputString) {
		ArrayList<String> foundMatches = new ArrayList<String>();
		inputString = inputString.toUpperCase();
	
		String unallowedChars = "[^RPS,\\s]";
		Pattern pattern = Pattern.compile(unallowedChars);
		Matcher patternMatch = pattern.matcher(inputString);
		
		/* If an invalid character was found in the input string,
		   then an empty ArrayList is returned, signifying an invalid string */
		if (patternMatch.find()) {
			return foundMatches;
		}
		
		/* If no invalid characters were found in the input string,
		   then we attempt to extract the pairs of characters representing
		   each match */
		else {
			int beginPos = 0;
			String curStr = inputString.trim();
			String matchStr = "";
			int commaPos = inputString.indexOf(',');
			
			/* This while-loop executes if there is at least one
			   comma in the string, signifying there were at least
			   two matches played */
			while (commaPos != -1) {
 				matchStr = curStr.substring(beginPos, commaPos);
				foundMatches.add(matchStr);
				
				curStr = curStr.substring(commaPos + 1);
				curStr = curStr.trim();
				commaPos = curStr.indexOf(',');
			}
			
			/* This if-statement executes if either no commas were found
			   in the string or it is the last match in the string */
			if (commaPos == -1) {
				curStr = curStr.trim();
				
				if (curStr.length() != MATCH_SIZE) {
					foundMatches.clear();
					return foundMatches;
				}
				foundMatches.add(curStr);
			}
			
			return foundMatches;
		}
	}
}