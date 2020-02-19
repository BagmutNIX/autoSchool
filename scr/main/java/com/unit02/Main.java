package com.unit02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {
    public static void main(String[] args) throws IOException {
        /*2.3.1 В переменных q и w хранятся два натуральных числа. Создайте программу,
        выводящую на экран результат деления q на w с остатком.
        Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке*/
        TypeConversion.restOfDividing();

        /*2.3.2 В переменной n хранится натуральное двузначное число. Создайте программу,
        вычисляющую и выводящую на экран сумму цифр числа n.*/
        TypeConversion.sumOfDigits();

        /*2.3.3 В переменной n хранится вещественное число с ненулевой дробной частью.
        Создайте программу, округляющую
        число n до ближайшего целого и выводящую результат на экран.*/
        TypeConversion.roundNum();

        /*2.3.4 Даны три переменные a, b и c. Изменить значения этих переменных так, чтобы в a хранилось значение a+b,
        в b хранилась разность старых значений c−a, а в c хранилось сумма старых значений a+b+c.
        Например, a=0, b=2, c=5, тогда новые значения a=2, b=5 и c=7.*/
        TypeConversion.changeValueOption1();

        /*2.3.4 - 2й способ, ввод с клавиатуры */
        System.out.println("================================================================================");
        System.out.println("enter xyz");
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        int x = reader.read();
        int y = reader.read();
        int z = reader.read();
        System.out.println(x + y + z);
        TypeConversion.changeValueOption2(x, y, z);

        /*2.4.1 Дана строка. Вывести первый, последний и средний (если он есть) символы.
        Напишите программу, которая выводит часть строки до первой встреченной точки,
        включая точку. Также предусмотрите вывод количества пробелов.*/
        ReferenceTypesAndString.showSymbol();

        /*2.4.2 Найти в строке указанную подстроку и заменить ее на новую.
        Строку, ее подстроку для замены и новую подстроку вводит пользователь.*/
        ReferenceTypesAndString.changeSubstr();

        /*2.4.3 Вводится строка слов, разделенных пробелами.
        Найти самое длинное слово и вывести его на экран.
        Случай, когда самых длинных слов может быть несколько, не обрабатывать.*/
        ReferenceTypesAndString.longestWord();

        /* 2.5.1 Максимальное среди массива на 20 чисел
        1. В методе initializeArray():
        1.1. Создайте массив на 20 чисел
        1.2. Считайте с консоли 20 чисел и заполните ими массив
        2. Метод max(int[] array) должен находить максимальное число из элементов массива*/
        Arrays.maxNumInArray();

    }
}
