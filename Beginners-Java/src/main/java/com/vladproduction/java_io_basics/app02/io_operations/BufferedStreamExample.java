package com.vladproduction.java_io_basics.app02.io_operations;

import java.io.*;

/**
 * Buffered streams improve performance by using a buffer to read/write data in larger chunks.
 * Here's an example using BufferedReader and BufferedWriter
 * */
public class BufferedStreamExample {
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

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
