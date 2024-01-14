package hexlet.code;

public class Util {
     final static int PARITY = 2;
    public static int getRandomNumber(int min, int max){
        int randomNumber;
        int highBoundCorrection = 1;
        randomNumber = (int) (min + (Math.random() * (max -min + highBoundCorrection)));
        return randomNumber;
    }

    public static boolean isNumberEven(int number) {

        return number % PARITY == 0? true : false;

    }



}
