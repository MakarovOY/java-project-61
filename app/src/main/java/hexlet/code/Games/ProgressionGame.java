package hexlet.code.Games;



import hexlet.code.Util;

import java.util.StringJoiner;

public class ProgressionGame {
    static final int MIN_NUMBER_OF_PROGRESSION = 1;
    static final int MAX_NUMBER_OF_PROGRESSION = 100;
    static final int MIN_NUMBER_OF_QUANTITY = 5;
    static final int MAX_NUMBER_OF_QUANTITY = 10;
    static final int MIN_STEP = 2;
    static final int MAX_STEP = 10;


    public static String[] generateGameResult() {

        String question;


        int rightAnswer;
        int firstNumberOfProgression;
        int quantityOfNumbers;
        int step;
        int positionForReplace;
        int numberForReplace;


        firstNumberOfProgression = Util.getRandomNumber(MIN_NUMBER_OF_PROGRESSION, MAX_NUMBER_OF_PROGRESSION);
        step = Util.getRandomNumber(MIN_STEP, MAX_STEP);
        quantityOfNumbers = Util.getRandomNumber(MIN_NUMBER_OF_QUANTITY, MAX_NUMBER_OF_QUANTITY);
        positionForReplace = Util.getRandomNumber(MIN_NUMBER_OF_PROGRESSION, quantityOfNumbers);


        int lastNumberOfProgression = firstNumberOfProgression + (quantityOfNumbers) * step;
        numberForReplace = firstNumberOfProgression + (positionForReplace) * step;

        question = getProgressionInString(firstNumberOfProgression, lastNumberOfProgression, numberForReplace, step);

        rightAnswer = numberForReplace;

        String[] roundInfo =  {question, "" + rightAnswer};
        return roundInfo;


    }
    public static void showTask() {
        System.out.println("What number is missing in the progression?.");
    }

    public static String getProgressionInString(int firstNumber, int lastNumber, int numberForReplace, int step) {

        StringJoiner strJ = new StringJoiner(" ");

        for (int i = firstNumber; i <= lastNumber; i += step) {
            if (i != numberForReplace) {
                strJ.add("" + i);
            } else {
                strJ.add("..");

            }
        }

        return strJ.toString();

    }

}
