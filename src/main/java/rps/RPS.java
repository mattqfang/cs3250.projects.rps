package rps;

import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class RPS {

    public static void main(String[] args) {
        int playerCount = 0;
        System.out.println("Welcome to Rock Paper Scissors!");
        do {
            playerCount = startGame();
            if (playerCount > 2)
                System.out.println("I can only have up to 2 players! Try Again!");
            if (playerCount == 2) {
                System.out.println("Multiplayer!");
                multiplayer();
            }
            if (playerCount == 1)
                singlePlayer();
        } while (isNotZero(playerCount));

    }

    private static boolean isNotZero(int playerCount){
        if(playerCount == 0){
            System.out.println("Thanks for Playing! Goodbye!" );
            return false;
        }  else
            return true;
    }

    private static int startGame() {
        System.out.println("How many users are playing? (0 will exit the game):");
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }

    public static String singlePlayer() {
        System.out.println("Single Player! You're playing against a computer!");
        System.out.println("Choose either Rock('r'), Paper('p') or Scissors('s') then the computer will choose: ");
        Scanner sc = new Scanner(System.in);
        String userChoice = sc.next();

        if ((userChoice.equals("r") || userChoice.equals("p")) || userChoice.equals("s")) {
            Map<String, Integer> englishToComputer = new HashMap<>();
            englishToComputer.put("r", 0);
            englishToComputer.put("p", 1);
            englishToComputer.put("s", 2);

            Random rand = new Random();
            int computerChoice = rand.nextInt(2);

            Map<Integer,String> computerToEnglish = new HashMap<>();
            computerToEnglish.put(0, "Rock");
            computerToEnglish.put(1, "Paper");
            computerToEnglish.put(2, "Scissor");

            System.out.println("The computer chose " + computerToEnglish.get(computerChoice) + ".");
            System.out.println(decisionMessageSingle(englishToComputer.get(userChoice), computerChoice));

            return "success";
        }
        else {
            System.out.println("You gave a bad input :(\n");
            return "failed - wrong input by player";
        }

    }

    public static String multiplayer() {

        System.out.println("First Player! It is your turn!");
        System.out.println("Choose either Rock('r'), Paper('p') or Scissors('s'): ");
        Scanner sc = new Scanner(System.in);
        String userChoice = sc.next();

        if ((userChoice.equals("r") || userChoice.equals("p")) || userChoice.equals("s")) {
            System.out.print("\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n");
            System.out.println("Second Player! Don't cheat! It is your turn!");
            System.out.println("Choose either Rock('r'), Paper('p') or Scissors('s'): ");
            Scanner sc2 = new Scanner(System.in);
            String user2Choice = sc2.next();

            if ((user2Choice.equals("r") || user2Choice.equals("p")) || user2Choice.equals("s")) {
                Map<String, Integer> englishToComputer = new HashMap<>();
                englishToComputer.put("r", 0);
                englishToComputer.put("p", 1);
                englishToComputer.put("s", 2);

                System.out.println(decisionMessageMultiplayer(englishToComputer.get(userChoice), englishToComputer.get(user2Choice)));

                return "success";
            }
            else {
                System.out.println("Player 2 gave me a bad input :( \n");
                return "failed - wrong input by player 2";
            }
        }

        System.out.println("Player 1 gave me a bad input :( \n");
        return "failed - wrong input by player 1";

    }

    public static String decisionMessageSingle(int user, int computer) {
        String str = "";
        switch (computer) {
            case 0 :
                if (user == 1){
                    str = "Paper beats rock! You won!";
                }
                else if (user == 2)
                    str = "Rock beats scissors! You lost! :(";
                else
                    str = "It's a tie! Try again!";
                break;
            case 1 :
                if (user == 0){
                    str =  "Paper beats rock! You lost! :(";
                }
                else if (user == 2)
                    str = "Scissor beats paper! You won!";
                else
                    str = "It's a tie! Try again!";
                break;
            case 2 :
                if (user == 1){
                    str = "Scissor beats paper! You lost! :(";
                }
                else if (user == 0)
                    str = "Rock beats scissors! You won!";
                else
                    str = "It's a tie! Try again!";
                break;
        }

        return str;
    }

    public static String decisionMessageMultiplayer(int user1, int user2) {
        String str = "";
        switch (user2) {
            case 0 :
                if (user1 == 1){
                    str = "Paper beats rock! Player 1 wins!";
                }
                else if (user1 == 2)
                    str = "Rock beats scissors! Player 2 wins!";
                else
                    str = "It's a tie! Try again!";
                break;
            case 1 :
                if (user1 == 0){
                    str =  "Paper beats rock! Player 2 wins!";
                }
                else if (user1 == 2)
                    str = "Scissor beats paper! Player 1 wins!";
                else
                    str = "It's a tie! Try again!";
                break;
            case 2 :
                if (user1 == 1){
                    str = "Scissor beats paper! Player 2 wins!";
                }
                else if (user1 == 0)
                    str = "Rock beats scissors! Player 1 wins!";
                else
                    str = "It's a tie! Try again!";
                break;
        }

        return str;
    }
}
