package com.vladproduction.vp37_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by vladproduction on 18-Mar-24
 */

public class Main37_try_catch {
    public static void main(String[] args) {

        File file = new File("aaa");
        try {
            Scanner scanner = new Scanner(file); //FileNotFoundException: aaa (The system cannot find the file specified)
        } catch (FileNotFoundException e) {
            /**in catch block we can handle exception by our own behaviour*/
            e.printStackTrace();
        }
    }
}
