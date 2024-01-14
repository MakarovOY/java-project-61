package hexlet.code;


public class CalcGame {
    static final int NUMBER_OF_EXPRESSIONS = 3;
    public static String[] playCalcGame() {


        int firstNumber;
        int secondNumber;

        String question;
        int rightAnswer;

        int varOfExpression = Util.getRandomNumber(1,NUMBER_OF_EXPRESSIONS);
//        firstNumber = (int) (Math.random() * 10);
//        secondNumber = (int) (Math.random() * 10);
        firstNumber = Util.getRandomNumber(0,10);
        secondNumber = Util.getRandomNumber(0,10);
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
