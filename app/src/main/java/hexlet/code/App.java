package hexlet.code;


import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        userInterface();
    }
    public static void userInterface (){
        Scanner forUsersChoice = new Scanner(System.in);
        int usersChoice;
        System.out.println("Plea" +
                "se enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc\n4 - GCD \n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.println("Your choice: ");
        usersChoice =  forUsersChoice.nextInt();


        if (usersChoice > 6) {
            System.out.println("You entered wrong number.Try again.");

        }
       else if( usersChoice == 0){

        }
       else if (usersChoice == 1){
           Cli.greetings();
        }
        else {
            GameInterface.playGame(usersChoice);
        }

    }
}
