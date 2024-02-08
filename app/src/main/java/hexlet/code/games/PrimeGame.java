package hexlet.code.games;


import hexlet.code.GameEngine;
import hexlet.code.Util;


public class PrimeGame {

    static final int MIN_PRIME_NUMBER = 2;
    static final int MAX_NUMBER = 50;

    public static void generateGameInfo() {

        String gameTask = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[][] roundInfo = new String[GameEngine.MAX_WINS][GameEngine.PAIR_QUESTION_ANSWER];

        for (int i = 0; i < roundInfo.length; i++) {

            int numberToGuess = Util.getRandomNumber(MIN_PRIME_NUMBER, MAX_NUMBER);

            String rightAnswer = isPrimeNumber(numberToGuess) ? "yes" : "no";

            int question = numberToGuess;


            roundInfo[i][0] = String.valueOf(question);


            roundInfo[i][1] = rightAnswer;

        }

        GameEngine.playGame(gameTask, roundInfo);
    }

    public static boolean isPrimeNumber(int number) {
        boolean isPrime = true;
        for (int j = MIN_PRIME_NUMBER; j < number; j++) {
            if ((number % j) == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }


}
