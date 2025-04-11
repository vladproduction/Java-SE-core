package com.vladproduction.app05.most_frequent_elem_in_list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<String> content = new ArrayList<>();
        content.add("Hello");
        content.add("Java");
        content.add("World");
        content.add("Java");
        content.add("App");
        content.add("Java");
        content.add("Java");
        content.add("App");

        String mostFrequent = mostFrequent(content);
        System.out.println(mostFrequent);

    }

    /**
     * This method finds the most frequent element in a given list.
     *
     * @param list the list from which to find the most frequent element
     * @param <T>  the type of elements in the list
     * @return the most frequent element in the list, or null if the list is null or empty
     */
    private static <T> T mostFrequent(List<T> list) {
        // Check if the list is null or empty
        if (list == null || list.isEmpty()) {
            return null;
        }

        // Create a map to hold elements and their frequencies
        Map<T, Integer> frequency = new HashMap<>();

        // Iterate over the list and populate the frequency map
        for (T t : list) {
            // Increment the count for the element 't', initializing if necessary
            frequency.put(t, frequency.getOrDefault(t, 0) + 1);
        }

        T mostFrequentElement = null;
        int maxCount = 0;

        // Iterate through the frequency map to find the most frequent element
        for (Map.Entry<T, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentElement = entry.getKey();
            }
        }
        return mostFrequentElement;
    }

}
