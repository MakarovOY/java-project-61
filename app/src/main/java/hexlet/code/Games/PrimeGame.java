package hexlet.code.Games;


import hexlet.code.Util;

public class PrimeGame {

    static final int MIN_PRIME_NUMBER = 2;
    static final int MAX_NUMBER = 50;

    public static String[] generateGameResult() {

        int question;


        int numberToGuess;

        String rightAnswer;

        boolean ifPrimeNumber = true;


        numberToGuess = Util.getRandomNumber(MIN_PRIME_NUMBER, MAX_NUMBER);

        for (int i = 2; i < numberToGuess; i++) {
            if ((numberToGuess % i) == 0) {
                ifPrimeNumber = false;
                break;
            }

        }

        rightAnswer = ifPrimeNumber  ? "yes" : "no";

        question = numberToGuess;

        String[] roundInfo =  {"" + question,  rightAnswer};

        return roundInfo;

    }

    public static void showTask() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }
}
