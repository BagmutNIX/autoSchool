package exceptions_and_logging;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TryException.linesFrom108();
        try {
            TryException.linesFrom108();
        }catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
