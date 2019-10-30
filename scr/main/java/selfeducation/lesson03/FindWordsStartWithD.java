package selfeducation.lesson03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class FindWordsStartWithD {
/*    1) Напишите программу, которая:
         - считывает строку
	     - выводит исходную строку
	     - выводит количество и список слов, которые начинаются на букву 'd'*/

    public static void getWordsStartingWithD() throws IOException {
        System.out.println("The program outputs the number of words that begin with 'd' letter:");
        System.out.println("Enter phrase or random words: ");
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        //String[] arrayGetWordsStartingWithD =
        List<java.lang.String> separateWords = new ArrayList<>();
        java.lang.String w = reader.readLine();
        separateWords.add(w);
        for (int i = 0; i < separateWords.size(); i++) {
            //separateWords.add(w);
            System.out.println(separateWords.get(i));
        }
        //return getWords;
    }
}
