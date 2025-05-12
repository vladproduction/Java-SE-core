package com.vladproduction.app21.check_prime_number;

import java.util.Scanner;

public class ConsolePrimeChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPrime = checkPrimeNumber(number);
        System.out.println(number + " is prime: " + isPrime);

    }

    private static boolean checkPrimeNumber(int number) {
        if(number <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
             if(number % i == 0){
                 return false;
             }
        }
        return true;
    }

}
