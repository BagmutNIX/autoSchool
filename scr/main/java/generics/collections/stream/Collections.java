package generics.collections.stream;


import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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
        set.add("potato");
        Iterator<java.lang.String> iterator = set.iterator();
        while (iterator.hasNext()) {
            java.lang.String text = iterator.next();
            System.out.println(text);
        }
    }
}
