class RockPaperScissors{
	public static void main(String[] args) {
		;
	}
	public String declareWinner(String input){
		//Declare variables. Include a win count for both A and B.
		int aWins = 0;
		int bWins= 0;
		String winner = "";
		int index = 0;
		int totalCount = 0;
		int error = 0;
		
		//Count the number of games played and parse accordingly.
		String[] parsedString = input.split(",");
		totalCount = parsedString.length;
		
		index = 0;
		//Loop, parsing the first two characters each time. If it is not a R,P, or S, return an error.
		while (index < totalCount && error == 0)
		{
			//Cut out all spaces.
			String game = parsedString[index];
			input.trim();
			
			//If something illegal happened, break the loop by setting the count to max.
			
			//If there are more or less than 2 letters before the commas, return an error.
			int length = game.length();
			if (length != 2)
			{
				
				winner = "Must have 2 players only.";
				index = totalCount;
				error = 1;
			}
			
			//check the moves.
			if (error == 0)
			{
			char aMove = game.charAt(0);
			char bMove = game.charAt(1);
		
			//If an illegal character was found, send an error.
			if (aMove != 'P' && aMove !='p' && aMove != 'R' && aMove != 'r' && aMove !='S' && aMove !='s' && bMove != 'P' && bMove !='p' && bMove != 'R' && bMove != 'r' && bMove !='S' && bMove !='s')
			{
				winner = "Illegal characters. Please enter only P, R, or S";
				index = totalCount;
				error = 1;
			}
			
			//Check if A chose P
			else if (aMove == 'P' || aMove == 'p')
			{
				if (bMove == 'P' || bMove == 'p')
				{
					aWins++;
					bWins++;
				}
				else if (bMove == 'R' || bMove == 'r')
				{
					aWins++;
				}
				else if (bMove == 'S' || bMove == 's')
				{
					bWins++;
				}
			}			
			
			//Check if A chose R
			else if (aMove == 'R' || aMove == 'R')
			{
				if (bMove == 'P' || bMove == 'p')
				{
					bWins++;
				}
				else if (bMove == 'R' || bMove == 'r')
				{
					aWins++;
					bWins++;
				}
				else if (bMove == 'S' || bMove == 's')
				{
					aWins++;
				}
			}
			
			//Check if A chose S
			else if (aMove == 'S' || aMove == 's')
			{
				if (bMove == 'P' || bMove == 'p')
				{
					aWins++;
				}
				else if (bMove == 'R' || bMove == 'r')
				{
					bWins++;
				}
				else if (bMove == 'S' || bMove == 's')
				{
					bWins++;
					aWins++;
				}
			}
			}
			index++;
		}
		
		//Declare the winner
		if (error == 0)
		{
			if (aWins > bWins)
			{
				winner = "A";
			}
			
			if (aWins == bWins)
			{
				winner = "DRAW";
			}
			
			if (aWins < bWins)
			{
				winner = "B";
			}
		}

		
		return winner;
	}
}