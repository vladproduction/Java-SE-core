package com.vladproduction.wrapping_exceptions_problem.problem;

class BusinessException extends Exception {
    private final int code;

    public BusinessException(Throwable cause, int code) {
        super(cause);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
