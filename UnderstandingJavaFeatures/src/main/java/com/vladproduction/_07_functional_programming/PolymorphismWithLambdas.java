package com.vladproduction._07_functional_programming;

import java.util.function.Predicate;

public class PolymorphismWithLambdas {
    public static void main(String[] args) {
        Predicate<String> isLongerThanThree = str -> str.length() > 3;

        String testString = "Java";
        System.out.println("Is \"" + testString + "\" longer than 3 characters? " + isLongerThanThree.test(testString));
    }
}
