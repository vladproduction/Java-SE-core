package com.vladproduction.cohesion;

// File operations - High cohesion class focusing only on file-related operations
public class FileHandler {

    private String basePath;

    public FileHandler(String basePath) {
        this.basePath = basePath;
    }

    public void writeToFile(String filename, String content) {
        String fullPath = basePath + "/" + filename;
        System.out.println("Writing to file: " + fullPath);
        // In a real system, this would write to a file
    }

    public String readFromFile(String filename) {
        String fullPath = basePath + "/" + filename;
        System.out.println("Reading from file: " + fullPath);
        // In a real system, this would read from a file
        return "Content of " + filename;
    }

    public boolean deleteFile(String filename) {
        String fullPath = basePath + "/" + filename;
        System.out.println("Deleting file: " + fullPath);
        // In a real system, this would delete the file
        return true;
    }

}
