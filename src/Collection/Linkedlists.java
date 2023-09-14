package Collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Linkedlists {
    public static void main(String[] args) {
//        Deque<String> deque = new LinkedList<>();
//        deque.add("Hello");
//        List<String> list = new LinkedList<>(deque);
//        System.out.println("list = " + list);

        List<String> classB = new LinkedList<>();
        classB.add("Alex");
        classB.add("Oleg");
        List<String> classA = new LinkedList<>();
        classA.add("Ivan");
        classA.add("Sergey");
        classA.add("Alexander");
        classA.addAll(0,classB);
        System.out.println(classA);
        System.out.println("----------------");
        classA.remove("Ivan");
        classA.remove(1);
        classA.remove(2);
        System.out.println(classA);
    }
}
