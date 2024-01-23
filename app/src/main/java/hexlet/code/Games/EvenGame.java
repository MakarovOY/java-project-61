package hexlet.code.Games;


import hexlet.code.Util;

public class EvenGame {
    static final int MIN_NUMBER = 1;
    static final int MAX_NUMBER = 100;

    public static String[] generateGameResult() {

        int randomNumberForUser;

        String rightAnswer;

        randomNumberForUser = Util.getRandomNumber(MIN_NUMBER, MAX_NUMBER);

        if (Util.isNumberEven(randomNumberForUser)) {
            rightAnswer = "yes";
        } else {
            rightAnswer = "no";
        }
        String[] roundInfo =  {"" + randomNumberForUser, rightAnswer};

        return roundInfo;

    }
    public static void showTask() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
}
