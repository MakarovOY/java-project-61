package hexlet.code.Games;


import hexlet.code.GameEngine;
import hexlet.code.Util;

public class PrimeGame {

    static final int MIN_PRIME_NUMBER = 2;
    static final int MAX_NUMBER = 50;

    public static void generateGameResult() {

        int question;


        int numberToGuess;

        String rightAnswer;
        String gameTask = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        boolean ifPrimeNumber = true;

        String[][] roundInfo = new String[GameEngine.MAX_WINS][GameEngine.PAIR_QUESTION_ANSWER];

        for (int i = 0; i < roundInfo.length; i++) {


            numberToGuess = Util.getRandomNumber(MIN_PRIME_NUMBER, MAX_NUMBER);


            for (int j = MIN_PRIME_NUMBER; j < numberToGuess; j++) {
                if ((numberToGuess % j) == 0) {
                    ifPrimeNumber = false;
                    break;
                }

            }

            rightAnswer = ifPrimeNumber ? "yes" : "no";

            question = numberToGuess;


            roundInfo[i][0] = ""  + question;

            roundInfo[i][1] = "" + rightAnswer;

        }
        GameEngine.playGame(gameTask, roundInfo);
    }


}
