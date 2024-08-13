package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Game;
import hexlet.code.games.Greeter;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import java.util.Scanner;


public class Engine {
    private static int numberCounter = 0;
    private static final int QUESTION_LIMIT = 3;

    public static void runGame() {
        var scanner = new Scanner(System.in);
        var userGameInput = scanner.next();
        var game = getCurrentGame(userGameInput);
        var userName = Greeter.greetUser(scanner);

        if (game instanceof Greeter) {
            return;
        }

        game.showIntro();

        while (numberCounter < QUESTION_LIMIT) {
          var question = game.getQuestion();
          showQuestion(question);
          System.out.println(question);

            var userAnswer = scanner.next();
            var correctAnswer = game.getCorrectAnswer();

            System.out.println("Your answer: " + userAnswer);

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                showCorrectAnswer(userAnswer, correctAnswer, userName);
                break;
            }

            if (numberCounter == QUESTION_LIMIT - 1) {
                showWinningMessage(userName);
            }

            numberCounter += 1;
        }

    }

    private static void showQuestion(String questionValue) {
        System.out.println("Question: " + questionValue);
    }

    private static void showWinningMessage(String userName) {
        System.out.println("Congratulations, " + userName + "!");
    }

    private static void showCorrectAnswer(String userAnswer, String correctAnswer, String userName) {
        var userAnswerPhrase = "'" + userAnswer + "' is wrong answer ;(. ";
        var correctAnswerPhrase = "Correct answer was \'" + correctAnswer + "'";
        System.out.println(userAnswerPhrase + correctAnswerPhrase);
        System.out.println("Let's try again, " + userName + "!");
    }

    private static Game getCurrentGame(String gameType) {
        switch (gameType) {
            case "1":
               return new Greeter();
            case "2":
                return new Even();
            case "3":
                return new Calc();
            case "4":
                return new GCD();
            default:
                return new Greeter();
        }
    }

}
