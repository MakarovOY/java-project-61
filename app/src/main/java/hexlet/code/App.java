package hexlet.code;


import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        userInterface();
    }
    public static void userInterface() {
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
                Cli.greetings();
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                GameInterface.playGame(usersChoice);
            default:
                System.out.println("You entered wrong number.Try again.");
        }

    }
}
