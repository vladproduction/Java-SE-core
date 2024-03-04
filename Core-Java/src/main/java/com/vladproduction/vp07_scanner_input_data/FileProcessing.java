package com.vladproduction.vp07_scanner_input_data;

import java.io.File;
import java.util.Scanner;

public class FileProcessing {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("data.txt"));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // Process each line of data here (e.g., split, parse, and analyze)
                System.out.println(line);  // Basic example, replace with your specific processing logic
            }

            scanner.close();
        } catch (Exception e) {
            System.err.println("Error reading file: " + e);
        }
    }
}
