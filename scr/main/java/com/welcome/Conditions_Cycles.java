package com.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Conditions_Cycles {
    //1 Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
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
}
