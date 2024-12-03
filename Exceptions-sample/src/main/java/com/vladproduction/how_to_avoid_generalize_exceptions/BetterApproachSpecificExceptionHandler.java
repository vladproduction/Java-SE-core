package com.vladproduction.how_to_avoid_generalize_exceptions;

/**
 * This class illustrates a better exception handling approach by
 * using specific exceptions without generalization.
 */
public class BetterApproachSpecificExceptionHandler {

    /**
     * This method performs an action that can potentially throw exceptions
     * based on input provided.
     *
     * @throws NumberFormatException if the input is not a valid number.
     * @throws IllegalArgumentException if the input length is less than 5 characters.
     */
    public void doSomething() throws NumberFormatException, IllegalArgumentException {
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

        // Normal processing if input is valid
        System.out.println("Input is valid: " + input);
    }

    public void doNotGeneralizeException() throws NumberFormatException, IllegalArgumentException {
        doSomething();
    }

    public static void main(String[] args) {
        BetterApproachSpecificExceptionHandler instance = new BetterApproachSpecificExceptionHandler();

        try {
            instance.doNotGeneralizeException();
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected exception: " + e.getMessage());
        }
    }

}
