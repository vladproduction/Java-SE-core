package com.vladproduction.in_out_files;

import java.io.*;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {

        File file = new File("text.txt");

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

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("text.txt"));
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
