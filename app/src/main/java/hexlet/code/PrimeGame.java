package hexlet.code;




public class PrimeGame {

    final static int MIN_PRIME_NUMBER = 2;

    public static String[] playPrimeGame() {
        int maxNumber = 50;
        int question;

        int numberToGuess;

        String rightAnswer;

        boolean ifPrimeNumber = true;


        numberToGuess = Util.getRandomNumber(MIN_PRIME_NUMBER, maxNumber);

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
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'");
    }
}
