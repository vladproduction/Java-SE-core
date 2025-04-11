package com.vladproduction.app06.read_lines_handle_exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String FILE_TO_READ = "src/main/java/com/vladproduction/app06/read_lines_handle_exceptions/test-lines-reading.txt";

    public static void main(String[] args) {

        List<String> lines = readLines(FILE_TO_READ);
        for (String line : lines) {
            System.out.println(line);
        }

        //output:
        /*Line1
        Line2
        Line3
        Line4
        Line5*/

    }

    private static List<String> readLines(String fileName) {
        List<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + fileName);
            // Optionally rethrow or return empty list depending on requirements
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            throw new RuntimeException(e);
        }

        return lines;
    }

}
