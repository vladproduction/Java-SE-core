package com.vladproduction.polymorphism;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

/**
 * The Main3 class serves as a demonstration of the ConditionArrayList class,
 * showcasing the ability to create lists that enforce conditions for adding
 * elements. This class demonstrates how to manage odd and even number
 * conditions using custom predicates.
 */
public class Main3 {
    public static void main(String[] args) {

        // Create a ConditionArrayList that only allows odd numbers
        ConditionArrayList oddConditionList = new ConditionArrayList(
                n -> Math.abs(n) % 2 == 1); // Predicate to check if a number is odd
        oddConditionList.add(1);
        oddConditionList.add(2);
        addRandomNumber(oddConditionList);
        System.out.println(oddConditionList);

        // Create a ConditionArrayList that only allows even numbers
        ConditionArrayList evenConditionList = new ConditionArrayList(
                n -> Math.abs(n) % 2 == 0); // Predicate to check if a number is even
        evenConditionList.add(1);
        evenConditionList.add(2);
        addRandomNumber(evenConditionList);
        System.out.println(evenConditionList);

        // Create a standard ArrayList and add integers
        ArrayList<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        addRandomNumber(originalList);
        System.out.println(originalList);

    }

    /**
     * Adds a random integer to the provided list. If the list is an instance
     * of ConditionArrayList, it ensures that the number added meets the
     * eligibility criteria defined by the Predicate of that ConditionArrayList.
     *
     * @param list The ArrayList to which a random integer will be added.
     */
    public static void addRandomNumber(ArrayList<Integer> list) {
        Random random = new Random(); // Create a Random object
        int number = random.nextInt(1000); // Generate a random integer between 0 and 999

        // Check if the list is a ConditionArrayList
        if (list instanceof ConditionArrayList) {
            ConditionArrayList conditionArrayList = (ConditionArrayList) list; // Cast the list to ConditionArrayList
            // Keep generating random numbers until one is found that meets the condition
            while (!conditionArrayList.isEligible(number)) {
                number = random.nextInt(1000); // Generate a new random number
            }
        }
        list.add(number); // Add the eligible number to the list
    }

}
