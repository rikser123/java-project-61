package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greatUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        var userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        scanner.close();
    }
}
