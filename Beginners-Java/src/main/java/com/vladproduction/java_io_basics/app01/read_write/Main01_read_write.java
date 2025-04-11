package com.vladproduction.java_io_basics.app01.read_write;

import java.io.*;
import java.util.Scanner;

public class Main01_read_write {
    public static void main(String[] args) {

        File file = new File("src/main/java/com/vladproduction/java_io_basics/app01/read_write/read_write.txt");

        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        //trying to write smth to file
        try {
            PrintWriter pw = new PrintWriter(file);
            System.out.println("Enter text: ");
            Scanner in = new Scanner(System.in);
            String userInput = in.nextLine();
            pw.println(userInput);

            pw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        //here we are trying to read from this file directly into console:
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("src/main/java/com/vladproduction/java_io_basics/app01/read_write/read_write.txt"));
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
