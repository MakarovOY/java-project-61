package hexlet.code;



public class EvenGame {
    public static String[] playEvenGame(){
       final int MAX_NUMBER = 101;
       int randomNumberForUser;
       final int  PARITY = 2;

       String rightAnswer;


        randomNumberForUser = (int) (Math.random()*MAX_NUMBER);


          if (randomNumberForUser % PARITY == 0){
               rightAnswer = "yes";
          }
         else {
               rightAnswer = "no";
          }
        String [] roundInfo =  {"" + randomNumberForUser, rightAnswer};

        return roundInfo;




    }
    public static void showTask() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
}
