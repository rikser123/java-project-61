package hexlet.code.games;

public final class Progression implements Game {
    private final int progressionLength = 10;
    private final int maxProgressionGap = 10;
    private String answer;

    public String getQuestion() {
        var startNumber = Integer.parseInt(Lib.getRandomOperand());
        String[] progression = new String[progressionLength];
        var missingIndex = Math.round(Math.random() * progression.length);
        var progressionGap = Math.round(1 + Math.random() * (maxProgressionGap - 1));

        for (var i = 0; i < progression.length; i += 1) {
            var number = startNumber + i * progressionGap;
            if (i == missingIndex) {
                answer = String.valueOf(number);
                progression[i] = "..";
            } else {
                progression[i] = String.valueOf(number);
            }
        }

        return String.join(" ", progression);
    }

    public String getCorrectAnswer() {
      return this.answer;
    }

    public void showIntro() {
        System.out.println("What number is missing in the progression?");
    }
}
