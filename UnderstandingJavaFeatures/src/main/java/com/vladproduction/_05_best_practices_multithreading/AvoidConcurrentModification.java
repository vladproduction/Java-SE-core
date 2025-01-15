package com.vladproduction._05_best_practices_multithreading;

import java.util.ArrayList;
import java.util.List;

public class AvoidConcurrentModification {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Banana");

        for (String fruit : fruits) {
            System.out.print(fruit + " "); //Apple Pineapple Banana
        }
        System.out.println();

        // Create a copy of the list (fruits) for safe modification:
        List<String> copyFruits = new ArrayList<>(fruits);
        for (String copyFruit : copyFruits) {
            if(copyFruit.equals("Banana")){
                fruits.remove(copyFruit); //no ConcurrentModificationException
            }
        }

        //check the original fruits list:
        System.out.println(fruits); //[Apple, Pineapple]
        /**
         * Description:
         *
         * Copying the List:
         * You create a new list called copyFruits using the constructor new ArrayList<>(fruits),
         * which creates a shallow copy of the original fruits list. This means that copyFruits contains references
         * to the same elements as fruits, but it is a different list.
         *
         * Iteration and Modification:
         * When you iterate over copyFruits, you check if any of the elements equal "Banana". If a match is found,
         * you remove this element from fruits. Since you're modifying the fruits list during the iteration of copyFruits,
         * no ConcurrentModificationException is thrown because you are not directly modifying the list that you are iterating over.
         * You are modifying a different list (fruits) based on the conditions checked in copyFruits.
         *
         * Effects of Modification:
         * Because copyFruits is a shallow copy that references the same String objects (the actual fruit names are immutable),
         * removing "Banana" from fruits will reflect in the original list because the reference is the same.
         * However, the structure of copyFruits remains intact, allowing the program to continue iterating safely.
         * */

    }
}
