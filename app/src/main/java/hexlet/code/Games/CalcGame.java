package hexlet.code.Games;


import hexlet.code.Util;

public class CalcGame {
    public static final int NUMBER_OF_EXPRESSIONS = 3;
    public static final int ADDITION = 1;
    public static final int SUBTRACTION = 2;
    public static final int MULTIPLICATION = 3;
    static final int MAX_RANDOM_NUMBER = 2;
    public static String[] generateGameResult() {


        int firstNumber;
        int secondNumber;

        String question;
        int rightAnswer;

        int varOfExpression = Util.getRandomNumber(1, NUMBER_OF_EXPRESSIONS);

        firstNumber = Util.getRandomNumber(0, MAX_RANDOM_NUMBER);
        secondNumber = Util.getRandomNumber(0, MAX_RANDOM_NUMBER);
        question = "";
        rightAnswer = 0;

        switch (varOfExpression) {
            case ADDITION:
                question = "" + firstNumber + " + " + secondNumber;
                rightAnswer = firstNumber + secondNumber;
                break;
            case SUBTRACTION:
                question = "" + firstNumber + " - " + secondNumber;
                rightAnswer = firstNumber - secondNumber;
                break;
            case MULTIPLICATION:
                question = "" + firstNumber + " * " + secondNumber;
                rightAnswer = firstNumber * secondNumber;
                break;
            default:
        }
        String[] roundInfo = {question, "" + rightAnswer};
        return roundInfo;

    }

    public static void showTask() {
        System.out.println("What is the result of the expression?");
    }


}
