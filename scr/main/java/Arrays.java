import com.sun.org.apache.xpath.internal.operations.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;


public class Arrays {

/*    -1-

    Максимальное среди массива на 20 чисел

1. В методе initializeArray():
  1.1. Создайте массив на 20 чисел
  1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива*/

    public static int[] initializeArray() throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        int[] numbers = new int[5];
        //ArrayList<int> numbers = new ArrayList<int>();
        System.out.println("Fill up array of 5 elements: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());

        }
        for (int i = 0; i < numbers.length; i++) {
            //numbers[i] = i + 1;
            System.out.println("You entered: " + numbers[i]);
        }
        return numbers;
    }
    public static int maxNumInArray(int[] array) throws IOException {

        int maximum = 0;

        for (int i = 0; i < array.length; i++) {
            if (maximum < array[i]) maximum = array[i];
        }
        System.out.println("Maximum is: " + maximum);
        return maximum;

    }

    //Решение этой же задачи с помощью класса ArrayList:

    public static ArrayList<Integer> initializeArrayList() throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        //int[] numbers = new int[5];
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Fill up array of 5 elements: ");
        for (int i = 0; i < 7; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < numbers.size(); i++) {
            //numbers[i] = i + 1;
            System.out.println("You entered: " + numbers.get(i));
        }
        return numbers;
    }
    public static int maxNumInArrayList(ArrayList<Integer> array) throws IOException {

        int maximum = 0;
        for (int i = 0; i < array.size(); i++) {
            if(maximum < array.get(i)) maximum = array.get(i);
        }
        System.out.println("Maximum is: " + maximum);
        return maximum;
    }
/*-2-

    Массив из строчек в обратном порядке

1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.*/

    public static void descArrayOrder(String[] args) throws IOException {
      /*  Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[10];
        System.out.println("Fill up 8 raws: ");
        for (int i = 0; i < 8; i++) {
            array[i] = reader.readLine();
        }
        //for (int i = 0; i < 8; i++) array[i] = reader.readLine();
        System.out.println(array);
    }

}
