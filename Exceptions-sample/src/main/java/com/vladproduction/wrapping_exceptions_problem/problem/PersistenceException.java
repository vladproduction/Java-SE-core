package com.vladproduction.wrapping_exceptions_problem.problem;

class PersistenceException extends Exception {
    private final int code;

    public PersistenceException(String message, int code) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
