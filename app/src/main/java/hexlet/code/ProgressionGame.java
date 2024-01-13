package hexlet.code;



import java.util.StringJoiner;

public class ProgressionGame {
    public static String[] playProgressionGame() {

        String question;

        int rightAnswer;

        int firstNumber;
        int quantityOfNumbers;
        int step;



        int positionForReplace;
        int numberForReplace;


        firstNumber = (int) (1 + (Math.random() * 100));
        step = (int) (2 + (Math.random() * 8));
        quantityOfNumbers = (int) (5 + (Math.random() * 6));
        positionForReplace = (int) (1 + (Math.random() * (quantityOfNumbers)));


        int lastNumber = firstNumber + (quantityOfNumbers - 1) * step;
        numberForReplace = firstNumber + (positionForReplace - 1) * step;

        StringJoiner strJ = new StringJoiner(" ");

        for (int i = firstNumber,  j = 0; i <= lastNumber; i += step, j++) {
            if (i != numberForReplace) {
                strJ.add("" + i);
            }
            else {
                strJ.add("..");
            }
        }
        question = strJ.toString();

        rightAnswer = numberForReplace;

        String[] roundInfo =  {question, "" + rightAnswer};
        return roundInfo;


    }
    public static void showTask() {
        System.out.println("What number is missing in the progression?.");
    }

}
