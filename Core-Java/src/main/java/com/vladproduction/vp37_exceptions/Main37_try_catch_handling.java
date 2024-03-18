package com.vladproduction.vp37_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by vladproduction on 18-Mar-24
 */

public class Main37_try_catch_handling {
    public static void main(String[] args) {

//        fileDoesNotExistException();
        fileExist_No_Exception();
    }

    private static void fileDoesNotExistException() {
        File file = new File("aaa");
        try {
            Scanner scanner = new Scanner(file); //FileNotFoundException: aaa (The system cannot find the file specified)
            System.out.println("/////after scanner logic/////");
        } catch (FileNotFoundException e) {
            /**in catch block we can handle exception by our own behaviour*/
            System.out.println("File does not exist");
        }
        System.out.println("/////after try_catch block logic continue/////");
    }

    private static void fileExist_No_Exception() {
        File file = new File("FileFor_vp37.txt");
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("/////after scanner logic/////");
            String string = scanner.nextLine();
            System.out.println("string = " + string);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
        System.out.println("/////after try_catch block logic continue/////");
    }
}
