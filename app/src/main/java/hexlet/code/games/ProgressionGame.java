package hexlet.code.games;



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


    public static void generateGameInfo() {

       // String question;
        String gameTask = "What number is missing in the progression?.";


        String[][] roundInfo = new String[GameEngine.MAX_WINS][GameEngine.PAIR_QUESTION_ANSWER];

        for (int i = 0; i < roundInfo.length; i++) {

            int firstNumberOfProgression = Util.getRandomNumber(MIN_NUMBER_OF_PROGRESSION, MAX_NUMBER_OF_PROGRESSION);
            int step = Util.getRandomNumber(MIN_STEP, MAX_STEP);
            int quantityOfNumbers = Util.getRandomNumber(MIN_NUMBER_OF_QUANTITY, MAX_NUMBER_OF_QUANTITY);
            int positionForReplace = Util.getRandomNumber(MIN_NUMBER_OF_PROGRESSION, quantityOfNumbers);
            int numberForReplace = firstNumberOfProgression + (positionForReplace) * step;

            String question =
                    getProgressionInString(firstNumberOfProgression, quantityOfNumbers, numberForReplace, step);

            int rightAnswer = numberForReplace;

            roundInfo[i][0] = question;

            roundInfo[i][1] = String.valueOf(rightAnswer);

        }
        GameEngine.playGame(gameTask, roundInfo);
    }


    public static String getProgressionInString(int firstNumber,
                                                int quantityOfNumbers, int numberForReplace, int step) {

        StringJoiner strJ = new StringJoiner(" ");

        int numberOfProgression = firstNumber;
        int stepOfProgression = step;
        for (int i = 0; i < quantityOfNumbers; i++) {
            if (numberOfProgression != numberForReplace) {
                strJ.add("" + numberOfProgression);
                numberOfProgression = numberOfProgression + stepOfProgression;
            } else {
                strJ.add("..");
                numberOfProgression = numberOfProgression + stepOfProgression;
            }
        }

        return strJ.toString();

    }

}
