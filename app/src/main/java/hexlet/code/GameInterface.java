package hexlet.code;

import hexlet.code.Games.CalcGame;
import hexlet.code.Games.EvenGame;
import hexlet.code.Games.GCD;
import hexlet.code.Games.PrimeGame;
import hexlet.code.Games.ProgressionGame;

import java.util.Scanner;

public class GameInterface {

    public static final int GAME_EVEN = 2;
    public static final int GAME_CALC = 3;
    public static final int GAME_GCD = 4;
    public static final int GAME_PROGRESSION = 5;
    public static final int GAME_PRIME = 6;


    static final int MAX_WINS = 3;
    public static void playGame(int numberOfGame) {
        int winCount = 0;
        String userName;
        String question;
        String rightAnswer;
        String usersAnswer;

        String[] gameInfo;

        Scanner getUsersAnswer = new Scanner(System.in);

        greet();
        userName = getUserName();
        sayHalloByName(userName);

        showGameTaskToUser(numberOfGame);


        while (winCount < MAX_WINS) {

            gameInfo = getGameInfo(numberOfGame);

            question = gameInfo[0];
            rightAnswer = gameInfo[1];

            System.out.println("Question: " + question);
            System.out.println("Your answer:");
            usersAnswer = getUsersAnswer.next();

            if (usersAnswer.equals(rightAnswer)) {
                System.out.println("Correct!");
                winCount++;
            } else {
                System.out.println("'" + usersAnswer + "' is wrong answer ;(. Correct answer was '" + rightAnswer
                        + "'.\nLet's try again, " + userName + "!");
                break;

            }

        }

        congratulateWinner(userName, winCount);
    }

    public static void showGameTaskToUser(int numberOfGame) {

        switch (numberOfGame) {

            case GAME_EVEN:
                EvenGame.showTask();
                break;
            case GAME_CALC:
                CalcGame.showTask();
                break;
            case GAME_GCD:
                GCD.showTask();
                break;
            case GAME_PROGRESSION:
                ProgressionGame.showTask();
                break;
            case GAME_PRIME:
                PrimeGame.showTask();
                break;
            default:
        }
    }

    public static String[] getGameInfo(int numberOfGame) {

        String[] gameInfo = new String[1];

        switch (numberOfGame) {
            case GAME_EVEN:
                gameInfo = EvenGame.generateGameResult();
                break;
            case GAME_CALC:
                gameInfo = CalcGame.generateGameResult();
                break;
            case GAME_GCD:
                gameInfo = GCD.generateGameResult();
                break;
            case GAME_PROGRESSION:
                gameInfo = ProgressionGame.generateGameResult();
                break;
            case GAME_PRIME:
                gameInfo = PrimeGame.generateGameResult();
                break;
            default:
        }
        return gameInfo;
    }
    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
    }
    public static String getUserName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        return  scanner.next();
    }
    public static void sayHalloByName(String userName) {
        System.out.println("Hello, " + userName + "!");
    }

    public static void congratulateWinner(String userName, int winCount) {
        if (winCount == MAX_WINS) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
