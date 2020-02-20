package com.unit02.lesson6;

import java.io.*;
import java.util.Random;

public class ConditionsAndCycles {
    //2.6.1 Ввести с клавиатуры два числа, и вывести на экран минимальное из них
    public static void minimum() throws IOException {
        System.out.println("================================================================================");
        System.out.println("Task 2.6.1:");
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

        System.out.println("Enter first number: ");
        int a = reader.read();
        System.out.println("Enter second number: ");
        int b = reader.read();

        if (a < b) {
            System.out.println("Minimum is first number");
        } else {
            System.out.println("Minimum is second number");
        }
    }

    //2.6.2 Ввести с клавиатуры четыре числа, и вывести максимальное из них
    public static void maxFromFourNum() throws IOException {
        System.out.println("================================================================================");
        System.out.println("Task 2.6.2:");
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        //System.out.println("Enter num: ");
        int[] array = new int[4];
        System.out.println("Please enter 4 numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        int largest = 0;
        for (int j = 0; j < array.length; j++) {
            if (largest < array[j]) largest = array[j];
        }
        System.out.println("Maximum is: " + largest);
    }

    //2.6.3 Ввести с клавиатуры три числа, и вывести их в порядке убывания.
    public static void threeNumbers() throws IOException {
        System.out.println("================================================================================");
        System.out.println("Task 2.6.3:");
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        System.out.println("Enter three numbers: ");
        int[] descArray = new int[3];
        for (int i = 0; i < descArray.length; i++) {
            descArray[i] = Integer.parseInt(reader.readLine());
        }
        if (descArray[0] < descArray[1] && descArray[0] < descArray[2]) {
            if (descArray[1] < descArray[2])
                System.out.println("The sequence is: " + descArray[2] + ", " + descArray[1] + ", " + descArray[0]);
            else
                System.out.println("The sequence is: " + descArray[1] + ", " + descArray[2] + ", " + descArray[0]);
        }
        if (descArray[1] < descArray[0] && descArray[1] < descArray[2]) {
            if (descArray[0] > descArray[2])
                System.out.println("The sequence is: " + descArray[0] + ", " + descArray[2] + ", " + descArray[1]);
            else System.out.println("The sequence is: " + descArray[2] + ", " + descArray[0] + ", " + descArray[1]);
        }
        if (descArray[2] < descArray[0] && descArray[2] < descArray[1]) {
            if (descArray[0] > descArray[1])
                System.out.println("The sequence is: " + descArray[0] + ", " + descArray[1] + ", " + descArray[2]);
            else
                System.out.println("The sequence is: " + descArray[1] + ", " + descArray[0] + ", " + descArray[2]);
        }
    }

    //4 Ввести с клавиатуры два имени, и если имена одинаковые, вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
    public static void theSameNames() throws IOException {
        System.out.println("================================================================================");
        System.out.println("Task 2.6.6:");
        System.out.println("Enter first name: ");
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader1 = new BufferedReader(inputStreamReader);
        String name1 = bufferedReader1.readLine();
        System.out.println("Enter second name: ");
        //BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
        String name2 = bufferedReader1.readLine();
        //System.out.println("You entered: " + name1 + ", " + name2);
/*        int numName1 = Integer.parseInt(name1);
        System.out.println(numName1);*/
        if (name1.toUpperCase().equals(name2.toUpperCase())) System.out.println("Имена идентичные");
        else if (name1.length() == name2.length()) System.out.println("У имён равны длины");
        else System.out.println("Они разные");
    }

    //5-6 Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще». Если возраст больше 20 вывести надпись «И 18-ти достаточно»
    public static void youAreTooYang() throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        System.out.println("What's your name? ");
        String name = reader.readLine();
        System.out.println("Hi, " + name);
        System.out.println("How old are you? ");
        String age = reader.readLine();
        int numAge = Integer.parseInt(age);
        //int numAge = Integer.parseInt(String.valueOf(reader2));
        if (numAge < 18) System.out.println(name + ", подрасти еще");
        else if (numAge > 20) System.out.println("И 18-ти достаточно");
    }

