import java.util.Scanner;

public class Rounding {
    public static void roundNum() {
        Scanner numToRound = new Scanner(System.in);
        System.out.print("Enter n: ");
        float n = numToRound.nextFloat();
        System.out.print("Round result is: " + Math.round(n));


    }
}
