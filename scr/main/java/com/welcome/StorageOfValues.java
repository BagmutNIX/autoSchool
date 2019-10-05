package com.welcome;

/*Даны три переменные a, b и c. Изменить значения этих переменных так, чтобы в a хранилось значение a+b,
в b хранилась разность старых значений c−a, а в c хранилось сумма старых значений a+b+c. Например, a=0, b=2, c=5,
тогда новые значения a=2, b=5 и c=7.*/
public class StorageOfValues {
    public static void main(String[] args) {
        int a, b, c;
        a = 0;
        b = 2;
        c = 5;
        c = a + b + c;
        a = a + b;
        b = c - a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);


    }
}
