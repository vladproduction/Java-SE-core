package com.vladproduction.app30.find_second_largest_element;

public class SecondLargestElement {
    public static void main(String[] args) {
//        int[] array = {1, 1, 1};                            //No second largest element found.
        int[] array = {12, 35, 1, 10, 34, 1};                 //34
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        findSecondLargestElement(array);

    }

    private static void findSecondLargestElement(int[] array) {

        int first = Integer.MIN_VALUE;                      //first: stores the largest number seen so far
        int second = Integer.MIN_VALUE;                     //second: stores the second largest number
        //Both start as the smallest possible integer, so any real number in the array will be greater

        for (int num : array) {
            if(num > first){
                second = first;                             // push current largest down to second
                first = num;                                // update new largest
            } else if (num > second && num != first) {      //A new second largest that isn’t a duplicate of the largest
                second = num;                               // update second if num is distinct and between first and old second
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest element: " + second);
        }

    }
}
