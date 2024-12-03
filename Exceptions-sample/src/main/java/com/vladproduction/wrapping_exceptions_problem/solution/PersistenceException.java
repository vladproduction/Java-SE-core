package com.vladproduction.wrapping_exceptions_problem.solution;

class PersistenceException extends Exception {
    public PersistenceException(String message) {
        super(message);
    }
}
