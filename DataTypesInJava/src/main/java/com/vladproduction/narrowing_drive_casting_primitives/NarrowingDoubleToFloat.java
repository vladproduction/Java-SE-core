package com.vladproduction.narrowing_drive_casting_primitives;

public class NarrowingDoubleToFloat {
    public static void main(String[] args) {
        // Example of loss of accuracy
        double highPrecisionDouble = 123456789.123456789;
        float floatValue = (float) highPrecisionDouble; // Narrowing conversion from double to float

        // Display the values
        System.out.println("Original double (high precision): " + highPrecisionDouble);
        System.out.println("Converted float (loss of accuracy): " + floatValue);

        // Example of loss of range (non-zero to zero)
        double verySmallDouble = 1e-40; // A very small number
        float smallFloatValue = (float) verySmallDouble; // Narrowing conversion from double to float

        // Display the values
        System.out.println("Original double (very small): " + verySmallDouble);
        System.out.println("Converted float (loss of range, expected non-zero): " + smallFloatValue);

        // Example of loss of range (finite to infinite)
        double largeDouble = 1e40; // A very large number
        float largeFloatValue = (float) largeDouble; // Narrowing conversion from double to float

        // Display the values
        System.out.println("Original double (large number): " + largeDouble);
        System.out.println("Converted float (loss of range, expected infinity): " + largeFloatValue);

        System.out.println();
        //notation 1.0e-46 represents scientific notation, where e-46 indicates that the decimal point is moved 46 places to the left.
        double valDouble = 1.0e-46;//is a very small number (0.000000000000000000000000000000000000000000000001).
        float valFloat = (float) valDouble;
        System.out.println(valDouble + " -> " + valFloat);
    }
}
