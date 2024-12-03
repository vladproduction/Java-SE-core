package com.vladproduction.how_to_avoid_generalize_exceptions;

/**
 * This class illustrates a poor exception handling approach by generalizing
 * specific exceptions into a generic Exception.
 */
public class PoorApproachGeneralized {
    public void doSomething() throws Exception {
        // Example logic that may throw exceptions
        String input = "notANumber"; // Simulating faulty input

        // This condition may throw NumberFormatException
        if (input.equals("notANumber")) {
            throw new NumberFormatException("Input is not a valid number.");
        }

        // This condition may throw IllegalArgumentException
        if (input.length() < 5) {
            throw new IllegalArgumentException("Input must be at least 5 characters long.");
        }

        // Additional logic can be included here
        System.out.println("Input is valid: " + input);
    }

    public void doNotGeneralizeException() throws Exception {
        try {
            doSomething();
        } catch (NumberFormatException e) {
            throw new Exception("Caught NumberFormatException: " + e.getMessage(), e);
        } catch (IllegalArgumentException e) {
            throw new Exception("Caught IllegalArgumentException: " + e.getMessage(), e);
        }
    }

    public static void main(String[] args) {
        PoorApproachGeneralized instance = new PoorApproachGeneralized();

        try {
            instance.doNotGeneralizeException();
        } catch (Exception e) {
            if (e.getCause() instanceof NumberFormatException) {
                System.err.println("NumberFormatException: " + e.getCause().getMessage());
            } else if (e.getCause() instanceof IllegalArgumentException) {
                System.err.println("IllegalArgumentException: " + e.getCause().getMessage());
            } else {
                System.err.println("Unexpected exception: " + e.getMessage());
            }
        }
    }
}
