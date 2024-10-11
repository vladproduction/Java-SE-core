package com.vladproduction.polymorphism;

import java.util.ArrayList;
import java.util.Random;


/**
 * The Main2 class demonstrates the functionality of the OddArrayList
 * by showcasing how it behaves when attempting to add both odd and
 * even numbers. It also includes a method for adding random numbers
 * to either an OddArrayList or a regular ArrayList.
 * In OddArrayList, the overridden add method ensures that only odd numbers are added.
 */
public class Main2 {
    public static void main(String[] args) {

        // Create an OddArrayList and add an integer
        OddArrayList oddlist = new OddArrayList(7); // Initialize with an odd number
        oddlist.add(1); // Attempt to add an odd number
        oddlist.add(2); // Attempt to add an even number (will not be added)

        // Method to add random numbers to the OddArrayList
        //this is where polymorphism occurs: each use of the method may behave differently based on the actual object type being passed
        addRandomNumber(oddlist);
        System.out.println("Size of OddArrayList: " + oddlist.size()); // Output the size of the odd list
        System.out.println("Contents of OddArrayList: " + oddlist); // Output the contents of the odd list

        // Create a regular ArrayList and add integers
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); // Add odd number
        list.add(2); // Add even number

        // Method to add random numbers to the regular ArrayList
        addRandomNumber(list);
        System.out.println("Size of ArrayList: " + list.size()); // Output the size of the regular list
        System.out.println("Contents of ArrayList: " + list); // Output the contents of the regular list

    }

    /**
     * Adds random integers to a given list until the size of the list
     * increments by 1 compared to its original size. Only the original
     * numbers in the list are retained; any repetition of the same number
     * will discard the number in the odd list since the OddArrayList
     * filters out even numbers by design.
     *
     * @param list The ArrayList to which random integers will be added.
     */
    public static void addRandomNumber(ArrayList<Integer> list) {
        int originalSize = list.size(); // Store the original size of the list
        Random random = new Random(); // Create a new Random object

        // Continue adding random numbers until the list size has increased
        while (originalSize + 1 != list.size()) {
            int num = random.nextInt(1000); // Generate a random integer between 0 and 999
            list.add(num); // Add the generated number to the list
        }
    }
}
