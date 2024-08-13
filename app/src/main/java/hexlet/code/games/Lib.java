package hexlet.code.games;

class Lib {
    private static final int RANDOM_LIMIT = 100;

    public static String getRandomOperand() {
        var number = Math.round(Math.random() * RANDOM_LIMIT);
        if (number < 1) {
            number = 1;
        }
        return String.valueOf(number);
    }
}
