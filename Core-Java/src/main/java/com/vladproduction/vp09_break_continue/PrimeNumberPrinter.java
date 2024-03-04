package com.vladproduction.vp09_break_continue;

public class PrimeNumberPrinter {
    public static void main(String[] args) {
        int num = 2;

        while (num <= 100) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // Exit the inner loop if not prime
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
            num++;
        }
    }
}
