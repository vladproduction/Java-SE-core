package com.vladproduction.boolean_examples;

/**
 * #2
 * Suppose that a1 and b1 are int variables. Simplify the following expression:
 * (!(a1 < b1) && !(a1 > b1)).
 * */
public class BooleanTask2 {
    public static void main(String[] args) {

        int a1 = 5;
        int b1 = 5;

        boolean original_expression = (!(a1 < b1) && !(a1 > b1));
        boolean simplify_expression = (a1 == b1);

        // Output results
        System.out.println("Original expression evaluates to: " + original_expression);
        System.out.println("Simplified expression evaluates to: " + simplify_expression);

        // Check if both expressions are equal
        if (original_expression == simplify_expression) {
            System.out.println("Both expressions are equivalent.");
        } else {
            System.out.println("Expressions are not equivalent.");
        }


    }
}
