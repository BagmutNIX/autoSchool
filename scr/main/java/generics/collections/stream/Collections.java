package generics.collections.stream;


import com.sun.org.apache.xpath.internal.operations.String;

import java.io.IOException;
import java.util.*;
/*1. HashSet из растений
        Создать коллекцию HashSet с типом элементов String.
        Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
        Вывести содержимое коллекции на экран, каждый элемент с новой строки.
        Посмотреть, как изменился порядок добавленных элементов.*/

public class Collections {
    public static void hashSetCollection() throws IOException {
        Set<java.lang.String> set = new HashSet<>();
        set.add("Watermelon");
        set.add("Banana");
        set.add("Cherry");
        set.add("Pear");
        set.add("melon");
        set.add("Blackberry");
        set.add("Ginseng");
        set.add("strawberry");
        set.add("Iris");
        set.add("potato");
        Iterator<java.lang.String> iterator = set.iterator();
        while (iterator.hasNext()) {
            java.lang.String text = iterator.next();
            System.out.println(text);
        }
    }

    /*    2. HashMap из 10 пар
        Создать коллекцию HashMap<String, String>, занести туда 10 пар строк: арбуз – ягода, банан – трава, вишня – ягода, груша – фрукт, дыня – овощ, ежевика – куст, жень-шень – корень, земляника – ягода, ирис – цветок, картофель – клубень.
        Вывести содержимое коллекции на экран, каждый элемент с новой строки.
                Пример вывода (тут показана только одна строка):
        картофель – клубень*/
    public static void hashMapCollection() {
        Map<java.lang.String, java.lang.String> map = new HashMap<>();
        map.put("Watermelon", "berry");
        map.put("Banana", "grass");
        map.put("Cherry", "berry");
        map.put("Pear", "fruit");
        map.put("Cucumber", "vegetable;");
        map.put("Blackberry", "bush");
        map.put("Ginseng", "root");
        map.put("Strawberry", "berry");
        map.put("Iris", "flower");
        map.put("Potato", "tuber");
        Iterator<Map.Entry<java.lang.String, java.lang.String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<java.lang.String, java.lang.String> pair = iterator.next();
            java.lang.String key = pair.getKey();
            java.lang.String value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }

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
        mapCats.put("Jamajka", "California Spangled");
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
