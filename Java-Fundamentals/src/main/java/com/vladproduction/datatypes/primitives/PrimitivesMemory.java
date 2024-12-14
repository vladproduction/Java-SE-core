package com.vladproduction.datatypes.primitives;

public class PrimitivesMemory {
    public static void main(String[] args) {

        String cityOfFlat = "Minsk";
        char entrance = '1';
        boolean isInTheCenter = true;
        Object country = new Object();
        double square = 104.79;
        int countOfFloors = 9;
        byte appartmentsCount = 3;

        // Calculate total memory (primitives taken)
        byte totalMemory = calculateMemory(entrance, isInTheCenter, square, countOfFloors, appartmentsCount);
        System.out.println("Total memory used: " + totalMemory + " bytes");

    }

    public static byte calculateMemory(char entrance, boolean isInTheCenter,
                                       double square, int countOfFloors, byte appartmentsCount){
        /*Primitive Types:
        char - 2 bytes.
        short - 2 bytes.
        byte - 1 byte.
        boolean - 1 byte.
        double - 8 bytes.
        int - 4 bytes.*/

        byte memory = 0;
        //  For Primitive types
        memory += 2; // char (2 bytes)
        memory += 1; // byte
        memory += 1; // boolean
        memory += 8; // double
        memory += 4; // int

        return memory; //2 (char) + 1 (boolean) + 8 (double) + 4 (int) + 1 (byte) = 16 bytes

    }


}
