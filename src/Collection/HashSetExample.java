package Collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("England");
        set.add("Ukraine");
        set.add("Ukraine");
        set.add("Ukraine");
        set.add("Ukraine"); // одинаковые элементы не дублируются!!!
        set.add(null);
        System.out.println("set = " + set);
        System.out.println("set.contains(\"Ukraine\") = " + set.contains("Ukraine"));
    }
}
