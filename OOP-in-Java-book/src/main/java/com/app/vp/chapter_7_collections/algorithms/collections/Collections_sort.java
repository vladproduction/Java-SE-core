package com.app.vp.chapter_7_collections.algorithms.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Collections.sort() does not useful for Set;
 * */
public class Collections_sort {
    public static void main(String[] args) {

        //1-object should implement Comparable
        Person[] people = {
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 30),
                new Person("David", 22)
        };

        // Sort the array of Person objects
        Collections.sort(Arrays.asList(people)); // Convert to List for sorting

        System.out.println("Sorted people by name and age (ascending):");
        for (Person person : people) {
            System.out.println(person.getName() + ", " + person.getAge());
        }


        //2-sorting array by current comparator
        String[] words = {"apple", "banana", "orange", "grapefruit"};

        // Create a comparator object
        StringLengthComparator comparator = new StringLengthComparator();

        // Sort the array using the comparator
        Arrays.sort(words, comparator);

        System.out.println("Sorted words by length (ascending):");
        System.out.println(Arrays.toString(words));

    }

    static class StringLengthComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            return s1.length() - s2.length(); // Sort by string length (ascending)
        }
    }
}
