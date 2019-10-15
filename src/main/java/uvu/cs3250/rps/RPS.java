package uvu.cs3250.rps;

import java.util.Arrays;

public class RPS {
    Integer playerA = 0;
    Integer playerB = 0;

    public void round(String r){
        switch (r){
            case "RS":
            case "PR":
            case "SP":
                playerA += 1;
                System.out.println("Player A wins round");
                System.out.println("Score A-" + playerA + " B-" + playerB);
                break;
            case "RP":
            case "PS":
            case "SR":
                playerB += 1;
                System.out.println("Player B wins round");
                System.out.println("Score A-" + playerA + " B-" + playerB);
                break;
            default:
                break;
        }
    }
    public void result(String[] args){
        for (String s : args) {
            round(s);
        }
        if (playerA > playerB)
            System.out.println("Player A wins");
        else if (playerB > playerB)
            System.out.println("Player B wins");
        else
            System.out.println("Draw");
    }
    public void match(String args) {
        String[] input = args.split(",");
        StringBuilder moves = new StringBuilder();
        for(String el : input) {
            moves.append(el);
        }
//        System.out.println(moves.toString());
        System.out.println("Number of moves is valid: " + (moves.length() % 2 == 0));
        result(input);
    }
    public static void main(String[] args){
        RPS game = new RPS();
        game.match("RP,PR,SS,SS");
    }
}
