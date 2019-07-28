package com.welcome;

import java.util.Scanner;

public class Hello {

    public static void printHelloName() {
        System.out.println("What is your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(String.format("Hello %s", name));
        System.out.println(String.format("Bye %s", name));
    }

    public static void main (String[] args) {
        System.out.println("Hello, World!");
        printHelloName();
    }
}