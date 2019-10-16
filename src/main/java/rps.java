class RockPaperScissors{
	public static void main(String[] args) {
		;
	}
	public String shoot(String[] match){
		int a = 0;
		int b = 0;
		for(int i =0; i<match.length;i++) {
			if(match[i].length()>2) {
				return"error: only 2 players allowed";
						
			}
			else {
				char aMove= match[i].charAt(0);
				char bMove= match[i].charAt(1);
				if(aMove == 'R' && bMove == 'R') {
					//tie
				}
				if(aMove == 'R' && bMove == 'P') {
					b++;
				}
				if(aMove == 'R' && bMove == 'S') {
					a++;
				}
				if(aMove == 'P' && bMove == 'P') {
					//tie
				}
				if(aMove == 'P' && bMove == 'R') {
					a++;
				}
				if(aMove == 'P' && bMove == 'S') {
					b++;
				}
				if(aMove == 'S' && bMove == 'S') {
					//tie
				}
				if(aMove == 'S' && bMove == 'R') {
					b++;
				}
				if(aMove == 'S' && bMove == 'P') {
					a++;
				}
			}
			
		}
		if(a>b) {
			return "A";
		}
		else if(a<b) {
			return "B";
		}
		else if(a==b) {
			return "DRAW";
		}
		else {
			return"Check the score A:"+ a + "B:" + b +"/n";
		}
		
		
		
	}
}