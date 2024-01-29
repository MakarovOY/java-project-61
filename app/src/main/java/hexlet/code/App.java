package hexlet.code;


import hexlet.code.Games.*;

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
        chooseGame();
    }
    public static void chooseGame() {
        String userName;
        Scanner forUsersChoice = new Scanner(System.in);
        int usersChoice;
        System.out.println("Please enter the game number and press"
                + " Enter.\n1 - Greet\n2 - Even\n3 - Calc\n4 - GCD \n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.println("Your choice: ");
        usersChoice =  forUsersChoice.nextInt();



        switch (usersChoice) {
            case EXIT:
                break;
            case GREET:
               Cli.greet();
                break;
            case GAME_EVEN:
                EvenGame.generateGameResult();
                break;
            case GAME_CALC:
                CalcGame.generateGameResult();
                break;
            case GAME_GCD:
                GCD.generateGameResult();
                break;
            case GAME_PROGRESSION:
                ProgressionGame.generateGameResult();
                break;
            case GAME_PRIME:
                PrimeGame.generateGameResult();
                break;
            default:
                System.out.println("You entered wrong number.Try again.");
        }

    }

}
