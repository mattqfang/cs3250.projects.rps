// I, Dallen Baldwin, assert that this source code was either written by myself
// or provided by my instructor. For all intents and purposes, it is original.

package uvu.cs.cs3250.assignments;

// https://uvu.instructure.com/courses/482395/assignments/4432314

// Rock crushes Scissors
// Scissors cut Paper
// Paper envelopes Rock

// input will come in as a larger string, ex. "RP, PP, SP, PS, RR, SS, PS"
// each round is two characters, each round is separated by a ', ' OR ','
// declare the winner after the rounds
// get creative with your test cases: null, strings longer than 2, digits, illegal input

// don't necessarily need a main function
// follow a TDD - Test Driven Development. Keep it simple. Build a minimum viable project.

public class RockPaperScissors {

    public static boolean isValidGame(String game) {
        if (tryNull(game)) {
            return false;
        } 


        for (int i = 0; i < game.length(); i++) {
            char element = game.toLowerCase().charAt(i);
            if(!isValidChar(element)) return false;
        }

        if (!isTwoPlayers(game)) return false;

        return true;
    }
    
    public static String playRPS(String game) {
        if (!isValidGame(game)) {
            return "Sorry. The game is invalid";
        }

        String[] sanitizedGame = game.split(" *, *"); // regex = ' '*,' '*
        int playerA = 0;
        int playerB = 0;
        for (String element : sanitizedGame) {
            char a = element.toLowerCase().charAt(0);
            char b = element.toLowerCase().charAt(1);
            playerA += fight(a,b);
            playerB += fight(b,a);
        }

        String winner;
        if (playerA > playerB) {
            winner = "Player A wins!";
        } else if (playerB > playerA) {
            winner = "Player B wins!";
        } else if (playerA == playerB) {
            winner = "It's a Draw!";
        } else {
            winner = "Error: playRPS didn't return a winner.";
        }

        return winner;
    }

    private static int fight(char a, char b) {
        int result = 0;
        if (a == 'r' && b == 'r') {
            result = 0;
        } else if (a == 'r' && b == 's') {
            result = 1;
        } else if (a == 'r' && b == 'p') {
            result = -1;
        } else if (a == 'p' && b == 'p') {
            result = 0;
        } else if (a == 'p' && b == 'r') {
            result = 1;
        } else if (a == 'p' && b == 's') {
            result = -1;
        } else if (a == 's' && b == 's') {
            result = 0;
        } else if (a == 's' && b == 'p') {
            result = 1;
        } else if (a == 's' && b == 'r') {
            result = -1;
        }
        return result;
    }

    private static boolean tryNull(String input) {
        if (input == null) return true;
        return false;
    }

    private static boolean isTwoPlayers(String input) {
        String[] rounds = input.split(" *, *");
        for (String element : rounds) {
            if (element.length() != 2) return false;
        }
        return true;
    }

    private static boolean isValidChar(char c) {
        switch(c) {
            case 'r': return true;
            case 's': return true;
            case 'p': return true;
            case ',': return true;
            case ' ': return true;
            default: return false;
        }
    }
}