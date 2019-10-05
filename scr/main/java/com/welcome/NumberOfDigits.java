package com.welcome;/*В переменной n хранится натуральное двузначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.*/

import java.util.Scanner;

public class NumberOfDigits {
    public static int countDigits() {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = number.nextInt();
        String str = Integer.toString(n);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int x = Character.getNumericValue(ch);
            sum += x;
        }
        System.out.println("Amount is: " + sum);
        System.out.println("Quantity is: " + str.length());
        return sum;
/*      int l = 0;
        if (n < 100) {
            if (n < 10) {
                l = 1;
            } else {
                l = 2;
            }
        } else {
            l = 3;
        }
        System.out.println(l);
        return l;*/
    }
}

