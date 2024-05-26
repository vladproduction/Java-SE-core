package com.app.vp.chapter_6_generics;

import java.util.*;
import java.util.function.Predicate;

/**
 * Write a generic method to determine quantity
 * elements in a collection that has certain
 * properties (for example, consists of even numbers, prime
 * numbers, palindromes)
 * */
public class QuantityInCollection {
    public static void main(String[] args) {
        //=====test-1:===== is elements is String than count
        //initialize (collection) data for retrieving result
        Collection<String> collection = new AbstractCollection<String>() {
            List<String> stringList = new ArrayList<>();
            @Override
            public Iterator<String> iterator() {
                stringList.add("A");
                stringList.add("B");
                stringList.add("C");
                return stringList.stream().iterator();
            }

            @Override
            public int size() {
                return stringList.size();
            }
        };
        /*
        * Predicate:
        * takes an element of type T and returns a boolean indicating whether the element satisfies the desired property
        * here: predicated true if element is instance of String.class
        * */
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return true;
            }
        };
        //or with lambda:
        Predicate<String> predicateLambda = string -> true;
        //method action start:
        int countedElements = countElements(collection, predicateLambda);
        System.out.println("countedElements = " + countedElements);

        //=====test-2:===== even numbers
        //initialize data for retrieving result
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        //Predicate to check for even numbers
        Predicate<Integer> isEven = integer -> integer % 2 == 0; //check each element by using lambda expression
        //method action start:
        int evenCountedElements = countElements(numbers, isEven);
        System.out.println("evenCountedElements = " + evenCountedElements); //expected: 3

        //=====test-3:===== prime numbers
        //initialize data for retrieving result
        List<Integer> numbers2 = List.of(1, 2, 3, 4, 5, 6);
        //Predicate to check for prime numbers
        Predicate<Integer> isPrimePredicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer <= 1) {
                    return false; // 1 or less are not prime
                }
                // Efficiently check divisibility only up to the square root of num
                for (int i = 2; i * i <= integer; i++) {
                    if (integer % i == 0) {
                        return false; // Divisible by a number other than 1 or itself
                    }
                }
                return true; // Prime if no divisors found
            }
        };
        //or by lambda:
        Predicate<Integer> isPrimePredicateLambda = integer -> {
            if (integer <= 1) {
                return false; // 1 or less are not prime
            }
            // Efficiently check divisibility only up to the square root of num
            for (int i = 2; i * i <= integer; i++) {
                if (integer % i == 0) {
                    return false; // Divisible by a number other than 1 or itself
                }
            }
            return true; // Prime if no divisors found
        };
        //method action start:
        int primeNumbers = countElements(numbers2, isPrimePredicateLambda);
        System.out.println("primeNumbers = " + primeNumbers);

        //=====test-4:===== palindrome
        //variant-1 (recursive approach):
        //initiate data for check by palindrome
        List<String> words = Arrays.asList("Racecar", "Hello", "Noon", "Was it a car or a cat I saw?");
        Predicate<String> palindromeRecursivePredicate = QuantityInCollection::isPalindromeRecursive;
        int palindromeCountByRecursive = countElements(words, palindromeRecursivePredicate);
        System.out.println("Number of palindromes (recursive approach): " + palindromeCountByRecursive);

        //variant-2 (iterative approach):
        Predicate<String> palindromeIterativePredicate = QuantityInCollection::isPalindromeIterative;
        int palindromeCountByIterative = countElements(words, palindromeIterativePredicate);
        System.out.println("Number of palindromes (iterative approach): " + palindromeCountByIterative);
    }

    /**
     * Generic method in Java to determine the quantity of elements in a collection that satisfy a certain property
     * where:
     * @param <T> denotes a generic type parameter T;
     * @param collection collection that holds elements of type T;
     * @param predicate Predicate functional interface;
     *
     * @return an integer representing the count of elements matching the property.
     * */
    public static <T> int countElements(Collection<T> collection, Predicate<T> predicate) {
        //checks if both the collection and predicate arguments are null
        if (collection == null || predicate == null) {
            throw new IllegalArgumentException("Collection or predicate cannot be null");
        }
        int count = 0; //initializes a counter variable count to 0
        //iterate through collection using for-each loop
        for (T element : collection) {
            //method should be implemented based on the specific property wanted to check
            //(even numbers, prime numbers, palindromes)
            if (predicate.test(element)) {
                count++; //element satisfies the property and counter incremented
            }
        }
        //final value of count, which represents the number of elements
        // that matched the property defined in the predicate
        return count;
    }

    /**
     * method to check if number is prime or not
     * @param num number for check
     * @return true if number is prime, or false - not prime
     * */
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 1 or less are not prime
        }
        // Efficiently check divisibility only up to the square root of num
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // Divisible by a number other than 1 or itself
            }
        }
        return true; // Prime if no divisors found
    }

    /**
     * method to check if text is palindrome
     * Recursive approach
     * The helper function isPalindromeHelper takes the text, starting and ending indices (left and right) as arguments.
     * Base case: If left is greater than or equal to right (single character or empty substring), it's a palindrome.
     * Recursive case: It checks if the characters at left and right are equal. If yes, it calls itself recursively
     * on the remaining substring (excluding the first and last characters) using updated left and right indices.
     * */
    public static boolean isPalindromeRecursive(String text) {
        if (text == null || text.isBlank()) {
            return true; // Empty string is considered a palindrome
        }
        text = text.toLowerCase().replaceAll("\\s+", ""); // Preprocess: lowercase and remove spaces
        return isPalindromeHelper(text, 0, text.length() - 1);
    }

    private static boolean isPalindromeHelper(String text, int left, int right) {
        if (left >= right) {
            return true; // Base case: single character or empty substring
        }
        return text.charAt(left) == text.charAt(right) && isPalindromeHelper(text, left + 1, right - 1);
    }

    /**
     * method to check if text is palindrome
     * Iterative approach
     * It iterates while left is less than right.
     * If the characters at left and right are not equal, it's not a palindrome and returns false.
     * If the characters are equal, it increments left and decrements right to move closer to the middle.
     * If the loop completes without finding any mismatches, it means the text is a palindrome and returns true.
     * */
    public static boolean isPalindromeIterative(String text) {
        if (text == null || text.isBlank()) {
            return true; // Empty string is considered a palindrome
        }
        text = text.toLowerCase().replaceAll("\\s+", ""); // Preprocess: lowercase and remove spaces
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
