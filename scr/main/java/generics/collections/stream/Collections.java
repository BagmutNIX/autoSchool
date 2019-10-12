package generics.collections.stream;


import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collections {
    public static void hashSetCollection() throws IOException {
        Set<java.lang.String> set = new HashSet<>();
        set.add("Melon");
        set.add("Banana");
        set.add("Cherry");
        Iterator<java.lang.String> iterator = set.iterator();
        java.lang.String text = iterator.next();
        System.out.println(text);

    }
}
