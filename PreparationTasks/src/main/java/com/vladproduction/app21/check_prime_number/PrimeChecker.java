package com.vladproduction.app21.check_prime_number;

public class PrimeChecker {
    public static void main(String[] args) {

//        int number = -1;//false
//        int number = 0;//false
//        int number = 1;//false
//        int number = 2;//true
//        int number = 3;//true
//        int number = 4;//false
        int number = 17;//true


        boolean primeNumber = checkPrimeNumber(number);
        System.out.println(number + " is prime: " + primeNumber);
        System.out.println("=== range from 0 to 100 ===");
        //in a range from-->to
        int from = 0;
        int to = 100;
        for (int i = from; i <= to; i++) {
            boolean isPrime = checkPrimeNumber(i);
            System.out.println(i + " is prime: " + isPrime);
        }

    }

    private static boolean checkPrimeNumber(int number) {
        boolean isPrime = true;
        if(number <= 1){
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                 if(number % i == 0){
                     isPrime = false;
                     break;
                 }
            }
        }
        return isPrime;
    }
}
