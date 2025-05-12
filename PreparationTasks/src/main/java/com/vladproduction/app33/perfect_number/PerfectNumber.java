package com.vladproduction.app33.perfect_number;

/**
 * A Perfect Number is a positive integer that is equal to the sum of its proper positive divisors (excluding the number itself).
 * Examples of Perfect Numbers:
 * 6 → Divisors: 1, 2, 3 → 1 + 2 + 3 = 6
 * 28 → Divisors: 1, 2, 4, 7, 14 → 1 + 2 + 4 + 7 + 14 = 28
 * 496 → Perfect
 * 8128 → Perfect
 * */
public class PerfectNumber {
    public static void main(String[] args) {

        int number = 6;
        checkerPerfectNumber(number);

    }

    private static void checkerPerfectNumber(int number) {

        int sum = 0;

        // Loop from 1 to number/2 to find proper divisors
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;                                           // accumulate the divisors
            }
        }
        if (sum == number) {
            System.out.println(number + " is a perfect number");
        }
    }
}
