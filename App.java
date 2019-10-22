package cs3250.RPS;

public class App 
{
    public static boolean main(String arg)
    {
    	System.out.println("Function: input a string as an argument to main that represents a Rock Paper Scissors tournament and this program will output the winner of each match and the total set.");
    	System.out.println("Acceptable formatting looks like this 'rr, RR, PP,  PS, RP,Sr'. Two characters from the set {R,P,S} followed by a comma are expected.");
    	if(arg == null)
    	{
    		System.out.println("Please input a string: ");
    		arg = System.in.toString(); 
    	}
    	System.out.println("String: " + arg);
    	return jajanken(arg);
    }
    
    public static boolean jajanken(String match)
    {
    	int AScore = 0;		// AScore keeps track of the first player's wins.
    	int BScore = 0;		// BScore keeps track of the second player's wins.
    	String round = ""; 	// round is used as a handle to a substring that is compared.
    	match = match.replace(" ", ""); // Removes empty space.
    	if (match.isEmpty())
    	{		
    		System.out.println("An empty string was recieved.");
    		return false; // returns as failing.
    	}
    	for (int i = 0; i < match.length()-2; i = i+3) // +3 allows me to skip a comma.
    	{
    		if (!match.substring(i+2,i+3).contentEquals(",") && !match.substring(i+2,i+3).isEmpty())
    		{
    			System.out.println("String Error with third character");
    			if(!match.substring(i+2,i+3).isEmpty())
    			{
    				System.out.println("[" + match.substring(i+2,i+3)+ "]");
    			}
    			else
    			{
    				System.out.println("[]");
    			}
    			return false;
    		}
    		round = match.substring((i), (i+2));
    		if 		(round.equalsIgnoreCase("RS") || round.equalsIgnoreCase("PR") || round.equalsIgnoreCase("SP")) // Check cases where A wins
    		{
    			System.out.println("A");
    			++AScore;	
    		}
    		else if (round.equalsIgnoreCase("RP") || round.equalsIgnoreCase("PS") ||round.equalsIgnoreCase("SR")) // Check cases where B wins
    		{
    			System.out.println("B");
    			++BScore;
    		}
    		else if (round.equalsIgnoreCase("RR") || round.equalsIgnoreCase("PP") || round.equalsIgnoreCase("SS")) // Check cases of draw.
    		{
    			System.out.println("DRAW");
    		}
    		else
    		{
        		System.out.println("A string was recieved that was not in the desired format. Expecting 'Rr, pR, RP, ss'. Please have two characters (from the set \"r,p,s\") in a row followed by a comma, any number of spaces will be ignored.");
        		return false; // returns as failing.
    		}
    	}
    	if (AScore == BScore)
    	{
    		System.out.println("The set is a total Draw.\n");	
    	}
    	else if (AScore > BScore)
    	{
    		System.out.println("Player A won the set.\n");	
    	}
    	else
    	{
    		System.out.println("Player B won the set.\n");	
    	}
    	return true;
    }
}
