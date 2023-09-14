package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("First");
        collection.add("Second");
        collection.add("Third");

        print(collection);
        System.out.println("collection size " + collection.size()); // 3

        System.out.println("/////////////////////////////////");

        print2(collection);
        System.out.println("Size before clearing " + collection.size()); // 0


    }

    private static void print(Collection<String> collection) {
        for ( String element : collection) {
            System.out.println(element);
        }
    }

    private static void print2(Collection<String> collection) {
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
    }
}
