package com.vladproduction.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionsDemo {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
