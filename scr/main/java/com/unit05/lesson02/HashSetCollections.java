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

    public static void catsMapRandomFill() {
        System.out.println("================================================================================");
        System.out.println("Task 5.2.3:");
        CatRandom myobj1;
        Map<CatRandom, Random> cats = new HashMap<>();
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
            myobj1 = new CatRandom(random);
            cats.put(myobj1, random);
        }

        System.out.println("Cats output:");
        for (Map.Entry<CatRandom, Random> pair : cats.entrySet())
            System.out.println(pair.getKey() + " - " + pair.getValue());

        System.out.println(Collections.singletonList(cats.toString()));

        System.out.println(cats.toString());
    }

    public static void catsMapManualFill() {
        System.out.println("================================================================================");
        System.out.println("Task 5.2.3:");
        Map<String, Cat> cats = new HashMap<>();
        cats.put("Grey", new Cat("Barsic"));
        cats.put("Smoke", new Cat("Timka"));
        cats.put("Blue", new Cat("Bro"));
        cats.put("White", new Cat("Fary"));
        cats.put("Orange", new Cat("Paul"));
        cats.put("Yellow", new Cat("Murrr"));
        cats.put("Green", new Cat("Dough"));
        cats.put("Purple", new Cat("Chilly"));
        cats.put("Ninth", new Cat("Pitt"));
        cats.put("Pink ", new Cat("Captain"));

/*        System.out.println("Cats test output:");
        for(String colour : cats.keySet()){
            System.out.print(colour + " - ");
            for (Cat cat : cats.values()){
                System.out.println(cat);
            }
        }*/

        System.out.println("Cats output when cat name is a value:");
        for (Map.Entry<String, Cat> pair : cats.entrySet())
            System.out.println(pair.getKey() + " - " + pair.getValue());

        Map<Cat, String> catsKeyIsName = new HashMap<>();
        catsKeyIsName.put(new Cat("Barsic"), "Grey");
        catsKeyIsName.put(new Cat("Timka"), "Smoke");
        catsKeyIsName.put(new Cat("Bro"), "Blue");
        catsKeyIsName.put(new Cat("Fary"), "White");
        catsKeyIsName.put(new Cat("Paul"), "Orange");
        catsKeyIsName.put(new Cat("Murrr"), "Yellow");
        catsKeyIsName.put(new Cat("Dough"), "Green");
        catsKeyIsName.put(new Cat("Chilly"), "Purple");
        catsKeyIsName.put(new Cat("Pitt"), "Ninth");
        catsKeyIsName.put(new Cat("Captain"), "Pink ");

        System.out.println("");
        System.out.println("Cats output when cat name is a key:");
        for (Map.Entry<Cat, String> pair : catsKeyIsName.entrySet())
            System.out.println(pair.getKey() + " - " + pair.getValue());
    }

    /* 5.2.4 Вывести на экран список ключей
    Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
    Вывести на экран список ключей, каждый элемент с новой строки.*/

    public static void collectionKeysOutput() {
        System.out.println("================================================================================");
        System.out.println("Task 5.2.4:");

        Map<String, String> collectionKeysOutput = new HashMap<>();
        collectionKeysOutput.put("Nusha", "Siamese");
        collectionKeysOutput.put("Barsik", "Maine Coon");
        collectionKeysOutput.put("Leyla", "Australian Mist");
        collectionKeysOutput.put("Murzik", "Bengali");
        collectionKeysOutput.put("Anfisa", "Balinese");
        collectionKeysOutput.put("Vitamin", "Little bambino");
        collectionKeysOutput.put("Pushistic", "British Semi-longhair");
        collectionKeysOutput.put("Island", "California Spangled");
        collectionKeysOutput.put("", "");
        collectionKeysOutput.put("Milka", "Devon Rex");

        System.out.println("");
        System.out.println("Keys list: ");
        for (String key : collectionKeysOutput.keySet())
            System.out.println(key);
    }

    /* 5.2.5 Вывести на экран список значений
    Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
    Вывести на экран список значений, каждый элемент с новой строки.*/

    public static void collectionValuesOutput() {
        System.out.println("================================================================================");
        System.out.println("Task 5.2.5:");
        Map<String, String> collectionValuesOutput = new HashMap<>();
        collectionValuesOutput.put("Nusha", "Siamese");
        collectionValuesOutput.put("Barsik", "Maine Coon");
        collectionValuesOutput.put("Leyla", "Australian Mist");
        collectionValuesOutput.put("Murzik", "Bengali");
        collectionValuesOutput.put("Anfisa", "Balinese");
        collectionValuesOutput.put("Vitamin", "Little bambino");
        collectionValuesOutput.put("Pushistic", "British Semi-longhair");
        collectionValuesOutput.put("Island", "California Spangled");
        collectionValuesOutput.put("", "");
        collectionValuesOutput.put("Milka", "Devon Rex");

        System.out.println("");
        System.out.println("Values list:");
        for (String value : collectionValuesOutput.values())
            System.out.println(value);
    }

    /* 5.2.6 Коллекция HashMap из Object
    Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
    Вывести содержимое коллекции на экран, каждый элемент с новой строки.
    Пример вывода (тут показана только одна строка):
    Sim - 5*/

    public static void collectionObjectValue() {
        System.out.println("================================================================================");
        System.out.println("Task 5.2.6:");

        Map<String, Object> collectionObjectValue = new HashMap<>();
        collectionObjectValue.put("System", 8979);
        collectionObjectValue.put("Second", "String");
        collectionObjectValue.put("Third", 9870897.9080);
        collectionObjectValue.put("Destiny", 98327049328704987.9038);
        collectionObjectValue.put("Birthday", "On Baly");
        collectionObjectValue.put("Male", 8979);
        collectionObjectValue.put("FemALE", "String");
        collectionObjectValue.put("Eighth", 9870897.9080);
        collectionObjectValue.put("Major", 98327049328704987.9038);
        collectionObjectValue.put("Ukraine", null);

        System.out.println("Collection with Object type values output:");
        for (Map.Entry<String, Object> pair : collectionObjectValue.entrySet())
            System.out.println(pair.getKey() + " - " + pair.getValue());
    }

    /* 5.2.7 5 различных строчек в списке
    1. Создай список строк.
    2. Добавь в него 5 различных строчек.
    3. Выведи его размер на экран.
    4. Используя цикл, выведи его содержимое на экран, каждое значение с новой строки*/

    public static void someList() {
        System.out.println("================================================================================");
        System.out.println("Task 5.2.7:");

        List<String> someStrings = new ArrayList<>();
        someStrings.add("First string");
        someStrings.add("Second string");
        someStrings.add("Third string");
        someStrings.add("Fourth string");
        someStrings.add("Fifth string");

        System.out.println("The arrayList contains " + someStrings.size() + " strings:");
        for (int i = 0; i < someStrings.size(); i++) {
            System.out.println(someStrings.get(i));
        }
        System.out.println("Second output option:");
        for (String x : someStrings) System.out.println(x);
    }

    /*8. Самая длинная строка
    1. Создай список строк.
    2. Считай с клавиатуры 5 строк и добавь в список.
    3. Используя цикл, найди самую длинную строку в списке.
    4. Выведи найденную строку на экран.
    5. Если таких строк несколько, выведи каждую с новой строки.*/
    public static void longestString() {
        System.out.println("================================================================================");
        System.out.println("Task 5.2.8:");
        List<String> writeStrings = new ArrayList<String>() {{
            add("First element");
            add("Second element");
            add("Third element");
        }};
        writeStrings.add("Fourth element");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 strings: ");

        for (int i = 0; i < 5; i++) {
            String name = scanner.nextLine();
            writeStrings.add(name);
        }
        //System.out.println("Test output: " + Arrays.asList(writeStrings));

        int max = 0;
        int idx = -1;
        for (int i = 0; i < writeStrings.size(); i++) {

            int l = writeStrings.get(i).length();
            if (l > max) { max = l;
            idx = i;}
        }
        System.out.println("The first longest string is:");
        System.out.println(writeStrings.get(idx));
        //System.out.println(max);

        for (String s : writeStrings)
            if (s.length() == max) System.out.println("The longest string is: " + s);
    }

    /*9. Самая короткая строка
    1. Создай список строк.
    2. Считай с клавиатуры 5 строк и добавь в список.
    3. Используя цикл, найди самую короткую строку в списке.
    4. Выведи найденную строку на экран.
    5. Если таких строк несколько, выведи каждую с новой строки*/
    public static void shortestString() {
        System.out.println("================================================================================");
        System.out.println("Task 5.2.9:");
        List<String> shortestString = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 strings:");
        for (int i = 0; i < 5; i++) {
            String s = scanner.nextLine();
            shortestString.add(s);
        }

        int min = 1000000;
        for (int i = 0; i < shortestString.size(); i++) {
            if (shortestString.get(i).length() < min) min = shortestString.get(i).length();
        }
        //System.out.println("Minimum lenth is: " + min);

        for (String t : shortestString)
            if (t.length() == min) System.out.println("The shortest element is: " + t);
    }

    /*10. 10 строчек в начало списка
    1. Создай список строк в методе main.
    2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
    3. Используя цикл, выведи содержимое на экран, каждое значение с новой строки.*/
    public static void addtoBeginning(List<String> addToBeginningList) {
        System.out.println("================================================================================");
        System.out.println("Task 5.2.10:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 strings:");
        for (int i = 0; i < 10; i++) {
            addToBeginningList.add(0,scanner.nextLine());
        }
        System.out.println("List output: ");
        for (String s : addToBeginningList) System.out.println(s);
    }
    /*11. Удали последнюю строку и вставь её в начало
    1. Создай список строк.
    2. Добавь в него 5 строчек с клавиатуры.
    3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
    4. Используя цикл, выведи содержимое на экран, каждое значение с новой строки*/
     public static void cutAndPastString() {
         System.out.println("================================================================================");
         System.out.println("Task 5.2.11:");
         List<String> cutAndPastString = new ArrayList<>();
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter 5 strings:");
         for (int i = 0; i < 5; i++) {
             cutAndPastString.add(scanner.nextLine());
         }

     }

}
