package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(1000);
        list.add("First");
        list.add("Second");
        list.add("Third");
        System.out.println("list = " + list);

        list.trimToSize();

        list.add(0, "First\"2\"");
        System.out.println("list = " + list);
        Collections.sort(list);
        System.out.println("list = " + list);
        System.out.println("list.get(2) = " + list.get(2));
        System.out.println("list.subList(0,2) = " + list.subList(0, 3));

    }
}
