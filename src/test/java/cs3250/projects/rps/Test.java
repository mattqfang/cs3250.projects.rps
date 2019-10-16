package cs3250.projects.rps;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// Test a scenario where A wins
		String test1 = RockPaperScissors.checkWinner("PR, PP, PS, SP");
		if (test1.equals("A"))
			System.out.println("Test 1 Passed!");
		
		// Test a scenario where B wins
		String test2 = RockPaperScissors.checkWinner("RP, SR, PS");
		if (test2.equals("B"))
			System.out.println("Test 2 Passed!");
		
		// Test a scenario where there is a draw.
		String test3 = RockPaperScissors.checkWinner("RR, PP, SS");
		if (test3.equals("Draw"))
			System.out.println("Test 3 Passed!");
	}
}
