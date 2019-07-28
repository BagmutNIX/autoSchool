public class Arrays {
    public static void example() {
        int[] numbers = new int[21];
        //int output = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            //output = numbers[i];
            System.out.println(numbers[i]);
        }
    }
}
