package com.vladproduction.wrapping_exceptions_problem.problem;

class ApiException extends Exception {
    private final int code;

    public ApiException(Throwable cause, int code) {
        super(cause);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
