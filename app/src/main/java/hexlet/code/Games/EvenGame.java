package hexlet.code.Games;


import hexlet.code.Util;

public class EvenGame {

    public static String[] playEvenGame() {
        int maxNumber = 100;
        int minNumber = 1;
        int randomNumberForUser;

        String rightAnswer;

      //  randomNumberForUser = (int) (Math.random() * maxNumber);
        randomNumberForUser = Util.getRandomNumber(minNumber, maxNumber);

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
