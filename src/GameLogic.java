
public class GameLogic {

	public GameLogic() {	}
	
	public String getWinner(String sss) {
		return InputValidator(sss);
	}
	
	private String DetermineWinner(char first, char second) {
		
		if(first == second)
			return "Draw! Play again.";
		
		if(first == 'R') {
			if(second =='P')
				return "B is the winner!";
			if(second == 'S')
				return "A is the winner!";
		}
		
		if(first == 'P') {
			if(second =='R')
				return "A is the winner!";
			if(second == 'S')
				return "B is the winner!";
		}
		
		else//first == scissors
		{
			if(second == 'R')
				return "B is the winner!";
			if(second == 'P')
				return "A is the winner!";
		}
		
		return null;
		
	}
	 
	private String InputValidator(String aB) {
		String temp1a = aB.trim();
		char a1 = temp1a.charAt(0);
		char a2 = temp1a.charAt(temp1a.length()-1);
		
		return DetermineWinner(a1,a2);
	}

}
