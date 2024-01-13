package hexlet.code;


public class CalcGame {

    public static String[] playCalcGame() {


        int x;
        int y;

        String question;
        int rightAnswer;
        int varOfExpression = (int) (Math.random() * 3);
        x = (int) (Math.random() * 10);
        y = (int) (Math.random() * 10);
        question = "";
        rightAnswer = 0;

        switch (varOfExpression) {
            case 0:
                question = "" + x + " + " + y;
                rightAnswer = x + y;
                break;
            case 1:
                question = "" + x + " - " + y;
                rightAnswer = x - y;
                break;
            case 2:
                question = "" + x + " * " + y;
                rightAnswer = x * y;
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