    //7 За семь попыток угадать число. При каждой попытке вам будет выводиться сообщение - "Мало" или "Много". Если угадаете, уложившись в семь попыток, то выводится сообщение "Угадал :)"
    // и программа завершает работу. Если по истечении 7 попыток число не угадывается, то выводится сообщение "Не угадал :(" и завершается работа.
    public static void guessNum() throws IOException {
        Random random = new Random();
        int secret;
        // Генерируем число от 0 до 20
        secret = random.nextInt(20 + 1);
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        System.out.println("Программа загадала тебе число от 1 до 20ти. Попробуй его угадать: ");
        for (int i = 0; i < 7; i++) {
            int number = Integer.parseInt(reader.readLine());
            //int number = Integer.parseInt(reader.readLine());
            if (number < secret) System.out.println("Мало");
            else if (number > secret) System.out.println("Много");
            else System.out.println("Бро, ты угадал!");
        }
    }

    //8-9 Вывести на экран числа от 1 до 10, используя цикл while. Вывести на экран числа от 10 до 1, используя цикл while.
    public static void numFrom1to10() {
        System.out.println("Сначала по возрастанию: ");
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("А теперь по убыванию: ");
        int j = 10;
        while (j >= 1) {
            System.out.println(j);
            j--;
        }
    }

    /*  10 Ввести с клавиатуры строку и число N. Вывести на экран строку N раз, используя цикл while.
        Пример ввода:
        абв
        2
        Пример вывода:
        абв
        абв*/
    public static void sentenceOutputCustomizedNumberOfTimes() throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        System.out.println("Enter sentence: ");
        String str = reader.readLine();
        System.out.println("Enter how many times would you like to repeat it: ");
        int num = Integer.parseInt(reader.readLine());
        while (num >= 1) {
            System.out.println(str);
            num--;
        }
    }

    //11 Вывести на экран квадрат из 10х10 букв S используя цикл while. Буквы в каждой строке не разделять.
    public static void tenS() {
        int i = 1;
        while (i <= 10) {
            System.out.println("SSSSSSSSSS");
            i++;
        }
    }

    public static void tenS1() throws UnsupportedEncodingException, IOException {
        int i = 0;
        while (i++ < 10) {
            int j = 0;
            while (j++ < 10)
                System.out.print("S");
            System.out.println();
        }
    }

    //12 Вывести на экран таблицу умножения 10х10 используя цикл while. Числа разделить пробелом.
    //Example output:
    //1 2 3 4  5  6  7  8  9  10
    //2 4 6 8  10 12 14 16 18 20
    //3 6 9 12 15 18 21 24 27 30
    public static void multiplicationTable() {
        int i = 0;
        while (i++ < 10) {
            //System.out.println(i + " ");
            int j = 0;
            while (j++ < 10) {
                System.out.print(i * j + " ");
            }
            j = 1;
            System.out.println();
        }
    }

    //13 Используя цикл for вывести на экран чётные числа от 1 до 100 включительно. Через пробел либо с новой строки.
    public static void evenNumbers() {
        //int i = 0;
        for (int i = 2; i <= 100; i = i + 2) {
            System.out.print(i + " ");
        }
    }

    /*14 Ввести с клавиатуры два числа m и n.
        Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
        Пример: m=2, n=4
                8888
                8888*/
    public static void rectangleFromEights() throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        System.out.println("Please enter height: ");
        int m = Integer.parseInt(reader.readLine());
        System.out.println("Please enter wide: ");
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("8");
            }
            System.out.println("");
        }
    }

    //15 Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
    //Пример:
    //8
    //88
    //888
    //...
    public static void triangle1010() {
        //int i = 10;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                for (int k = 0; k < 1; k++) System.out.print("8");
            }
            System.out.println(" ");
        }
    }

    /*    16 Используя цикл for вывести на экран:
                - горизонтальную линию из 10 восьмёрок
                - вертикальную линию из 10 восьмёрок.*/
    public static void linesFrom108() {
        for (int i = 0; i < 10; i++) {
            System.out.print("8 ");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("8");
        }
    }

    /*
        17 Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.]
        Пример текста:
        Света любит меня.
        …
    */
    public static void affirmation() throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        System.out.println("Enter lovely name: ");
        String name = reader.readLine();
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " любит меня");
        }
    }

    /* 18 Написать программу, которая ведёт обратный отсчёт с 30 до 0, и в конце выводит на экран текст «Бум!». Программа должна уменьшать число 10 раз в секунду.
    Для того чтобы вставить в программу задержку, воспользуйся функцией:
                Thread.sleep(100); //задержка на одну десятую секунды.
        Пример:
                30
                29
                …
                1
                0
        Бум!  */
    public static void countDown() throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(100);
        }
        System.out.println("Bum!");

    }
}

