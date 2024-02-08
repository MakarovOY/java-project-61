package hexlet.code;



import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCD;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;

public class App {
    public static final int EXIT = 0;
    public static final int GREET = 1;
    public static final int GAME_EVEN = 2;
    public static final int GAME_CALC = 3;
    public static final int GAME_GCD = 4;
    public static final int GAME_PROGRESSION = 5;
    public static final int GAME_PRIME = 6;

    public static void main(String[] args) {
        Scanner forUsersChoice = new Scanner(System.in);
        int usersChoice;
        System.out.println("Please enter the game number and press"
                + " Enter.\n1 - Greet\n2 - Even\n3 - Calc\n4 - GCD \n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.println("Your choice: ");
        usersChoice =  forUsersChoice.nextInt();
        chooseGame(usersChoice);
    }
    public static void chooseGame(int usersChoice) {



        switch (usersChoice) {
            case EXIT:
                break;
            case GREET:
                Cli.greet();
                break;
            case GAME_EVEN:
                EvenGame.generateGameInfo();
                break;
            case GAME_CALC:
                CalcGame.generateGameInfo();
                break;
            case GAME_GCD:
                GCD.generateGameInfo();
                break;
            case GAME_PROGRESSION:
                ProgressionGame.generateGameInfo();
                break;
            case GAME_PRIME:
                PrimeGame.generateGameInfo();
                break;
            default:
                System.out.println("You entered wrong number.Try again.");
        }

    }

}
