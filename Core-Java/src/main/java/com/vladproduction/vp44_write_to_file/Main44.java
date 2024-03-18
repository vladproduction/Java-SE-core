package com.vladproduction.vp44_write_to_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by vladproduction on 18-Mar-24
 */

public class Main44 {
    public static void main(String[] args) throws FileNotFoundException {

        //writing to file:
        File file = new File("FileFor_vp44.txt");
        PrintWriter pw = new PrintWriter(file);

        pw.println("Hello world!");
        pw.println("new row");
        pw.close();

    }
}
