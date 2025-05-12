package com.vladproduction.app29.GCD_of_two_numbers;

public class GCDOfTwoNumbers {
    public static void main(String[] args) {
        int a = 60;
        int b = 48;

        calculateGCD(a, b);
    }

    private static void calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD of " + a + " and " + b + " is: " + a);
    }
}
