package com.basic;

import java.util.Scanner;

public class TypeConversion {

    public static void main(String[] args) {
 /*   int q = 21;
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
}
