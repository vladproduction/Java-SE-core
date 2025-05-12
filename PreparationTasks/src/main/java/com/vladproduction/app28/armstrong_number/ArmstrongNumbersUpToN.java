package com.vladproduction.app28.armstrong_number;

public class ArmstrongNumbersUpToN {
    public static void main(String[] args) {

        int bound = 10000;
        printArmstrongNumbers(bound);

    }

    private static void printArmstrongNumbers(int bound) {
        int count = 0;
        System.out.println("Armstrong numbers from 0 to " + bound + ":");

        for (int i = 0; i <= bound; i++) {
            if(isArmstrongNumber(i)){
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nTotal Armstrong numbers found: " + count);

    }

    private static boolean isArmstrongNumber(int number) {
        int original = number;
        int digits = countDigits(number);
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += (int) Math.pow(digit, digits);
            number /= 10;
        }
        return sum == original;
    }

    private static int countDigits(int number){
        //edge case:
        if(number == 0){
            return 1;
        }
        int count = 0;
        while (number != 0){
            number /= 10;
            count++;
        }
        return count;
    }
}
