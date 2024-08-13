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
        System.out.println("4 - GSD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
    }
}
