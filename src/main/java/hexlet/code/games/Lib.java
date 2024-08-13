package hexlet.code.games;

class Lib {
    private static final int RANDOM_LIMIT = 100;

    public static String getRandomOperand() {
        return String.valueOf(Math.round(Math.random() * RANDOM_LIMIT));
    }
}
