package com.vladproduction.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> mapAges = new HashMap<>();
        mapAges.put("John", 23);
        mapAges.put("Jane", 25);
        mapAges.put("Jack", 26);
        System.out.println(mapAges.get("John")); //23

        //how to iterate
        System.out.println("\tUsing entrySet()");
        // Using entrySet()
        for (Map.Entry<String, Integer> entry : mapAges.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\tUsing keySet()");
        // Using keySet()
        for (String key : mapAges.keySet()) {
            System.out.println(key + ": " + mapAges.get(key));
        }

    }
}
