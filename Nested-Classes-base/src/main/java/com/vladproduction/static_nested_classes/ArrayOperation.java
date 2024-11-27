package com.vladproduction.static_nested_classes;

import java.util.Arrays;

/**
 * The ArrayOperation class demonstrates the creation and manipulation
 * of arrays in Java. It generates an array of random double values,
 * fills it with values formatted to two decimal places, and finds
 * the minimum and maximum values using a nested Pair class.
 *
 * <p>Main features include:
 * <ul>
 *   <li>Generation of a random array with doubles formatted to two decimal places.</li>
 *   <li>Calculation of the minimum and maximum values for both random and custom arrays.</li>
 *   <li>Use of an inner static record class Pair to encapsulate min and max values.</li>
 * </ul>
 *
 * <p>Usage: Instantiate the ArrayOperation class and run the main method to see examples of
 * random and custom array operations with output for minimum and maximum values.
 */
public class ArrayOperation {
    public static void main(String[] args) {
        double[] arrayRandom = new double[20];
        double[] arrayCustom = {10, 20, 60, 5, -3, 0, 14};
//        for (double v : arrayRandom) {//for each does not work for modify
//            v = 100 * Math.random(); // array is going to fill with 0.0 values
//        }
        for (int i = 0; i < arrayRandom.length; i++) { // fill array with values by for each loop
            double randomVal = 100 * Math.random();
            arrayRandom[i] = Math.round(randomVal * 100) / 100.0; // create random number and keep as format example (25.94) two numbs after comma
        }
        System.out.println("Random array: " + Arrays.toString(arrayRandom));
        ArrayOperation.Pair pairRand = Pair.searchMinMax(arrayRandom);
        System.out.println("Min: " + pairRand.min); // using class variable
        System.out.println("Max: " + pairRand.max);

        System.out.println("Custom array: " + Arrays.toString(arrayCustom));
        ArrayOperation.Pair pairCustom = Pair.searchMinMax(arrayCustom);
        System.out.println("Min: " + pairCustom.min()); // using getter
        System.out.println("Max: " + pairCustom.max());
    }

    public record Pair(double min, double max) {
        public static Pair searchMinMax(double[] array) {
            double min = array[0];
            double max = array[0];
            for (double v : array) {
                if (min > v) {
                    min = v;
                }
                if (max < v) {
                    max = v;
                }
            }
            return new Pair(min, max);
        }
    }
}
