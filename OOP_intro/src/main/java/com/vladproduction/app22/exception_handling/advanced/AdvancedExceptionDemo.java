package com.vladproduction.app22.exception_handling.advanced;

import java.util.concurrent.Callable;
import java.util.logging.Logger;

//Demonstration of Advanced Exception Techniques
public class AdvancedExceptionDemo {

    private static final Logger LOGGER = Logger.getLogger(AdvancedExceptionDemo.class.getName());

    public static void main(String[] args) {
        AdvancedExceptionDemo demo = new AdvancedExceptionDemo();

        demo.demonstrateRetryMechanism();
        demo.demonstrateValidation();
        demo.demonstrateContextPreservingException();
        demo.demonstrateFunctionalExceptionHandling();
    }

    public void demonstrateRetryMechanism() {
        Callable<String> unreliableOperation = () -> {
            // Simulate an unreliable operation
            if (Math.random() < 0.7) {
                throw new RuntimeException("Temporary failure");
            }
            return "Success";
        };

        try {
            String result = ExceptionRetryHandler.retry(unreliableOperation, 3, 1000);
            LOGGER.info("Operation result: " + result);
        } catch (Exception e) {
            LOGGER.severe("All retry attempts failed: " + e.getMessage());
        }
    }

    public void demonstrateValidation() {
        try {
            User user = ValidationException.Validator
                    .of(new User("John", -5))
                    .validate(u -> u.age() >= 0, "Age cannot be negative")
                    .validate(u -> u.name() != null && !u.name().isEmpty(), "Name is required")
                    .get();

            LOGGER.info("User validated: " + user);
        } catch (ValidationException e) {
            LOGGER.severe("Validation failed: " + e.getValidationErrors());
        }
    }

    public void demonstrateContextPreservingException() {
        try {
            performRiskyOperation();
        } catch (ContextPreservingException e) {
            LOGGER.severe(String.format(
                    "Trace ID: %s, Error: %s, Context: %s",
                    e.getTraceId(),
                    e.getMessage(),
                    e.getContext()
            ));
        }
    }

    private void performRiskyOperation() throws ContextPreservingException {
        try {
            // Simulated risky operation
            throw new IllegalArgumentException("Something went wrong");
        } catch (IllegalArgumentException e) {
            throw new ContextPreservingException(
                    "Operation failed",
                    e,
                    new ContextPreservingException.ErrorContext()
                            .withUserId("user123")
                            .withRequestId("req-456")
                            .withAdditionalInfo("Additional context details")
            );
        }
    }

    public void demonstrateFunctionalExceptionHandling() {
        // Optional-based exception handling
        var result = FunctionalExceptionHandler.tryGet(() -> {
            // Simulated operation that might fail
            if (Math.random() < 0.5) {
                throw new RuntimeException("Random failure");
            }
            return "Success";
        });

        result.ifPresentOrElse(
                r -> LOGGER.info("Operation succeeded: " + r),
                () -> LOGGER.warning("Operation failed")
        );

        // Fallback value demonstration
        String safeResult = FunctionalExceptionHandler.getOrDefault(
                () -> {
                    if (Math.random() < 0.5) {
                        throw new RuntimeException("Failure");
                    }
                    return "Success";
                },
                "Default Value"
        );
        LOGGER.info("Safe result: " + safeResult);
    }

    // Helper class for validation example
        private record User(String name, int age) {
    }



}
