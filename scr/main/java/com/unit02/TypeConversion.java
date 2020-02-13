
package com.unit02;

import java.util.Scanner;

public class TypeConversion {

    /*1 В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую на экран результат деления q на w с остатком.
    Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке*/
    public static void restOfDividing() {

 /* int q = 21;
    int w = 8;
    int x;*/
        Scanner input = new Scanner(System.in);
        int q, w, x;
        System.out.print("Enter q: ");
        q = input.nextInt();
        System.out.print("Enter w: ");
        w = input.nextInt();
        x = q % w;
        System.out.print("Result is " + x);
    }

    /*2 В переменной n хранится натуральное двузначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.*/
    public static void sumOfDigits() {
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
        //return sum;
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

    /*3 В переменной n хранится вещественное число с ненулевой дробной частью. Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.*/
    public static void roundNum() {
        Scanner numToRound = new Scanner(System.in);
        System.out.print("Enter n: ");
        float n = numToRound.nextFloat();
        System.out.print("Round result is: " + Math.round(n));
    }
}
