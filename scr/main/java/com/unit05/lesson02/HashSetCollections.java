package com.unit05.lesson02;

import java.util.*;

public class HashSetCollections {

    /* 5.2.1 HashSet из растений
    Создать коллекцию HashSet с типом элементов String.
    Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
    Вывести содержимое коллекции на экран, каждый элемент с новой строки.
    Посмотреть, как изменился порядок добавленных элементов.*/
    public static void fruits() {
        System.out.println("================================================================================");
        System.out.println("Task 5.2.1:");
        Set<String> fruits = new HashSet<>();
        fruits.add("Watermelon");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Pear");
        fruits.add("melon");
        fruits.add("Blackberry");
        fruits.add("Ginseng");
        fruits.add("strawberry");
        fruits.add("Iris");
        fruits.add("potato");

  /*      System.out.println("");
        System.out.println("Simple output: ");
        System.out.println(fruits);*/

        System.out.println("");
        System.out.println("Output through cycle while:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String text = iterator.next();
            System.out.println(text);
        }

        System.out.println("");
        System.out.println("Output through cycle for: ");
        for (String text : fruits) {
            System.out.println(text);
        }
    }

    /* 5.2.2 HashMap из 10 пар
    Создать коллекцию HashMap<String, String>, занести туда 10 пар строк: арбуз – ягода, банан – трава, вишня – ягода, груша – фрукт, дыня – овощ, ежевика – куст, жень-шень – корень, земляника – ягода, ирис – цветок, картофель – клубень.
    Вывести содержимое коллекции на экран, каждый элемент с новой строки.
    Пример вывода (тут показана только одна строка):
    картофель – клубень*/
    public static void fruitsCategories() {
        System.out.println("================================================================================");
        System.out.println("Task 5.2.2:");
        Map<String, String> fruitsCategories = new HashMap<>();
        fruitsCategories.put("Watermelon", "berry");
        fruitsCategories.put("Banana", "grass");
        fruitsCategories.put("Cherry", "berry");
        fruitsCategories.put("Pear", "fruit");
        fruitsCategories.put("Cucumber", "vegetable;");
        fruitsCategories.put("Blackberry", "bush");
        fruitsCategories.put("Ginseng", "root");
        fruitsCategories.put("Strawberry", "berry");
        fruitsCategories.put("Iris", "flower");
        fruitsCategories.put("Potato", "tuber");

/*        System.out.println("");
        System.out.println("Simple output: ");
        System.out.println(fruitsCategories);*/

        System.out.println("");
        System.out.println("Output through cycle while:");
        Iterator<Map.Entry<String, String>> iterator = fruitsCategories.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }

        System.out.println("");
        System.out.println("Output through cycle for: ");
        //String key = pair.getKey();
        for (Map.Entry<String, String> pair : fruitsCategories.entrySet())
            System.out.println(pair.getKey() + " - " + pair.getValue());
    }

    /* 5.2.3 Коллекция HashMap из котов
    Есть класс Cat, с полем имя (name, String).
    Создать коллекцию HashMap<String, Cat>.
    Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
    Вывести результат на экран, каждый элемент с новой строки.*/
    public static void catsMap() {
        System.out.println("================================================================================");
        System.out.println("Task 5.2.3:");
        Cat myobj1;
        Map<Cat, Random> cats = new HashMap<>();
        //cats.put("Siamsky", myobj1);

/*        System.out.println("");
        System.out.println("Output through cycle while:");
        Iterator<Map.Entry<Random, Cat>> iterator = cats.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Random, Cat> pair = iterator.next();
            Random key = pair.getKey();
            Cat value = pair.getValue();
            System.out.println(key + " - " + value);
        }

        System.out.println("");
        System.out.println("Cats output:");
        for (Map.Entry<Random, Cat> pair : cats.entrySet())
            System.out.println(pair.getKey() + " - " + pair.getValue().toString());*/

        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            myobj1 = new Cat(random);
            cats.put(myobj1, random);
        }

        System.out.println("Cats output:");
        for (Map.Entry<Cat, Random> pair : cats.entrySet())
            System.out.println(pair.getKey().toString() + " - " + pair.getValue().toString());

        System.out.println(Arrays.asList(cats));
        System.out.println(cats);
    }
}
