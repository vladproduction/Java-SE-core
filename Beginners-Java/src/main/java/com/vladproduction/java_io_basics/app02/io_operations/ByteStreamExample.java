package com.vladproduction.java_io_basics.app02.io_operations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Byte streams are used for handling raw binary data. Here's an example using FileInputStream and FileOutputStream
 * */
public class ByteStreamExample {
    public static void main(String[] args) {
        String inputFile = "src/main/java/com/vladproduction/java_io_basics/app02/io_operations/input.txt";
        String outputFile = "src/main/java/com/vladproduction/java_io_basics/app02/io_operations/output.txt";
        File input = new File(inputFile);
        File output = new File(outputFile);

        if (!input.exists()) {
            try {
                input.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        if (!output.exists()) {
            try{
                output.createNewFile();
            }catch (IOException e){
                throw new RuntimeException(e);
            }
        }

        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {

            int content;
            while ((content = fis.read()) != -1) {
                fos.write(content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
