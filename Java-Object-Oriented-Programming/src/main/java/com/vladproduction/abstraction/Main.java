package com.vladproduction.abstraction;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        DigitsOnlyFileReader digitsOnlyFileReader = new DigitsOnlyFileReader("message.txt");

        System.out.println(digitsOnlyFileReader.readFile());
        System.out.println(digitsOnlyFileReader.getPath());

        /*[22, 11, 4] secret message read from file
        message.txt*/

    }
}
