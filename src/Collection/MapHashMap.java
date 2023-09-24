package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapHashMap {

    public static void main(String[] args) {

         Map<String, String> map = new HashMap<>();
         // добавление элемента в map
         map.put("zxc@gmail.com", "some info0");
         map.put("qwe@gami.com", "some info1");
        System.out.println(map);
        System.out.println("map.hashCode() = " + map.hashCode());
        System.out.println("map.keySet() = " + map.keySet());
        System.out.println("map.values() = " + map.values());
        System.out.println("map.entrySet() = " + map.entrySet());
        System.out.println("map.get(\"xzc@gmail.com\") = " + map.get("xzc@gmail.com"));
        System.out.println("map.get(\"qwe@gami.com\") = " + map.get("qwe@gami.com"));

        System.out.println(" ");
        System.out.println("/////////////////////////////////");
        System.out.println(" ");


        Map<String, String> capitals = new HashMap<>();
        capitals.put("Germany", "Berlin");
        capitals.put("Ukraine", "Kyiv");
        capitals.put("Spain", "Madrid");

        // получение по key
        System.out.println("capitals.get(\"Germany\") = " + capitals.get("Germany"));
        System.out.println("capitals = " + capitals);

        System.out.println(" ");
        System.out.println("/////////////////////////////////");
        System.out.println(" ");

        // длинна capitals
        System.out.println("capitalsSize = " + capitals.size());

        System.out.println(" ");
        System.out.println("/////////////////////////////////");
        System.out.println(" ");

        // вывод всех ключей capitals
        System.out.println("capitals.keySet() = " + capitals.keySet());

        System.out.println(" ");
        System.out.println("/////////////////////////////////");
        System.out.println(" ");

        // вывод всех value capitals
        System.out.println("capitals.values() = " + capitals.values());

        System.out.println(" ");
        System.out.println("/////////////////////////////////");
        System.out.println(" ");

        // проверка на пустую мепу
        Set<Map.Entry<String, String>> entries = capitals.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("Entries");
            System.out.println("Key = " + entry.getKey());
            System.out.println("Value = " + entry.getValue());
        }

        System.out.println(" ");
        System.out.println("/////////////////////////////////");
        System.out.println(" ");

        // удаленеие элемента
        capitals.remove("Germany");
        System.out.println("capitals = " + capitals);

        System.out.println(" ");
        System.out.println("/////////////////////////////////");
        System.out.println(" ");

        // очистка capitals
        capitals.clear();
        System.out.println("capitals = " + capitals);
    }
}