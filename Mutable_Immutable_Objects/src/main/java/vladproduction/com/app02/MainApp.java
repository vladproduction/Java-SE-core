package vladproduction.com.app02;

import java.util.HashMap;
import java.util.Map;

public class MainApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        System.out.println("map:--->");
        map.keySet().forEach(System.out::println);

        // Инициализация нашего "иммутабельного" класса
        MutableClass mutableClass = new MutableClass("mutable", map);
        // Можно легко добавлять элементы в map == изменение состояния
        mutableClass.getFieldMap().put("unwanted", "new value");
        mutableClass.getFieldMap().keySet().forEach(System.out::println);
    }
}
