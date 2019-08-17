package com.welcome;

import java.io.*;
import java.util.Random;

public class Conditions_Cycles {
    //1) Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
    public static void minimum() throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader readerA = new BufferedReader(r);
        System.out.println("Enter first number: ");
        int a = readerA.read();
        Reader s = new InputStreamReader(System.in);
        BufferedReader readerB = new BufferedReader(s);
        System.out.println("Enter second number: ");

        int b = readerB.read();

        if (a < b) {
            System.out.println("Minimum is first number");
        } else {
            System.out.println("Minimum is second number");
        }
    }

    //2) Ввести с клавиатуры четыре числа, и вывести минимальное из них. Использую сохранение значений в переменные и if-else:
    public static void minimumFromFourth() throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader readerA = new BufferedReader(r);
        System.out.print("Enter a: ");
        int a = Integer.parseInt(readerA.readLine());
        ;
        Reader s = new InputStreamReader(System.in);
        BufferedReader readerB = new BufferedReader(s);
        System.out.print("Enter b: ");
        int b = Integer.parseInt(readerB.readLine());
        Reader t = new InputStreamReader(System.in);
        BufferedReader readerC = new BufferedReader(t);
        System.out.print("Enter c: ");
        int c = Integer.parseInt(readerC.readLine());
        Reader u = new InputStreamReader(System.in);
        BufferedReader readerD = new BufferedReader(u);
        System.out.print("Enter d: ");
        int d = Integer.parseInt(readerD.readLine());
        if (a < b && a < c && a < d) {
            System.out.println("Minimum is a");
        } else if (b < a && b < c && b < d)
            System.out.println("Minimum is b");
        else if (c < a && c < b && c < d)
            System.out.println("Minimum is c");
        else System.out.println("Minimun is d");
    }

    //2) Ввести с клавиатуры четыре числа, и вывести максимальное из них. Использую массив и 2 цикла:
    public static void maxFromFourNum() throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        System.out.println("Enter num: ");
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

    //2) Ввести с клавиатуры четыре числа, и вывести максимальное из них. Использую массив и if-else:
    public static void maxFromFourNumOption2() throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        System.out.println("Enter 4 numbers: ");
        int[] light = new int[4];
        for (int i = 0; i < light.length; i++) {
            light[i] = Integer.parseInt(reader.readLine());
        }
        if (light[0] > light[1] && light[0] > light[2] && light[0] > light[3])
            System.out.println("Maximum is: " + light[0]);
        else if (light[1] > light[0] && light[1] > light[2] && light[1] > light[3])
            System.out.println("Maximum is: " + light[1]);
        else if (light[2] > light[0] && light[2] > light[1] && light[2] > light[3])
            System.out.println("Maximum is: " + light[2]);
        else System.out.println("Maximum is: " + light[3]);
    }

    //3) Ввести с клавиатуры три числа, и вывести их в порядке убывания.
    public static void threeNumbers() throws IOException {
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
        for (int i = 0; i < 7; i++) {
            System.out.println("Программа загадала тебе число от 1 до 20ти. Попробуй его угадать: ");
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
}

