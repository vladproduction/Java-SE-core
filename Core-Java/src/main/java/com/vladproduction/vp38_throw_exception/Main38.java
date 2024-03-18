package com.vladproduction.vp38_throw_exception;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by vladproduction on 18-Mar-24
 */

/**Class Exception: java.lang.Object
 java.lang.Throwable
 java.lang.Exception
 All Implemented Interfaces:
 Serializable*/

public class Main38 {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        while (true){
            int x = Integer.parseInt(scanner.nextLine());
            if (x != 0){
                throw new IOException();
            }
        }
    }
}
