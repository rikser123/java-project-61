package hexlet.code.games;

public class Even implements Game {
    private final int RANDOM_LIMIT = 100;
    private String question;

    public String getQuestion() {
        this.question = String.valueOf(Math.round(Math.random() * RANDOM_LIMIT));
        return this.question;
    }

    public String getCorrectAnswer() {
        var isEven = isEven(Long.parseLong(this.question));

        return isEven ? "yes" : "no";
    }

    public void showIntro() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    private static boolean isEven(long number) {
        return (number % 2) == 0;
    }
}
