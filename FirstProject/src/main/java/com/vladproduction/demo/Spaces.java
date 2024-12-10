package com.vladproduction.demo;

import java.util.Arrays;

public class Spaces {
    public static void main(String[] args) {
        String cityOfFlat = "Minsk";
        char entrance = '1';
        boolean isInTheCenter = true;
        Object country = new Object();
        double square = 104.79;
        int countOfFloors = 9;
        byte appartmentsCount = 3;

        /*The size of primitive data types is:
        byte - 1 byte
        boolean - 1 byte (it can occupy 1 bit in theory, but in practice 1 byte is allocated)
        char - 2 bytes
        short - 2 bytes
        int - 4 bytes
        float - 4 bytes
        long - 8 bytes
        double - 8 bytes
        calculate the memory occupied by primitive types in your class:
        char entrance - 2 bytes
        boolean isInTheCenter - 1 byte
        double square - 8 bytes
        int countOfFloors - 4 bytes
        byte appartmentsCount - 1 byte
        sum it up:
        2 (char) + 1 (boolean) + 8 (double) + 4 (int) + 1 (byte) = 16 bytes
        memory occupied by primitive types in the Memory class is 16 byte.*/
    }
}
