package hexlet.code.games;

public final class Prime implements Game {
   private String question;

    public String getQuestion() {
       this.question = Lib.getRandomOperand();
       return this.question;
    }

    public String getCorrectAnswer() {
        var number = Integer.parseInt(this.question);
        var isPrime = isPrime(number, 2);

        return isPrime ? "yes" : "no";
    }

    public void showIntro() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    private boolean isPrime(int number, int divider) {
        if (number <= 2) {
            return true;
        }

        if (divider == number) {
            return true;
        }

        if (number % divider == 0) {
            return false;
        }

        return isPrime(number, divider + 1);
    }
}
