package com.vladproduction.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CommonOperations {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Jane");
        list.add("Jack");
        list.add("John");
        list.add("Bob");
        list.add("Alice");
        list.add("Nick");

        // Using for-each loop
        for (String item : list) {
            System.out.print(item + " ");
        }
        System.out.println();

        // Using Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.print(item + " ");
        }
        System.out.println();

        // Using forEach (Java 8+)
        System.out.println("\n");
        list.forEach(item -> System.out.print(item));

        // using method reference:
        System.out.println("\n");
        list.forEach(System.out::print);

    }
}
