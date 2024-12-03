package com.vladproduction.wrapping_exceptions_problem.solution;

class ApiException extends Exception {
    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }
}
