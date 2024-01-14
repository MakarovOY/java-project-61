package hexlet.code;



import java.util.StringJoiner;

public class ProgressionGame {
    public static String[] playProgressionGame() {

        String question;

        int rightAnswer;
        int firstNumber;
        int quantityOfNumbers;
        int step;
        int minStep = 2;
        int maxStep = 10;
        int minNumberOfProgression = 1;
        int maxNumberOfProgression = 100;


        int positionForReplace;
        int numberForReplace;


        firstNumber = Util.getRandomNumber(minNumberOfProgression, maxNumberOfProgression);
        step = Util.getRandomNumber(minStep, maxStep);
        quantityOfNumbers = Util.getRandomNumber(5,10);
        positionForReplace = (int) (1 + (Math.random() * (quantityOfNumbers)));


        int lastNumber = firstNumber + (quantityOfNumbers - 1) * step;
        numberForReplace = firstNumber + (positionForReplace - 1) * step;

        StringJoiner strJ = new StringJoiner(" ");

        for (int i = firstNumber,  j = 0; i <= lastNumber; i += step, j++) {
            if (i != numberForReplace) {
                strJ.add("" + i);
            } else {
                strJ.add("..");
            }
        }
        question = strJ.toString();

        rightAnswer = numberForReplace;

        String[] roundInfo =  {question, "" + rightAnswer};
        return roundInfo;


    }
    public static void showTask() {
        System.out.println("What number is missing in the progression?.");
    }

}
