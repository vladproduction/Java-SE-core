package com.vladproduction.vp37_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by vladproduction on 18-Mar-24
 */

public class Main37_throwing_Exception_in_Main {
    public static void main(String[] args) throws FileNotFoundException {

        readFile(); //we have to throw Exception for this method as well (throws FileNotFoundException)
        /**in all methods where invoke our private method (readFile()) we have to handle exception or throw it*/

    }

    private static void readFile() throws FileNotFoundException {
        File file = new File("test");
        Scanner scanner = new Scanner(file);


    }

}
