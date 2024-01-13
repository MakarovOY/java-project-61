package hexlet.code;


public class GCD_Game {
    public static String[] playGCD_Game(){

        int x;
        int y;


        String question;
        int rightAnswer ;


//        question = "";
        rightAnswer = 0;


            x =  (int) (Math.random() * 50);
            y =  (int) (Math.random() * 50);
            int maxNumber;
            int minNumber;
            if (x>y){
                maxNumber = x;
                minNumber =y;
            }
            else {
                maxNumber = y;
                minNumber =x;
            }
            for(int i = minNumber; i> 0; i -- ){
                int res1 = maxNumber % i;
                int res2 = minNumber % i;
                if(res1 == 0 && res2 == 0){
                    rightAnswer = i;
                    break;
                }
            }
            question = "" + x + " " + y;

        String [] roundInfo =  {question, "" + rightAnswer};

        return roundInfo;


    }
        public static void showTask() {
            System.out.println("Find the greatest common divisor of given numbers.");
    }
}
