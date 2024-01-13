package hexlet.code;




public class PrimeGame {
    public static String[] PlayPrimeGame (){

        int question;

        int numberToGuess;
        String rightAnswer;

        boolean primeNumber = true;


            numberToGuess = (int) (2+ (Math.random()*48));

            for(int i = 2; i < numberToGuess; i++ ){
                if((numberToGuess % i) == 0){
                    primeNumber = false;
                    break;
                }

                primeNumber = true;

            }

           if(primeNumber) {
               rightAnswer = "yes";
           }
           else {
               rightAnswer = "no";
           }
           question = numberToGuess;

            String [] roundInfo =  {"" + question,  rightAnswer};
            return roundInfo;

    }

    public static void showTask (){
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'");
    }
}
