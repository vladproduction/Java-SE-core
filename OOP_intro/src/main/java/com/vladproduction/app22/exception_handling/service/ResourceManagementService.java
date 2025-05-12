package com.vladproduction.app22.exception_handling.service;

import com.vladproduction.app22.exception_handling.custom.InsufficientResourceException;
import com.vladproduction.app22.exception_handling.custom.InvalidInputException;
import com.vladproduction.app22.exception_handling.util.ExceptionUtils;

import java.util.logging.Logger;

public class ResourceManagementService {

    private static final Logger LOGGER = Logger.getLogger(ResourceManagementService.class.getName());
    private int availableResources = 100;

    public void allocateResources(int requestedResources) throws InsufficientResourceException, InvalidInputException {

        try {
            // Validate input
            if (requestedResources <= 0) {
                throw new InvalidInputException("Resource allocation must be positive", String.valueOf(requestedResources), "Positive integer");
            }

            //Check resource availability
            if (requestedResources > availableResources) {
                throw new InsufficientResourceException("Not enough resources available", availableResources, requestedResources);
            }

            //Allocate resources
            availableResources -= requestedResources;
            LOGGER.info(() -> String.format("Allocated %d resources. Remaining: %d",
                    requestedResources, availableResources));

        } catch (InvalidInputException e) {
            // Log and rethrow with additional context
            LOGGER.warning(e.toString());
            ExceptionUtils.logException(e);
            throw e;

        }

    }

    public void releaseResources(int releasedResources) throws InvalidInputException {

        //prevent negative or zero release resources
        if (releasedResources <= 0) {
            throw new InvalidInputException("Resource release must be positive", String.valueOf(releasedResources), "Positive integer");
        }

        availableResources = availableResources + releasedResources;

        LOGGER.info(() -> String.format("Released %d resources. Remaining: %d",
                releasedResources, availableResources));

    }


}

























