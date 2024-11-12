package com.vladproduction.narrowing_drive_casting_primitives;

public class IntegerReductionExample {
    public static void main(String[] args) {
        // Example integer values
        int originalIntPositive = 130; // A positive integer
        int originalIntNegative = -130; // A negative integer

        // Reducing int to byte
        byte reducedToBytePositive = (byte) originalIntPositive;
        byte reducedToByteNegative = (byte) originalIntNegative;

        // Display original and reduced values
        System.out.println("Original int (positive): " + originalIntPositive);
        System.out.println("Reduced to byte (positive): " + reducedToBytePositive);

        System.out.println("Original int (negative): " + originalIntNegative);
        System.out.println("Reduced to byte (negative): " + reducedToByteNegative);

        // Demonstrating loss of value
        int overflowExample = 300; // This will overflow as a byte
        byte reducedOverflow = (byte) overflowExample;
        System.out.println("Original int (overflow example): " + overflowExample);
        System.out.println("Reduced to byte (overflowed): " + reducedOverflow);
    }
}
