package com.vladproduction.app22.exception_handling.advanced;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

//Functional Exception Handling
/**
 * Functional Exception Handling (FunctionalExceptionHandler)
 * Wrap potentially throwing operations
 * Convert exceptions to Optional
 * Provide fallback mechanisms
 * Transform exceptions
 * */
public class FunctionalExceptionHandler {

    private static final Logger LOGGER = Logger.getLogger(FunctionalExceptionHandler.class.getName());

    /**
     * Wrap a potentially throwing method into an Optional
     * @param supplier Method that might throw an exception
     * @param <T> Return type
     * @return Optional containing the result or empty if exception occurs
     */
    public static <T> Optional<T> tryGet(Supplier<T> supplier) {
        try {
            return Optional.ofNullable(supplier.get());
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Operation failed", e);
            return Optional.empty();
        }
    }

    /**
     * Handle exceptions with a fallback value
     * @param supplier Method that might throw an exception
     * @param fallback Fallback value if exception occurs
     * @param <T> Return type
     * @return Result or fallback value
     */
    public static <T> T getOrDefault(Supplier<T> supplier, T fallback) {
        try {
            return supplier.get();
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Operation failed, using default", e);
            return fallback;
        }
    }

    /**
     * Transform exception to another type
     * @param supplier Method that might throw an exception
     * @param exceptionTransformer Function to transform the exception
     * @param <T> Return type
     * @param <E> Exception type
     * @return Result
     * @throws E Transformed exception
     */
    public static <T, E extends Exception> T mapException(
            Supplier<T> supplier,
            Function<Exception, E> exceptionTransformer) throws E {
        try {
            return supplier.get();
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Original exception occurred", e);
            throw exceptionTransformer.apply(e);
        }
    }

}
