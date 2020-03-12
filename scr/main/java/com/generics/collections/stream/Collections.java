package com.generics.collections.stream;


import java.io.IOException;
import java.util.*;

/*1. HashSet из растений
        Создать коллекцию HashSet с типом элементов String.
        Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
        Вывести содержимое коллекции на экран, каждый элемент с новой строки.
        Посмотреть, как изменился порядок добавленных элементов.*/

public class Collections {

/*    3. Коллекция HashMap из котов
    Есть класс Cat, с полем имя (name, String).
    Создать коллекцию HashMap<String, Cat>.
    Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
    Вывести результат на экран, каждый элемент с новой строки.*/
    public static void addCat() {
        HashMap<java.lang.String, java.lang.String> mapCats= new HashMap<>();
        mapCats.put("Nusha", "Siamese");
        mapCats.put("Barsik", "Maine Coon");
        mapCats.put("Leyla", "Australian Mist");
        mapCats.put("Murzik", "Bengali");
        mapCats.put("Anfisa", "Balinese");
        mapCats.put("Vitamin", "Little bambino");
        mapCats.put("Pushistic", "British Semi-longhair");
        mapCats.put("Island", "California Spangled");
        mapCats.put("", "");
        mapCats.put("Milka", "Devon Rex");
        Iterator<Map.Entry<java.lang.String, java.lang.String>> iterator = mapCats.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<java.lang.String, java.lang.String> pair = iterator.next();
            java.lang.String key = pair.getKey();
            java.lang.String value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
}