package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void greet() {
        String userName;
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        userName =  scanner.next();
        System.out.println("Hello, " + userName + "!");
    }

}
