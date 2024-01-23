package hexlet.code;


import java.util.Scanner;

public class App {
    public static final int GAME_EVEN = 2;
    public static final int GAME_CALC = 3;
    public static final int GAME_GCD = 4;
    public static final int GAME_PROGRESSION = 5;
    public static final int GAME_PRIME = 6;

    public static void main(String[] args) {
        userInterface();
    }
    public static void userInterface() {
        String userName;
        Scanner forUsersChoice = new Scanner(System.in);
        int usersChoice;
        System.out.println("Please enter the game number and press"
                + " Enter.\n1 - Greet\n2 - Even\n3 - Calc\n4 - GCD \n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.println("Your choice: ");
        usersChoice =  forUsersChoice.nextInt();



        switch (usersChoice) {
            case 0:
                break;
            case 1:
                GameInterface.greet();
                userName = GameInterface.getUserName();
                GameInterface.sayHalloByName(userName);
                break;
            case GAME_EVEN:
            case GAME_CALC:
            case GAME_GCD:
            case GAME_PROGRESSION:
            case GAME_PRIME:
                GameInterface.playGame(usersChoice);
                break;
            default:
                System.out.println("You entered wrong number.Try again.");
        }

    }
}
