package com.vladproduction.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Jane");
        list.add("Jack");
        list.add("John");
        list.add("Bob");
        list.add("Alice");
        list.add("Nick");

        // Using Collections.sort()
        Collections.sort(list);
        System.out.println(list);

        list.add("Anna");

        // Using Comparator
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.length() - s1.length();
            }
        });
        System.out.println(list);

        list.add("Bobby");
        // With lambda (Java 8+)
        Collections.sort(list, Comparator.comparingInt(String::length));
        System.out.println(list);

    }
}
