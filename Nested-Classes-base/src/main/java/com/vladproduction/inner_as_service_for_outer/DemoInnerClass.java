package com.vladproduction.inner_as_service_for_outer;

/**
 * The Outer class encapsulates an array of integers and provides functionality
 * to analyze its elements through an inner class, InnerServiceClass.
 * Key Features:
 * - Contains a private final array `elements`, initialized through the constructor.
 * - The analise() method creates an instance of InnerServiceClass to compute
 *   and print the maximum, minimum, and average values of the elements.
 * - The InnerServiceClass has methods maxElement(), minElement(), and avgElement()
 *   for performing the respective calculations.
 * This design showcases the use of inner classes to operate on the members of
 * the outer class, promoting encapsulation and better organization of related
 * functionality.
 */
class DemoInnerClass {
    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Outer outer = new Outer(elements);
        outer.analise();
        //Max: 9
        //Min: 1
        //Avg: 5
    }
}
