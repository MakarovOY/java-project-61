package hexlet.code;


public class GCD {
    public static String[] playGCD_Game() {

        int firstNumber;
        int secondNumber;

        String question;
        int rightAnswer;

        rightAnswer = 0;


        firstNumber =  (int) (Math.random() * 50);
        secondNumber =  (int) (Math.random() * 50);
        int maxNumber;
        int minNumber;
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
                rightAnswer = i;
                break;
            }
        }
        question = "" + firstNumber + " " + secondNumber;

        String[] roundInfo =  {question, "" + rightAnswer};

        return roundInfo;

    }
    public static void showTask() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }
}
