package com.vladproduction._07_functional_programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgrammingExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println(name)); // Using lambda expression

        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A")) // Filtering names starting with A
                .collect(Collectors.toList()); // Collecting results back to a list

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Doubling even numbers using streams and lambda expressions
        List<Integer> doubledEvenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0) // Keep only even numbers
                .map(num -> num * 2) // Double the numbers
                .collect(Collectors.toList()); // Collect results

        System.out.println("Doubled Even Numbers: " + doubledEvenNumbers);

    }
}
