package hexlet.code.Games;



import hexlet.code.GameEngine;
import hexlet.code.Util;

public class CalcGame {
    public static final int NUMBER_OF_EXPRESSIONS = 3;

    static final int MAX_RANDOM_NUMBER = 10;
    public static void  generateGameResult() {


        int firstNumber;
        int secondNumber;

        String question;
        String gameTask = "What is the result of the expression?";
        String rightAnswer;

        String[][] roundInfo = new String[GameEngine.MAX_WINS][GameEngine.PAIR_QUESTION_ANSWER];

        for (int i = 0; i < roundInfo.length; i++) {


            int varOfExpression = Util.getRandomNumber(0, NUMBER_OF_EXPRESSIONS - 1);

            firstNumber = Util.getRandomNumber(0, MAX_RANDOM_NUMBER);
            secondNumber = Util.getRandomNumber(0, MAX_RANDOM_NUMBER);
            question = "";
            rightAnswer = "";

            char[] operators = {'+', '-', '*'};
            question =    "" + firstNumber + " " + operators[varOfExpression] + " " + secondNumber;
            if (operators[varOfExpression] == '+') {
                rightAnswer = "" + (firstNumber + secondNumber);
            } else if (operators[varOfExpression] == '-') {
                rightAnswer = "" + (firstNumber - secondNumber);

            } else {
                rightAnswer = "" + (firstNumber * secondNumber);
            }

            roundInfo[i][0] = question;
            roundInfo[i][1] = rightAnswer;
        }

        GameEngine.playGame(gameTask, roundInfo);


    }


}
