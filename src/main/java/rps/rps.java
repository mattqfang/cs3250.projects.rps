package rps;

public class rps {

	public static void RPSGAME(String string) {
		// TODO Auto-generated method stub
		int A = 0;
		int B = 0;
		if (string.length() <= 0) {
			System.out.println("NULL input");
			return;
		}

		char AGAME;
		char BGAME;
		for (int i = 0; i < string.length() -1;i++) {
			if (string.charAt(i) == ',') {
				//do nothing
			}
			else if (string.charAt(i) != ',' && string.charAt(i+1) != ',' && i+1 < string.length()
					&& string.charAt(i) != ' ') {
				AGAME = string.charAt(i);
				BGAME = string.charAt(i+1);
				if (AGAME != 'P' && AGAME != 'R' && AGAME != 'S') {
					System.out.println("Invalid Input");
					return;
				}
				if (BGAME != 'P' && BGAME != 'R' && BGAME != 'S') {
					System.out.println("Invalid Input");
					return;
				}
				
				
				if (AGAME == BGAME) {
					//draw
					A = A + 1;
					B = B + 1;
				}
				else {
					if (AGAME == 'R') {
						if (BGAME == 'S') {
							A = A + 1;
						}
						if (BGAME == 'P'){
							B = B + 1;
						}
					}
					else if (AGAME == 'S') {
						if (BGAME == 'P') {
							A = A  + 1;
						}
						if (BGAME == 'R'){
							B = B + 1;
						}
					}
					else if (AGAME == 'P') {
						if (BGAME == 'R') {
							A = A + 1;
						}
						if (BGAME == 'S'){
							B = B + 1;
						}
					}
					
				}
			}
		}
		
		if (A > B) {
			System.out.println("Winner is A");
			return;
		}
		
		else if (B > A) {
			System.out.println("Winner is B");
			return;
		}
		
		else{
			System.out.println("DRAW!");
			return;
		}
	}

}