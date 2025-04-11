package com.vladproduction.java_io_basics.app05.handling_file_operations;

import java.io.*;

public class FileCreateExample {
    public static void main(String[] args) {
        File file = new File("src/main/java/com/vladproduction/java_io_basics/app05/handling_file_operations/new_file.txt");
        createFile(file);
        deleteFile(file);
        checkIfExist(file);
    }

    private static void checkIfExist(File file) {
        if (file.exists()) {
            System.out.println("File exists: (path:" + file.getPath() + " & name:" + file.getName() + ")" );
        } else {
            System.out.println("File does not exist.");
        }
    }

    private static void deleteFile(File file) {
        if (file.delete()) {
            System.out.println("File deleted: " + file.getName());
        } else {
            System.out.println("Failed to delete the file: it does not exist");
        }
    }

    private static void createFile(File file) {
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
