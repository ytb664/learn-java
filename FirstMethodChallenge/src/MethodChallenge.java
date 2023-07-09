public class MethodChallenge {

    public static void main(String[] args) {

        String player = "first";
        int score = calculateHighScorePosition(1500);
        displayHighScorePosition(player, score);

        player = "second";
        score = calculateHighScorePosition(1000);
        displayHighScorePosition(player, score);

        player = "third";
        score = calculateHighScorePosition(500);
        displayHighScorePosition(player, score);

        player = "fourth";
        score = calculateHighScorePosition(100);
        displayHighScorePosition(player, score);

        player = "fifth";
        score = calculateHighScorePosition(25);
        displayHighScorePosition(player, score);

    }

    public static void displayHighScorePosition(String player, int position) {
        System.out.println(player + " managed to get into position "
                + position + " on the high score list");
    }

    public static int calculateHighScorePosition(int score) {

        int position = 0;
        if(score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position =  2;
        } else if (score >= 100) {
            position = 3;
        } else {
            position = 4;
        }

        return position;

    }
}
