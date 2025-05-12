package com.vladproduction.app22.exception_handling.simple_examples;

import java.io.*;

public class CheckedException {

    public static void main(String[] args) {
        System.out.println("Program started.");
        System.out.println("Program processed...");

        String filePath = "src/main/java/com/vladproduction/app22/exception_handling/simple_examples/file.txt";

        // try-with-resources: automatically closes resources
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // print each line of the file
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException while reading file: " + e.getMessage());
        }

        System.out.println("Program finished.");
    }

}
