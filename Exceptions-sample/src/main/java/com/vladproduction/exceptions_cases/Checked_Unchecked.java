package com.vladproduction.exceptions_cases;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Checked_Unchecked {

    // Unchecked - no need to use {try/catch}
    // Checked - must use {try/catch}

    public static void main(String[] args) {
        //Unchecked or Runtime Exceptions
        System.out.println("Runtime:");
        String text = "123";
        int a = Integer.parseInt(text);
        System.out.println("a="+a);

        //CheckedException
        System.out.println("Unchecked:");
        try {
            File file = new File("src/main/java/Exceptions/com/TextFile.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
