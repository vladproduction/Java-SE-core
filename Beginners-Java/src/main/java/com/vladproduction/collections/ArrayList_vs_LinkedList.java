package com.vladproduction.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_vs_LinkedList {
    public static void main(String[] args) {
        // Timing for LinkedList
        List<String> linkedList = new LinkedList<>();
        long linkedListTime = timing(linkedList);
        System.out.println("LinkedList time: " + linkedListTime + " ns");

        // Timing for ArrayList
        List<String> arrayList = new ArrayList<>();
        long arrayListTime = timing(arrayList);
        System.out.println("ArrayList time: " + arrayListTime + " ns");

        if(arrayListTime < linkedListTime) {
            System.out.println("ArrayList add elements faster than linkedList");
        }
        else {
            System.out.println("ArrayList add elements slower than linkedList");
        }

    }

    private static long timing (List<String> list){
        long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list.add(String.valueOf(i)); // Add elements to the list
        }
        // Check the size to ensure the list is populated
        System.out.println("Size: " + list.size());
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

}
