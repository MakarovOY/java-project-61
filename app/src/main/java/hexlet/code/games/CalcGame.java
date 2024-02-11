package hexlet.code.games;



import hexlet.code.GameEngine;
import hexlet.code.Util;

public class CalcGame {

    static final int MAX_RANDOM_NUMBER = 10;
    public static void generateGameInfo() {


        String gameTask = "What is the result of the expression?";

        String[][] roundInfo = new String[GameEngine.MAX_WINS][GameEngine.PAIR_QUESTION_ANSWER];

        for (int i = 0; i < roundInfo.length; i++) {


            char[] operators = {'+', '-', '*'};

            int varOfExpression = Util.getRandomNumber(0, operators.length - 1);

            int firstNumber = Util.getRandomNumber(0, MAX_RANDOM_NUMBER);
            int secondNumber = Util.getRandomNumber(0, MAX_RANDOM_NUMBER);

            String question = "" + firstNumber + " " + operators[varOfExpression] + " " + secondNumber;
            String rightAnswer = getResultOfExpression(operators[varOfExpression], firstNumber, secondNumber);

            roundInfo[i][0] = question;
            roundInfo[i][1] = rightAnswer;
        }

        GameEngine.playGame(gameTask, roundInfo);


    }

    public static String getResultOfExpression(char operator, int firstNumber, int secondNumber) {
        String rightAnswer;
        if (operator == '+') {
            rightAnswer = String.valueOf(firstNumber + secondNumber);
        } else if (operator == '-') {
            rightAnswer =  String.valueOf(firstNumber - secondNumber);

        } else {
            rightAnswer = String.valueOf(firstNumber * secondNumber);
        }
        return rightAnswer;
    }


}
