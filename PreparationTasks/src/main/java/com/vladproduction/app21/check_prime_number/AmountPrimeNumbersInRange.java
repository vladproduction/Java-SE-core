package com.vladproduction.app21.check_prime_number;

public class AmountPrimeNumbersInRange {
    public static void main(String[] args) {

        int from = 10;
        int to = 100;

        int primesInRange = amountPrimeNumbers(from, to);
        System.out.println("Amount of prime numbers in range from " + from + " to " + to + " is: " + primesInRange);
        //output is:
        //Amount of prime numbers in range from 10 to 100 is: 21

        int primesInRangePrinting = amountPrimeNumbersPrinting(from, to);
        System.out.println("\nAmount of prime numbers in range from " + from + " to " + to + " is: " + primesInRangePrinting);

    }

    private static int amountPrimeNumbers(int from, int to) {
        int count = 0;
        for (int i = from; i <= to; i++) {
             if(checkPrime(i)){
                 count++;
             }
        }
        return count;
    }

    private static int amountPrimeNumbersPrinting(int from, int to) {
        int count = 0;
        System.out.print("\nPrime numbers: ");
        for (int i = from; i <= to; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        return count;
    }

    private static boolean checkPrime(int number){
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
