package com.vladproduction.expansion_drive_casting_primitives;

/**
 * Expansion drive:
 *  -conversions occur without compilation errors but may lead to data loss;
 *  -conversions between types with different precisions can lead to inaccuracies in the values represented;
 *
 * 1. Conversion from int to float;
 * 2. Conversion from long to float;
 * 3. Conversion from long to double
 * */
public class DataLossMayOccur {
    public static void main(String[] args) {

        //1. Conversion from int to float;
        int intValue = 123456789; // An int value
        float floatValue = intValue; // Conversion from int to float
        System.out.println("*** Conversion from int to float: ***");
        System.out.println("Int value: " + intValue); //Int value: 123456789
        System.out.println("Float value: " + floatValue); //Float value: 1.2345679E8

        //2. Conversion from long to float;
        System.out.println();
        System.out.println("*** Conversion from long to float: ***");
        long longValue = 9876543210L; // A long value
        float floatValue1 = longValue; // Conversion from long to float
        System.out.println("Long value: " + longValue);//Long value: 9876543210
        System.out.println("Float value: " + floatValue1);//Float value: 9.876543E9


        //3. Conversion from long to double;
        System.out.println();
        System.out.println("*** Conversion from long to double: ***");
        long longValue1 = 9223372036854775807L; // Max value of long
        double doubleValue = longValue; // Conversion from long to double
        System.out.println("Long value: " + longValue1);//Long value: 9223372036854775807
        System.out.println("Double value: " + doubleValue); //Double value: 9.87654321E9

    }
}
