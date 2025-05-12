package com.vladproduction.app32.find_missing_number;

/**
 * ✅ Works when:
 * Array contains unique numbers
 * Numbers are in the range from 1 to N
 * Exactly one number is missing
 *
 * ❌ Doesn’t work if:
 * More than one number is missing
 * Numbers aren't consecutive or start from a number ≠ 1
 * */
public class FindMissingNumber {
    public static void main(String[] args) {

        //create: the sequence of consecutive natural numbers
        int[] array = {1, 2, 3, 5, 6};
//        System.out.println("Current array length: " + array.length);

        findMissing(array);

    }

    private static void findMissing(int[] array) {

        int n = array.length + 1;

        int totalSum = n * (n + 1) / 2; //21; 6*(6+1)/2 = 6*7/2 = 42/2 = 21

        for (int num : array) {
            totalSum -= num;            //Subtract each array value from total

            /**
             * 21 - 1 = 20
             * 20 - 2 = 18
             * 18 - 3 = 15
             * 15 - 5 = 10
             * 10 - 6 = 4
             * */
        }

        System.out.println("Missing number: " + totalSum);
    }
}
