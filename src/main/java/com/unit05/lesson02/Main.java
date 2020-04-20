package com.unit05.lesson02;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        /* 5.2.1 HashSet из растений
//        Создать коллекцию HashSet с типом элементов String.
//        Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
//        Вывести содержимое коллекции на экран, каждый элемент с новой строки.
//        Посмотреть, как изменился порядок добавленных элементов.*/
//        HashSetCollections.fruits();
//
//        /* 5.2.2 HashMap из 10 пар
//        Создать коллекцию HashMap<String, String>, занести туда 10 пар строк: арбуз – ягода, банан – трава, вишня – ягода,
//        груша – фрукт, дыня – овощ, ежевика – куст, жень-шень – корень, земляника – ягода, ирис – цветок, картофель – клубень.
//        Вывести содержимое коллекции на экран, каждый элемент с новой строки.
//        Пример вывода (тут показана только одна строка):
//        картофель – клубень*/
//        HashSetCollections.fruitsCategories();
//
        /* 5.2.3 Коллекция HashMap из котов
        Есть класс Cat, с полем имя (name, String).
        Создать коллекцию HashMap<String, Cat>.
        Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
        Вывести результат на экран, каждый элемент с новой строки.*/
        HashSetCollections.catsMapManualFill();
//
//        /* 5.2.4 Вывести на экран список ключей
//        Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
//        Вывести на экран список ключей, каждый элемент с новой строки.*/
//        HashSetCollections.collectionKeysOutput();
//
//        /* 5.2.5 Вывести на экран список значений
//        Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
//        Вывести на экран список значений, каждый элемент с новой строки.*/
//        HashSetCollections.collectionValuesOutput();//
//
//        /* 5.2.6 Коллекция HashMap из Object
//        Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
//        Вывести содержимое коллекции на экран, каждый элемент с новой строки.
//        Пример вывода (тут показана только одна строка):
//        Sim - 5*/
//        HashSetCollections.collectionObjectValue();
//
//        /* 5.2.7 5 различных строчек в списке
//        1. Создай список строк.
//        2. Добавь в него 5 различных строчек.
//        3. Выведи его размер на экран.
//        4. Используя цикл, выведи его содержимое на экран, каждое значение с новой строки*/
//        HashSetCollections.someList();

        /* 5.2.8 Самая длинная строка
        1. Создай список строк.
        2. Считай с клавиатуры 5 строк и добавь в список.
        3. Используя цикл, найди самую длинную строку в списке.
        4. Выведи найденную строку на экран.
        5. Если таких строк несколько, выведи каждую с новой строки.*/
        //HashSetCollections.longestString();

        /* 5.2.9 Самая короткая строка
        1. Создай список строк.
        2. Считай с клавиатуры 5 строк и добавь в список.
        3. Используя цикл, найди самую короткую строку в списке.
        4. Выведи найденную строку на экран.
        5. Если таких строк несколько, выведи каждую с новой строки*/
        //HashSetCollections.shortestString();

        /* 5.2.10 10 строчек в начало списка
        1. Создай список строк в методе main.
        2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
        3. Используя цикл, выведи содержимое на экран, каждое значение с новой строки.*/
        //List<String> addToBeginningList = new ArrayList<>();
        //HashSetCollections.addtoBeginning(addToBeginningList);

        /*5.2.11 Удали последнюю строку и вставь её в начало
        1. Создай список строк.
        2. Добавь в него 5 строчек с клавиатуры.
        3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
        4. Используя цикл, выведи содержимое на экран, каждое значение с новой строки*/
        //HashSetCollections.cutAndPastString();

        /* 5.2.12 Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».*/
        //HashSetCollections.fillUpSetOfWordsFromL();

        /* 5.2.13 Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
        Удалить из множества все числа больше 10.*/
        //HashSetCollections.filterSetOfRandomNumbers();

        /* 5.2.14 Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
        Проверить сколько людей имеют совпадающие с заданным имя или фамилию.*/
        //HashSetCollections.checkMapOfNamesAndSurnames();

        /* 5.2.15 Создать словарь (Map<String, LocalDate>) и занести в него десять записей по принципу:
        «фамилия» - «дата рождения». Удалить из словаря всех людей, родившихся летом */
        HashSetCollections.deleteSummerDatesFromMap();

        /* 5.2.16 Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
        Удалить людей, имеющих одинаковые имена. */
        Map<String, String> myMap1 = HashSetCollections.createMap();
        HashSetCollections.removeEntriesWithSimilarNamesOption1(myMap1);
        Map<String, String> myMap2 = HashSetCollections.createMap();
        HashSetCollections.removeEntriesWithSimilarNamesOption2(myMap2);
        Map<String, String> myMap3 = HashSetCollections.createMap();
        HashSetCollections.removeEntriesWithSimilarNamesOption3(myMap3);
        Map<String, String> myMap4 = HashSetCollections.createMap();
        HashSetCollections.removeEntriesWithSimilarNamesOption4(myMap4); //This is just self education, not for reviewing

        /* 5.2.17
        1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
        2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
        3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями. Обратить внимание на количество записей в получившейся коллекции.
        4. Вывести содержимое Map на экран. */
        //HashSetCollections.createMapWithSimilarLastnamesAndNames();
    }
}