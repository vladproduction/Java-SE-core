package com.app.vp.chapter_7_collections.algorithms.arrays;

import java.util.Arrays;
import java.util.List;

public class Arrays_asList {
    public static void main(String[] args) {
        String[] colors = {"red", "green", "blue"};

        // Convert array to list (fixed-size view)
        List<String> colorList = Arrays.asList(colors);

        // Trying to add an element to the list (throws UnsupportedOperationException)
//         colorList.add("yellow"); // This will cause an exception

        System.out.println("Original array: " + java.util.Arrays.toString(colors));
        System.out.println("List from array (fixed-size): " + colorList);
    }

}
