package hexlet.code;

import java.util.Scanner;

class Even implements Game {
    private static int numberCounter = 0;
    private static final int RANDOM_LIMIT = 1000;
    private static final int QUESTION_LIMIT = 3;

    public static void runGame(Scanner scanner) {
        var userName = Cli.greetUser(scanner);
        showIntro();

        while (numberCounter < QUESTION_LIMIT) {
            var number = getRandomNumber();
            System.out.println("Question: " + number);

            var userAnswer = scanner.next();
            var isAnswerCorrect = isAnswerCorrect(userAnswer, number);

            System.out.println("Your answer: " + userAnswer);

            if (isAnswerCorrect) {
                System.out.println("Correct!");
            } else {
                showCorrectAnswer(userAnswer, number, userName);
                break;
            }

            if (numberCounter == QUESTION_LIMIT - 1) {
                showWinningMessage(userName);
            }

            numberCounter += 1;
        }

    }

    private static boolean isAnswerCorrect(String userAnswer, long number) {
        var isEven = isEven(number);

        var isEvenWright = userAnswer.equals("yes") && isEven;
        var isNotEvenWright = userAnswer.equals("no") && !isEven;

        return isEvenWright || isNotEvenWright;
    }

    private static void showIntro() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    private static void showCorrectAnswer(String userAnswer, long number, String userName) {
        var isEven = isEven(number);
        var userAnswerPhrase = "'" + userAnswer + "' is wrong answer ;(. ";
        var correctAnswer = isEven ? "yes" : "no";
        var correctAnswerPhrase = "Correct answer was \'" + correctAnswer + "'";
        System.out.println(userAnswerPhrase + correctAnswerPhrase);
        System.out.println("Let's try again, " + userName + "!");
    }

    private static void showWinningMessage(String userName) {
        System.out.println("Congratulations, " + userName + "!");
    }

    private static long getRandomNumber() {
        return Math.round(Math.random() * RANDOM_LIMIT);
    }

    private static boolean isEven(long number) {
        return (number % 2) == 0;
    }
}
