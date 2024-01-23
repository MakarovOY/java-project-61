package hexlet.code.Games;


import hexlet.code.Util;

public class GCD {
    static final int MIN_NUMBER = 2;
    static final int MAX_NUMBER = 50;

    public static String[] generateGameResult() {

        int firstNumber;
        int secondNumber;

        String question;
        int rightAnswer;

        firstNumber = Util.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
        secondNumber = Util.getRandomNumber(MIN_NUMBER, MAX_NUMBER);

        rightAnswer = searchCommonGreatestDivisor(firstNumber, secondNumber);

        question = "" + firstNumber + " " + secondNumber;

        String[] roundInfo = {question, "" + rightAnswer};

        return roundInfo;

    }

    public static void showTask() {
        System.out.println("Find the greatest common divisor of given numbers.");
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
