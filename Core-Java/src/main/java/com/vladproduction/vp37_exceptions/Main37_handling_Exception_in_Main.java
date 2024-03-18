package com.vladproduction.vp37_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by vladproduction on 18-Mar-24
 */

public class Main37_handling_Exception_in_Main {
    public static void main(String[] args)  {

        try {
            readFile(); //we have to throw Exception for this method as well (throws FileNotFoundException)
        } catch (FileNotFoundException e) {
            System.out.println("Handling Exception in Main method");
        }
        /**in all methods where invoke our private method (readFile()) we have to handle exception or throw it*/

    }

    private static void readFile() throws FileNotFoundException {
        File file = new File("test"); //if file does not exist
//        File file = new File("FileFor_vp37.txt"); //file exist: no exception throw
        Scanner scanner = new Scanner(file);


    }

}
