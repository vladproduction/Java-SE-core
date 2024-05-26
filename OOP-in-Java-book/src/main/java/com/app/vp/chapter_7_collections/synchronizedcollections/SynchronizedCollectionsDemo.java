package com.app.vp.chapter_7_collections.synchronizedcollections;

import java.util.*;

public class SynchronizedCollectionsDemo {
    public static void main(String[] args) {

        // Create a synchronized List
        List<String> names = Collections.synchronizedList(new ArrayList<>());
        names.add("John");
        names.add("Jack");
        names.add("Bob");

        // Create a synchronized Map
        Map<String, Integer> ages = Collections.synchronizedMap(new HashMap<>());
        ages.put("John", 30);
        ages.put("Jack", 33);
        ages.put("Bob", 25);

    }
}
