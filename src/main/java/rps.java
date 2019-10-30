public class rps {
    public static String runMatch(String match) {
        String matchClean = match.replaceAll("\\s", "");
        String[] games = matchClean.split(",");
        int A = 0,B = 0;

        for (String game : games) {
            int[] result = runGame(setupGame(game));
            A += result[0];
            B += result[1];
        }
        if (A > B) {
            return "A";
        } else if (A < B) {
            return "B";
        } else {
            return "DRAW";
        }
    }

    private static int[] runGame(String game) {
        int[] score = {0,0};
        switch(game) {
            case "rp":
            case "sr":
            case "ps":
                score[1]++;
                break;
            case "rs":
            case "pr":
            case "sp":
                score[0]++;
                break;
            case "rr":
            case "pp":
            case "ss":
                break;
            default:
                break;
        }
        return score;
    }

    private static String setupGame(String game) {
        if (game.length() > 2) {
            System.out.println("Game not well formed: '" + game + "'");
            return "";
        }
        else if (game.length() < 2) {
            System.out.println("Game not well formed: '" + game + "'");
            return "";
        } else {
            return game.toLowerCase();
        }
    }

}
