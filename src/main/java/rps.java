import java.io.IOException;
import java.util.Scanner;

class RockPaperScissors{
	public static void main(String[] args) {
		RockPaperScissors rsp = new RockPaperScissors();
		String data[];
		data = new String[3];
		System.out.println("This is a game of rock paper scissors. \nEnter R for rock P for paper and S for scissors");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System. in);
		for(int i = 0; i < 3; i++) {
			int p1 = 1;
			int p2 = 1;
			String inputString = "";
			
			while(p1 == 1) {
				System.out.println("Player One enter a move:");
				String temp = scanner.nextLine();
				temp.trim();
				System.out.println(temp);
				if(temp.equals("R") || temp.equals("P") || temp.equals("S")) {
					inputString = temp;
					p1 = -1;
				}
				else {
					System.out.println("Invalid input please enter R for rock P for paper or S for scissors");
					}
				}
			while(p2 == 1) {
				System.out.println("Player Two enter a move:");  
				String temp = scanner.nextLine();
				temp.trim();
				if(temp.equals("R") || temp.equals("P") || temp.equals("S")) {
					inputString += temp;
					p2 = -1;
				}
				else {
					System.out.println("Invalid input please enter R for rock P for paper or S for scissors");
					}
				}
		    
			//inputString += scanner.nextLine();
			inputString.trim();
			data[i] = inputString;
			System.out.println(inputString);
		}
		String result = rsp.shoot(data);
		System.out.println(result);
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