package com.unit05.lesson02;

import java.util.HashSet;
import java.util.Set;

public class HashSetCollections {
    public static void fruits() {
        Set<String> fruits = new HashSet<>();
        fruits.add("plump");
        fruits.add("apple");

        System.out.println("Simple output: ");
        System.out.println(fruits);

        System.out.println("Output through the cycle: ");
        for (String text : fruits) {
            System.out.println(text);
        }
    }
}
