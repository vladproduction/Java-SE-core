package com.vladproduction.app22.exception_handling.util;

import com.vladproduction.app22.exception_handling.custom.InvalidInputException;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.time.LocalDateTime;
import java.util.logging.Logger;

public class ExceptionUtils {

    private static final Logger LOGGER = Logger.getLogger(ExceptionUtils.class.getName());

    //method to get StackTrace as String
    public static String getStackTraceAsString(Throwable throwable) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        throwable.printStackTrace(pw);

        return sw.toString();
    }

    //method to log exception
    public static void logException(Throwable e) {
        LOGGER.severe(() -> String.format(
                "[%s] Exception occurred: %s\n%s",
                LocalDateTime.now(),
                e.getMessage(),
                getStackTraceAsString(e))
        );
    }

    //method to validate input:
    public static void validateInput(String input) throws InvalidInputException {
        if(input == null || input.trim().isEmpty()){
            throw new InvalidInputException("Input cannot be null or empty", input, "Not-empty String");
        }
    }

}



















