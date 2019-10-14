package uvu.cs.cs3250.assignments;

public class RPS 
{
	public static String CheckWinner(String _game)
	{
		if (_game == null)
		{
			return "INVALID INPUT";
		}
		int winner = 0;
		String[] rounds = _game.split(",");
		for (String round : rounds)
		{
			if(round.trim().equals("RP"))
			{
				winner -= 1;
			}
			else if(round.trim().equals("PR"))
			{
				winner += 1;
			}
			else if(round.trim().equals("RS"))
			{
				winner += 1;
			}
			else if(round.trim().equals("SR"))
			{
				winner -= 1;
			}
			else if(round.trim().equals("SP"))
			{
				winner += 1;
			}
			else if(round.trim().equals("PS"))
			{
				winner -= 1;
			}
			else if(round.trim().equals("PP") || round.trim().equals("SS") || round.trim().equals("RR"))
			{
				//Does nothing, but prevents these valid rounds from throwing the error
			}
			else
			{
				return "INVALID INPUT";
			}
		}
		if (winner > 0)
			return "A";
		else if (winner < 0)
			return "B";
		return "DRAW";
	}
}
