package hexlet.code.Games;


import hexlet.code.GameEngine;
import hexlet.code.Util;

public class EvenGame {
    static final int MIN_NUMBER = 1;
    static final int MAX_NUMBER = 100;

    public static void generateGameResult() {

        int randomNumberForUser;

        String rightAnswer;
        String gameTask = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[][] roundInfo = new String[GameEngine.MAX_WINS][GameEngine.PAIR_QUESTION_ANSWER];

        for (int i = 0; i < 3; i++) {

            randomNumberForUser = Util.getRandomNumber(MIN_NUMBER, MAX_NUMBER);

            if (Util.isNumberEven(randomNumberForUser)) {
                rightAnswer = "yes";
            } else {
                rightAnswer = "no";
            }

            roundInfo[i][0] = "" + randomNumberForUser;
            roundInfo[i][1] = rightAnswer;
        }
        GameEngine.playGame(gameTask, roundInfo);
    }

}
