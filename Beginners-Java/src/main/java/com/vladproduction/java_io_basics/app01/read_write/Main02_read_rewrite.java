package com.vladproduction.java_io_basics.app01.read_write;

import java.io.*;
import java.util.Scanner;

public class Main02_read_rewrite {
    public static void main(String[] args) {

        /*in this case we do not rewrite information, we are going to add text*/
        File file = new File("src/main/java/com/vladproduction/java_io_basics/app01/read_write/read_rewrite.txt");

        /*creating file*/
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        //trying to write smth to file
        String contex = readFile();
        try {
            PrintWriter pw = new PrintWriter(file);
            System.out.println("Enter text: ");
            Scanner in = new Scanner(System.in);
            String userInput = in.nextLine();
            contex += userInput;
            pw.println(contex);

            pw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        /*read from file*/
        System.out.println(readFile());

    }

    public static String readFile(){

        BufferedReader br = null;
        StringBuilder result = new StringBuilder();
        try {

            br = new BufferedReader(new FileReader("src/main/java/com/vladproduction/java_io_basics/app01/read_write/read_rewrite.txt"));
            String line;
            while ((line = br.readLine()) != null){
                result.append(line).append("\n");
            }
            br.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result.toString();
    }


}
