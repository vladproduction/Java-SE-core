package com.app.vp.chapter_7_collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_toArray2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

// Convert the list to an Object array
        Object[] namesArray = names.toArray();

// Accessing elements (casting might be required)
        String firstElement = (String) namesArray[0];  // Cast to String

// toArray(T[] a):** This method allows you to specify a pre-sized array of the desired element type.
// If the list size is larger than the array size, a new array with the appropriate size is created.
// If the list size is smaller, the remaining elements in the array are filled with `null` values.


        List<String> names2 = new ArrayList<>();
        names2.add("Alice");
        names2.add("Bob");
        names2.add("Charlie");

// Create an empty String array to hold the elements
        String[] namesArray2 = new String[names2.size()];

// Convert the list to a String array (resizes if necessary)
        names2.toArray(namesArray2);

// Access elements directly using their type
        String firstElement2 = namesArray2[0];
    }
}
