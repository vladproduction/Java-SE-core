package com.vladproduction.app21.check_prime_number;

public class PrimeChecker2 {
    public static void main(String[] args) {

        //multiple values to check at ones:
        int[] values = {-1, 0, 1, 2, 3, 4, 17, 19, 20};
        for (int value : values) {
            boolean isPrime = checkPrimeNumber(value);
            System.out.println(value + " is prime: " + isPrime);
        }

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
