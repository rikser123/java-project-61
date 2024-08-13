package hexlet.code.games;

public class GCD implements Game {
    private String operand1;
    private String operand2;
    private String question;

    public String getQuestion() {
        this.operand1 = Lib.getRandomOperand();
        this.operand2 = Lib.getRandomOperand();
        this.question = this.operand1 + " " + this.operand2;
        return this.question;
    }

    public String getCorrectAnswer() {
        var firstNumber = Integer.parseInt(this.operand1);
        var secondNumber = Integer.parseInt(this.operand2);
        var startDivisor = Math.min(firstNumber, secondNumber);

        return String.valueOf(findGCD(firstNumber, secondNumber, startDivisor));
    }

    public void showIntro() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    private static int findGCD(int number1, int number2, int divisor) {
        if (divisor == 1) {
            return 1;
        }

        if (number1 % divisor == 0 && number2 % divisor == 0) {
            return divisor;
        }

        return findGCD(number1, number2, divisor - 1);
    }
}
