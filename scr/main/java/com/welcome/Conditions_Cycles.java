package com.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Collections;

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

    //2) Ввести с клавиатуры четыре числа, и вывести минимальное из них.
    public static void minimumFromFourth() throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader readerA = new BufferedReader(r);
        System.out.print("Enter a: ");
        int a = readerA.read();
        Reader s = new InputStreamReader(System.in);
        BufferedReader readerB = new BufferedReader(s);
        System.out.print("Enter b: ");
        int b = readerB.read();
        Reader t = new InputStreamReader(System.in);
        BufferedReader readerC = new BufferedReader(t);
        System.out.print("Enter c: ");
        int c = readerC.read();
        Reader u = new InputStreamReader(System.in);
        BufferedReader readerD = new BufferedReader(u);
        System.out.print("Enter d: ");
        int d = readerD.read();
        if (a < b && a < c && a < d) {
            System.out.println("Minimum is a");
        } else if (b < a && b < c && b < d)
            System.out.println("Minimum is b");
        else if (c < a && c < b && c < d)
            System.out.println("Minimum is c");
        else System.out.println("Minimun is d");
    }

    //2) Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
            array[j] > largest[];

        }
        System.out.println("Maximum is: " + largest);
    }
//3) Ввести с клавиатуры три числа, и вывести их в порядке убывания.
/*    public static void threeNumbers() throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader readerA = new BufferedReader(r);
        System.out.println("Enter first number: ");
        int a = readerA.read();
        Reader s = new InputStreamReader(System.in);
        BufferedReader readerB = new BufferedReader(s);
        System.out.println("Enter first number: ");
        int b = readerB.read();
        Reader t = new InputStreamReader(System.in);
        BufferedReader readerC = new BufferedReader(t);
        System.out.println("Enter first number: ");
        int c = readerC.read();

        if (c < b && b < a) {
            System.out.println(a + ", " + b + ", " + c);
            else{
                if (b < c && c < a) {
                    System.out.println(a + ", " + c + ", " + b);
                } else {
                    if (a < b && b < c) {
                        System.out.println(a + ", " + c + ", " + b);
                    }
                }
            }
        }

    }*/
}

