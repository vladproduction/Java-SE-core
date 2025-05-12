package com.vladproduction.app23.find_even_odd_numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenOddFinder {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        finderFromArray(numbers);

    }

    private static void finderFromArray(int[] numbers) {
        System.out.println("Original array: " + Arrays.toString(numbers));
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                even.add(number);
            }else {
                odd.add(number);
            }
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }


}
