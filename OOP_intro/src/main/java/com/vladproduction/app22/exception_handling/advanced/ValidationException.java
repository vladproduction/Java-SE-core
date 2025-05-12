package com.vladproduction.app22.exception_handling.advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//Advanced Exception Validation
/**
 * Advanced Validation (ValidationException)
 * Fluent validation API
 * Collect multiple validation errors
 * Chainable validation rules
 * */
public class ValidationException extends Exception {
    private final List<String> validationErrors;

    public ValidationException(List<String> errors) {
        super("Validation failed");
        this.validationErrors = new ArrayList<>(errors);
    }

    public List<String> getValidationErrors() {
        return new ArrayList<>(validationErrors);
    }

    @Override
    public String toString() {
        return "Validation Errors: " + validationErrors;
    }

    public static class Validator<T> {
        private final T object;
        private final List<String> errors = new ArrayList<>();

        private Validator(T object) {
            this.object = object;
        }

        public static <T> Validator<T> of(T object) {
            return new Validator<>(object);
        }

        public Validator<T> validate(
                Predicate<T> validation,
                String errorMessage) {
            if (!validation.test(object)) {
                errors.add(errorMessage);
            }
            return this;
        }

        public T get() throws ValidationException {
            if (!errors.isEmpty()) {
                throw new ValidationException(errors);
            }
            return object;
        }
    }
}
