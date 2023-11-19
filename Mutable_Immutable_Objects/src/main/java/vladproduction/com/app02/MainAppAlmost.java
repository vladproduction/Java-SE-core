package vladproduction.com.app02;

import java.util.HashMap;
import java.util.Map;

public class MainAppAlmost {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("good key", "value");
        System.out.println("map:--->");
        map.keySet().forEach(System.out::println);

        AlmostMutableClass almostMutableClass = new AlmostMutableClass("mutable2", map);
        // Мы не можем изменять состояние объекта
        // через добавление элементов в полученную map
        System.out.println("Result after modifying the map after we get it from the object");
        almostMutableClass.getFieldMap().put("bad key", "another value");
        almostMutableClass.getFieldMap().keySet().forEach(System.out::println);

        System.out.println("Result of the object's map after modifying the initial map");
        map.put("bad key", "another value");
        almostMutableClass.getFieldMap().keySet().forEach(System.out::println);

        //before modify constructor:
//        map:--->
//        good key
//        Result after modifying the map after we get it from the object
//        good key
//        Result of the object's map after modifying the initial map
//        good key
//        bad key

        //after modifying constructor:
//        map:--->
//        good key
//        Result after modifying the map after we get it from the object
//        good key
//        Result of the object's map after modifying the initial map
//        good key
    }
}
