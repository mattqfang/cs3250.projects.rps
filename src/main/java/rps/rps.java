package rps;

public class rps {

	public static void RPSGAME(String string) {
		// TODO Auto-generated method stub
		int A = 0;
		int B = 0;
		
		char AGAME;
		char BGAME;
		if (string.length() <= 0) {
			System.out.println("Null input");
			return;
		}
		
		for (int i = 0; i < string.length();i++) {
			if (string.charAt(i) == ',') {
				//do nothing
			}
			else if (string.charAt(i + 1) != ',' && i+1 < string.length()) {
				AGAME = string.charAt(i);
				BGAME = string.charAt(i+1);
				/*else if (BGAME != 'R' && BGAME != 'P' && BGAME != 'S') {
					System.out.println("Invalid Input");
					return;
				}*/
				//System.out.println(AGAME);
				//System.out.println(BGAME);
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
						else {
							B = B + 1;
						}
					}
					else if (AGAME == 'S') {
						if (BGAME == 'P') {
							A = A  + 1;
						}
						else {
							B = B + 1;
						}
					}
					else if (AGAME == 'P') {
						if (BGAME == 'R') {
							A = A + 1;
						}
						else {
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
		else {
			System.out.println("DRAW!");
			return;
		}
	}

}
