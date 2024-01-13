package hexlet.code;

import java.util.Scanner;

public class GameInterface {


    public static void playGame(int numberOfGame) {
        int winCount = 0;
        int maxWins = 3;
        String userName;
        String question;
        String rightAnswer;
        String usersAnswer;

        String[] gameInfo;

        Scanner getUsersAnswer = new Scanner(System.in);

        userName = Cli.greetings();

        showGameTasToUser(numberOfGame);


        while (winCount < maxWins) {

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
                System.out.println("'" + usersAnswer + "' is wrong answer ;(. Correct answer was '" + rightAnswer +
                        "'.\nLet's try again, " + userName);
                break;

            }


            if (winCount == maxWins) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }

    }

    public static void showGameTasToUser(int numberOfGame) {

        switch (numberOfGame) {

            case 2:
                EvenGame.showTask();
                break;
            case 3:
                CalcGame.showTask();
                break;
            case 4:
                GCD_Game.showTask();
                break;
            case 5:
                ProgressionGame.showTask();
                break;
            case 6:
                PrimeGame.showTask();
                break;
        }
    }
    public static String [] getGameInfo (int numberOfGame ){

        String[] gameInfo = new String[1];

        switch (numberOfGame) {


            case 2:
                gameInfo = EvenGame.playEvenGame();
                break;
            case 3:

                gameInfo = CalcGame.playCalcGame();
                break;
            case 4:
                gameInfo = GCD_Game.playGCD_Game();
                break;
            case 5:
                gameInfo = ProgressionGame.playProgressionGame();
                break;
            case 6:
                gameInfo = PrimeGame.PlayPrimeGame();
                break;

        }
        return gameInfo;
    }
}
