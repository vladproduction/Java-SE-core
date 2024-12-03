package com.vladproduction.wrapping_exceptions_problem.solution;

class BusinessException extends Exception {
    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }
}
