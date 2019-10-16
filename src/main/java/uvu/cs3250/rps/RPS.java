package uvu.cs3250.rps;

public class RPS {
    private Integer playerA = 0;
    private Integer playerB = 0;
    private Integer invalidRounds = 0;
    private Integer roundsPlayed = 0;

    //This function decides the outcome for provided round
    private void round(String r){
        switch (r){
            case "RS":
            case "PR":
            case "SP":
                playerA += 1;
                break;
            case "RP":
            case "PS":
            case "SR":
                playerB += 1;
                break;
            default:
                break;
        }
        roundsPlayed += 1;
    }

    //Function containing a control block that returns the victor for the match and other match information
    private String result(){
        if (playerA > playerB)
            return "Player A wins";
        else if (playerB > playerA)
            return "Player B wins";
        else
            return "Draw";
    }
    public String match(String args) {
        if (invalidRounds != 0 || roundsPlayed != 0)
            reset();
        String[] input = args.split(",");

        //Read through the input strings and select valid inputs to pass to round()
        for(String el : input) {
            el = el.trim();
            if (el.length() == 2 && el.matches("[rRpPsS]*"))
                round(el.toUpperCase());
            else
                invalidRounds += 1;
        }
        return result();
    }
    private void reset() {
        this.playerA = 0;
        this.playerB = 0;
        this.invalidRounds = 0;
        this.roundsPlayed = 0;
    }
    public Integer getInvalidRounds() {
        return invalidRounds;
    }

    public Integer getRoundsPlayed() {
        return roundsPlayed;
    }
    public static void main(String[] args){
        RPS game = new RPS();
        System.out.println(game.match("RP,  pr  ,  SSR,sR"));
        System.out.println("Total rounds played: " + game.getRoundsPlayed());
        System.out.println("Total invalid rounds: " + game.getInvalidRounds());
        System.out.println(game.match("dda;slkdf;lknzxc;nv"));
        System.out.println("Total rounds played: " + game.getRoundsPlayed());
        System.out.println("Total invalid rounds: " + game.getInvalidRounds());

    }
}
