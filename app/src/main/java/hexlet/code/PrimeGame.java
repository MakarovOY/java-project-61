package hexlet.code;




public class PrimeGame {
    public static String[] PlayPrimeGame (){

        int question;

        int numberToGuess;

        String rightAnswer;

        boolean ifPrimeNumber = true ;


            numberToGuess = (int) (2+ (Math.random()*48));

            for(int i = 2; i < numberToGuess; i++ ){
                if((numberToGuess % i) == 0){
                    ifPrimeNumber = false;
                    break;
                }

            }

            rightAnswer = ifPrimeNumber  ? "yes" : "no";


           question = numberToGuess;

            String [] roundInfo =  {"" + question,  rightAnswer};
            return roundInfo;

    }

    public static void showTask (){
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'");
    }
}
