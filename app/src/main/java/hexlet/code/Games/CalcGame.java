package hexlet.code.Games;


import hexlet.code.Util;

public class CalcGame {
    static final int NUMBER_OF_EXPRESSIONS = 3;
    public static String[] generateGameResult() {


        int firstNumber;
        int secondNumber;

        String question;
        int rightAnswer;

        int varOfExpression = Util.getRandomNumber(1, NUMBER_OF_EXPRESSIONS);

        firstNumber = Util.getRandomNumber(0, 10);
        secondNumber = Util.getRandomNumber(0, 10);
        question = "";
        rightAnswer = 0;

        switch (varOfExpression) {
            case 1:
                question = "" + firstNumber + " + " + secondNumber;
                rightAnswer = firstNumber + secondNumber;
                break;
            case 2:
                question = "" + firstNumber + " - " + secondNumber;
                rightAnswer = firstNumber - secondNumber;
                break;
            case 3:
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
