package hexlet.code;


public class App {
    public static void main(String[] args) {
       showIntro();
       Engine.runGame();
    }

    private static void showIntro() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
    }
}
