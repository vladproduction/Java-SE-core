package com.vladproduction.vp39_checked_unchecked;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by vladproduction on 18-Mar-24
 */

public class Main39 {
    public static void main(String[] args) {
        //Checked Exception (Compile time exception) - exceptional condition
//        checked();

        //Unchecked Exception (Compile time exception) - error, so we have to fix it
//        unchecked_ArithmeticEx();
//        unchecked_NullPointer();
//        unchecked_OutOfBounds();

    }

    private static void checked(){
        File file = new File("test");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("exceptional condition in coding"); //
        }
    }

    private static void unchecked_ArithmeticEx(){
        int a = 1/0; //ArithmeticException: / by zero
        System.out.println(a);
    }

    private static void unchecked_NullPointer(){
        String name = null;
        name.hashCode();
    }

    private static void unchecked_OutOfBounds(){
        int [] arr = new int[2];
        System.out.println(arr[2]);
    }

}
