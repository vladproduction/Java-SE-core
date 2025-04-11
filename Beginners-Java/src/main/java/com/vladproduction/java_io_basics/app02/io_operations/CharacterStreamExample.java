package com.vladproduction.java_io_basics.app02.io_operations;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Character streams are used for handling textual data. Here's an example using FileReader and FileWriter
 * */
public class CharacterStreamExample {
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

        try (FileReader fr = new FileReader(inputFile);
             FileWriter fw = new FileWriter(outputFile)) {

            int content;
            while ((content = fr.read()) != -1) {
                fw.write(content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
