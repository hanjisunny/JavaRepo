package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int player1Position = calculateHighScorePosition(1500);
        int player2Position = calculateHighScorePosition(900);
        int player3Position = calculateHighScorePosition(400);
        int player4Position = calculateHighScorePosition(50);

        displayHighScorePosition("player 1", player1Position);
        displayHighScorePosition("player 2", player2Position);
        displayHighScorePosition("player 3", player3Position);
        displayHighScorePosition("player 4", player4Position);

    }

    public static void displayHighScorePosition(String name, int highScorePosition) {
        System.out.println(name+" managed to get into position " + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        if (score >1000){
            return 1;
        } else if(score>500 && score<1000){
            return 2;
        } else if(score>100 && score<500){
            return 3;
        }
        return 4;
    }
}
