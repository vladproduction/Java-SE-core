package com.vladproduction.app22.exception_handling.advanced;

import java.util.concurrent.Callable;
import java.util.logging.Logger;

//Advanced Exception Retry Mechanism
/**
 * Exception Retry Mechanism (ExceptionRetryHandler)
 * Provides a generic retry method for operations that might fail temporarily
 * Configurable number of attempts and delay between retries
 * Logs each retry attempt
 * Useful for network calls, external service interactions
 * */
public class ExceptionRetryHandler {

    private static final Logger LOGGER = Logger.getLogger(ExceptionRetryHandler.class.getName());

    /**
     * Retry mechanism with configurable attempts and delay
     * @param operation The operation to execute
     * @param maxAttempts Maximum number of retry attempts
     * @param delayMillis Delay between retry attempts
     * @param <T> Return type of the operation
     * @return Result of the operation
     * @throws Exception If all retry attempts fail
     */
    public static <T> T retry(Callable<T> operation, int maxAttempts, long delayMillis) throws Exception{

        int attempts = 0;
        Exception lastException = null;

        while (attempts < maxAttempts){
            try{
                attempts++;
                return operation.call();
            }catch (Exception e){
                lastException = e;
                int finalAttempts = attempts;
                LOGGER.warning(()->String.format("Attempt %d failed: %s", finalAttempts, e.getMessage()));

                // Only wait and retry if not the last attempt
                if (attempts < maxAttempts) {
                    try {
                        Thread.sleep(delayMillis);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                        throw new RuntimeException("Retry interrupted", ie);
                    }
                }
            }
        }

        LOGGER.severe(() -> "All retry attempts failed");
        assert lastException != null;
        throw lastException;
    }

    /**
     * Safe execution with fallback mechanism
     * @param operation Primary operation to execute
     * @param fallback Fallback operation if primary fails
     * @param <T> Return type of the operation
     * @return Result of primary or fallback operation
     */
    public static <T> T executeWithFallback(
            Callable<T> operation,
            Callable<T> fallback) {
        try {
            return operation.call();
        } catch (Exception e) {
            LOGGER.warning("Primary operation failed, executing fallback");
            try {
                return fallback.call();
            } catch (Exception fallbackException) {
                LOGGER.severe("Fallback operation also failed");
                throw new RuntimeException("Both primary and fallback operations failed", fallbackException);
            }
        }
    }

}
