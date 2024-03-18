package com.vladproduction.vp39_checked_unchecked.checked;

/**
 * Created by vladproduction on 18-Mar-24
 */

public class Compile_Time_Safety {

    /**public class FileProcessor {

    public void readFile(String filename) throws IOException {
        // Code to open and read the file
        FileReader reader = new FileReader(filename); // Potential IOException

        // ... (process file contents) ...

        reader.close(); // Potential IOException
    }
}

public class Main {

    public static void main(String[] args) {
        FileProcessor processor = new FileProcessor();
        try {
            processor.readFile("data.txt");  // Need to handle IOException
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}*/

}
