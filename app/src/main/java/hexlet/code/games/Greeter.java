package hexlet.code.games;

import java.util.Scanner;

public final class Greeter implements Game {
    public static String greetUser(Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        var userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        return userName;
    }

    public String getQuestion() {
        return "";
    };
    public Boolean isAnswerCorrect(String userAnswer, String question) {
        return false;
    };
    public void showIntro() {

    };
    public String getCorrectAnswer() {
        return "";
    };
}
