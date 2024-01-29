package hexlet.code.Games;



import hexlet.code.GameEngine;
import hexlet.code.Util;

import java.util.StringJoiner;

public class ProgressionGame {
    static final int MIN_NUMBER_OF_PROGRESSION = 1;
    static final int MAX_NUMBER_OF_PROGRESSION = 100;
    static final int MIN_NUMBER_OF_QUANTITY = 5;
    static final int MAX_NUMBER_OF_QUANTITY = 10;
    static final int MIN_STEP = 2;
    static final int MAX_STEP = 10;


    public static void generateGameResult() {

        String question;
        String gameTask = "What number is missing in the progression?.";

        int rightAnswer;
        int firstNumberOfProgression;
        int quantityOfNumbers;
        int step;
        int positionForReplace;
        int numberForReplace;
        String [][] roundInfo = new String [GameEngine.MAX_WINS][GameEngine.PAIR_QUESTION_ANSWER];

        for (int i =0; i<3; i ++) {

            firstNumberOfProgression = Util.getRandomNumber(MIN_NUMBER_OF_PROGRESSION, MAX_NUMBER_OF_PROGRESSION);
            step = Util.getRandomNumber(MIN_STEP, MAX_STEP);
            quantityOfNumbers = Util.getRandomNumber(MIN_NUMBER_OF_QUANTITY, MAX_NUMBER_OF_QUANTITY);
            positionForReplace = Util.getRandomNumber(MIN_NUMBER_OF_PROGRESSION, quantityOfNumbers);


            int lastNumberOfProgression = firstNumberOfProgression + (quantityOfNumbers) * step;
            numberForReplace = firstNumberOfProgression + (positionForReplace) * step;

            question = getProgressionInString(firstNumberOfProgression, lastNumberOfProgression, numberForReplace, step);

            rightAnswer = numberForReplace;

            roundInfo[i][0] = question;

            roundInfo[i][1] ="" + rightAnswer;

        }
        GameEngine.playGame(gameTask, roundInfo);
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
