package hexlet.code.Games;



import hexlet.code.Util;

import java.util.StringJoiner;

public class ProgressionGame {
    public static String[] generateGameResult() {

        String question;


        int rightAnswer;
        int firstNumberOfProgression;
        int quantityOfNumbers;
        int step;
        int minStep = 2;
        int maxStep = 10;
        int minNumberOfProgression = 1;
        int maxNumberOfProgression = 100;


        int positionForReplace;
        int numberForReplace;


        firstNumberOfProgression = Util.getRandomNumber(minNumberOfProgression, maxNumberOfProgression);
        step = Util.getRandomNumber(minStep, maxStep);
        quantityOfNumbers = Util.getRandomNumber(5, 10);
        positionForReplace = Util.getRandomNumber(minNumberOfProgression, quantityOfNumbers);


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
