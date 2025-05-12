package com.vladproduction.app22.exception_handling.custom;

public class InvalidInputException extends Exception{

    private String invalidInput;
    private String expectedFormat;

    public InvalidInputException(String message, String invalidInput, String expectedFormat) {
        super(message);
        this.invalidInput = invalidInput;
        this.expectedFormat = expectedFormat;
    }

    public String getInvalidInput() {
        return invalidInput;
    }

    public String getExpectedFormat() {
        return expectedFormat;
    }

    @Override
    public String toString() {
        return String.format("%s. Invalid input: %s; Expected format: %s", getMessage(), invalidInput, expectedFormat);
    }

}
