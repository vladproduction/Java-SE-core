package com.vladproduction.app22.exception_handling.custom;

public class InsufficientResourceException extends Exception{

    private int availableResources;
    private int requestedResources;

    public InsufficientResourceException(String message, int availableResources, int requestedResources) {
        super(message);
        this.availableResources = availableResources;
        this.requestedResources = requestedResources;
    }

    public int getAvailableResources() {
        return availableResources;
    }

    public int getRequestedResources() {
        return requestedResources;
    }

    @Override
    public String toString() {
        return String.format("%s. Available resources: %d; Requested resources: %d", getMessage(), availableResources, requestedResources);
    }
}
