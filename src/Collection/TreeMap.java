package Collection;
import java.util.Comparator;
import java.util.SortedMap;

public class TreeMap {
    public static void main(String[] args) {
        SortedMap<Integer, String> treeMap = new java.util.TreeMap<>();
        treeMap.put(3,"val");
        treeMap.put(2,"val");
        treeMap.put(1,"value");
        treeMap.put(5,"asd");
        treeMap.put(8,"asd");
        treeMap.put(7,"asd");
        System.out.println(treeMap);

        System.out.println("treeMap.headMap(5) = " + treeMap.headMap(5));

        System.out.println("treeMap.tailMap(5) = " + treeMap.tailMap(5));
        java.util.TreeMap<Integer, String> treeMap1 = new java.util.TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
              //  Integer.compare(o1, o2);
                if (o1 < o2) {
                    return -1;
                } else if (o1 > o2) {
                    return 1;
                }
                return 0;
            }
        });

        treeMap1.put(3,"val");
        treeMap1.put(2,"val");
        treeMap1.put(1,"value");
        treeMap1.put(5,"asd");
        treeMap1.put(8,"asd");
        treeMap1.put(7,"asd");

        System.out.println(treeMap1);

        System.out.println("////////////////////////////");

        java.util.TreeMap<Employee, String> employeeStringTreeMap = new java.util.TreeMap<>();
        Employee employee1 = new Employee(1, "Oleksander");
        Employee employee2 = new Employee(5,"Andrew");
        Employee employee3 = new Employee(3,"Ivan");
        employeeStringTreeMap.put(employee1, "Ukraine");
        employeeStringTreeMap.put(employee2, "Ukraine");
        employeeStringTreeMap.put(employee3, "Ukraine");
        System.out.println(employeeStringTreeMap);
        System.out.println("///");
        System.out.println("employeeStringTreeMap.headMap(employee3) = " + employeeStringTreeMap.headMap(employee3));
        System.out.println("///");
        System.out.println("employeeStringTreeMap.headMap(employee3) = " + employeeStringTreeMap.tailMap(employee3));


    }
}
