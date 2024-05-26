package com.app.vp.chapter_7_collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_toArray3 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Sponge Bob");
        names.add("Charlie");

// Create an empty String array with the same size as the list
        String[] namesArray = new String[names.size()];

// Loop through the list and add elements to the array
        int i = 0;
        for (String name : names) {
            namesArray[i++] = name;
        }

// Access elements directly using their type
        String firstElement = namesArray[0];
    }
}
