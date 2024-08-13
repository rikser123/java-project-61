package hexlet.code.games;

public class Calc implements Game {
    private final int RANDOM_LIMIT = 100;
    private final String[] operators = {"+", "-", "*"};
    private String operand1;
    private  String operand2;
    private String operator;
    private String question;

    public String getQuestion() {
        this.operand1 = String.valueOf(Math.round(Math.random() * RANDOM_LIMIT));
        this.operand2 = String.valueOf(Math.round(Math.random() * RANDOM_LIMIT));
        int randomIndex = (int) Math.floor(Math.random() * this.operators.length);
        this.operator = this.operators[randomIndex];

        this.question = this.operand1 + " " + this.operator + " " + this.operand2;
        return this.question;
    }

    public String getCorrectAnswer() {
        var firstNumber = Integer.parseInt(this.operand1);
        var secondNumber = Integer.parseInt(this.operand2);
        var result = "";

        if (this.operator.equals("+")) {
            result = String.valueOf(firstNumber + secondNumber);
        }

        if (this.operator.equals("-")) {
            result = String.valueOf(firstNumber - secondNumber);
        }

        if (this.operator.equals("*")) {
            result = String.valueOf(firstNumber * secondNumber);
        }

        return result;
    }

    public void showIntro() {
        System.out.println("What is the result of the expression?");
    }
}
