package exceptions_and_logging;

public class Exception {
    public static void linesFrom108() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.print("8 ");
        }
        Thread.sleep(3000);
        for (int i = 0; i < 10; i++) {
            System.out.println("8");
        }
    }
}
