package com.vladproduction.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(1); // will ignore (not duplicates allowed)
        System.out.println(numbers.size()); //5

        numbers.add(6);
        System.out.println(numbers.size()); //now it is 6 elements

        Set<String> namesSet = new HashSet<>();
        namesSet.add("Alice");
        namesSet.add("John");
        namesSet.add("Jane");
        namesSet.add("Jack");
        namesSet.add("Nick");
        namesSet.add("Bob");

        for (String s : namesSet) {
            System.out.println(s);
        }

    }
}
