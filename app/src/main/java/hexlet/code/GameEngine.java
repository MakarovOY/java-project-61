package hexlet.code;

import java.util.Scanner;

public class GameEngine {


    public static final int MAX_WINS = 3;
    public static final int PAIR_QUESTION_ANSWER = 2;
    public static void playGame(String gameTask, String[][] roundInfo) {
        int winCount = 0;
        String userName;


        Scanner getUsersAnswer = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        userName =  scanner.next();
        System.out.println("Hello, " + userName);

        System.out.println(gameTask);

        while (winCount < MAX_WINS) {

            String question;
            String rightAnswer;
            String usersAnswer;

            int roundIndex = winCount;
            question = roundInfo[roundIndex][0];
            rightAnswer = roundInfo[roundIndex][1];

            System.out.println("Question: " + question);
            System.out.println("Your answer:");
            usersAnswer = getUsersAnswer.next();

            if (usersAnswer.equals(rightAnswer)) {
                System.out.println("Correct!");
                winCount++;
            } else {
                System.out.println("'" + usersAnswer + "' is wrong answer ;(. Correct answer was '" + rightAnswer
                        + "'.\nLet's try again, " + userName + "!");
                return;

            }

        }

        System.out.println("Congratulations, " + userName + "!");


    }

}
