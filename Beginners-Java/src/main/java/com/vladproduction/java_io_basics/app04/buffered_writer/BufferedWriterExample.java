package com.vladproduction.java_io_basics.app04.buffered_writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        String content = """
                Commonly Used Classes:
                * File: Represents file and directory pathnames.
                * FileInputStream: Reads raw bytes from a file.
                * FileOutputStream: Writes raw bytes to a file.
                * FileReader: Reads characters from a file.
                * FileWriter: Writes characters to a file.
                * BufferedReader: Reads text from an input stream, buffering characters to provide efficient reading.
                * BufferedWriter: Writes text to an output stream, buffering characters for efficient writing.
                """;
        File file = new File("src/main/java/com/vladproduction/java_io_basics/app04/buffered_writer/BufferedWriterExample.txt");
        write(content, file);
        System.out.println(content);
    }

    private static void write(String content, File file) {
        if (content.length() == 0 || content.length() > 1024 || content.trim().length() == 0) {
            throw new RuntimeException("Content is empty or too long (> 1024 bytes)");
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
