package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapWithCustomKey {
    public static void main(String[] args) {
        // 1. o1.equals(o2) == o1.hashcode() == o2.hashcode()
        // o1.hashcode() == o2.hashcode() ??? o1.equals(02)
        Map<Employee, String> employeeStringMap = new HashMap<>();

        Employee employee1 = new Employee(1,"Oleksander");

        employeeStringMap.put(employee1, "Ukraine");

        System.out.println("employeeStringMap = " + employeeStringMap);


        String ivan = employeeStringMap.get(employee1);
        String oleksander = employeeStringMap.get(employee1);
        System.out.println("Ivan: " + ivan); // ?
        System.out.println("Oleksander: " + oleksander);

        System.out.println(employeeStringMap);

        Map<String, String > linkedMap = new LinkedHashMap<>();
        // все элементы вернуться по порядку, а не в разброс как HashMap<>()
        linkedMap.put("Some0", "SomeValue0");
        linkedMap.put("Some1", "SomeValue1");
        linkedMap.put("Some5", "SomeValue5");
        linkedMap.put("Some2", "SomeValue2");
        System.out.println(linkedMap);

    }
}
