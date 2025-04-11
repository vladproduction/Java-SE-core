package com.vladproduction.exceptions;

// Custom exception class
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}