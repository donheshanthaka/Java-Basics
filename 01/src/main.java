public class Main {
    public static void main(String[] args){
        int position = calculateHighScore(1500);
        displayHighScorePosition("Mike", position);

        position = calculateHighScore(900);
        displayHighScorePosition("Tom", position);

        position = calculateHighScore(400);
        displayHighScorePosition("Bob", position);

        position = calculateHighScore(50);
        displayHighScorePosition("Jade", position);
    }

    public static int calculateHighScore(int playerScore){
        int highScorePosition = 4;
        if (playerScore >= 1000){
            highScorePosition = 1;
        } else if (playerScore >= 500){
            highScorePosition = 2;
        } else if (playerScore >= 100){
            highScorePosition = 3;
        }

        return highScorePosition;
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score table" );
    }
}
