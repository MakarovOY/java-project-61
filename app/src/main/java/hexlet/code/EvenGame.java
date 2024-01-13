package hexlet.code;



public class EvenGame {
   // final static int PARITY = 2;
    public static String[] playEvenGame() {
        final int maxNumber = 101;
        int randomNumberForUser;
        final  int parity = 2;

        String rightAnswer;

        randomNumberForUser = (int) (Math.random() * maxNumber);

        if (randomNumberForUser % parity == 0) {
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
