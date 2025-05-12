package com.vladproduction.app22.exception_handling.service;

import com.vladproduction.app22.exception_handling.custom.InvalidInputException;
import com.vladproduction.app22.exception_handling.util.ExceptionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class DataProcessingService {

    private static final Logger LOGGER = Logger.getLogger(DataProcessingService.class.getName());

    public List<String> processData(List<String> inputData) throws InvalidInputException {
        // Validate input list
        if (inputData == null) {
            throw new InvalidInputException(
                    "Input data cannot be null",
                    "null",
                    "Non-null list of strings"
            );
        }

        List<String> processedData = new ArrayList<>();

        for (String data : inputData) {
            try {
                // Validate each data item
                ExceptionUtils.validateInput(data);

                // Process data (simulated transformation)
                String processedItem = data.trim().toUpperCase();
                processedData.add(processedItem);

                LOGGER.info(() -> "Processed item: " + processedItem);
            } catch (InvalidInputException e) {
                // Log problematic item but continue processing others
                LOGGER.warning(() -> "Skipping invalid item: " + data);
                ExceptionUtils.logException(e);
            }
        }

        return processedData;
    }

    // Multi-catch example
    public void complexOperation() {
        try {
            // Simulated complex operation that might throw multiple exceptions
            performRiskyOperation();
        } catch (IllegalArgumentException | NullPointerException e) {
            // Handle multiple exception types in one catch block
            LOGGER.severe(() -> "Operation failed: " + e.getMessage());
            ExceptionUtils.logException(e);
        }
    }

    private void performRiskyOperation() {
        // Simulated risky operation
        throw new IllegalArgumentException("Something went wrong");
    }

}
