package hexlet.code.Games;


import hexlet.code.GameEngine;
import hexlet.code.Util;

public class GCD {
    static final int MIN_NUMBER = 2;
    static final int MAX_NUMBER = 50;

    public static void generateGameResult() {

        int firstNumber;
        int secondNumber;

        String question;
        String gameTask = "Find the greatest common divisor of given numbers.";
        int rightAnswer;

        String[][] roundInfo = new String[GameEngine.MAX_WINS][GameEngine.PAIR_QUESTION_ANSWER];

        for (int i = 0; i < 3; i++) {

            firstNumber = Util.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            secondNumber = Util.getRandomNumber(MIN_NUMBER, MAX_NUMBER);

            rightAnswer = searchCommonGreatestDivisor(firstNumber, secondNumber);

            question = "" + firstNumber + " " + secondNumber;

            roundInfo[i][0] = question;

            roundInfo[i][1] = "" + rightAnswer;

        }
        GameEngine.playGame(gameTask, roundInfo);
    }



    public static int searchCommonGreatestDivisor(int firstNumber, int secondNumber) {
        int maxNumber;
        int minNumber;
        int commonGreatestDivision = 0;
        if (firstNumber > secondNumber) {
            maxNumber = firstNumber;
            minNumber = secondNumber;
        } else {
            maxNumber = secondNumber;
            minNumber = firstNumber;
        }

        for (int i = minNumber; i > 0; i--) {
            int res1 = maxNumber % i;
            int res2 = minNumber % i;
            if (res1 == 0 && res2 == 0) {
                commonGreatestDivision = i;
                break;
            }
        }
        return commonGreatestDivision;
    }

}
