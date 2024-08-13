package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        showIntro();
        runCurrentGame();
    }

    private static void showIntro() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
    }

    private static void runCurrentGame() {
        Scanner scanner = new Scanner(System.in);
        var currentGame = scanner.next();

        switch (currentGame) {
            case "1":
                Cli.greetUser(scanner);
            case "2":
                Even.runGame(scanner);
            default:
                scanner.close();
        }

        scanner.close();
    }
}
