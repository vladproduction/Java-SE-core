package com.vladproduction.story;

public class IntegerDemo4 {
    public static void main(String[] args) {
        int a = 500; // binary: 111110100

        int highestOneBit = Integer.highestOneBit(a); // 256 : 100000000
        System.out.println("highestOneBit = " + highestOneBit);
        int lowestOneBit = Integer.lowestOneBit(a); // 4 : 100
        System.out.println("lowestOneBit = " + lowestOneBit);
        int bitCount = Integer.bitCount(a); // 6
        System.out.println("bitCount = " + bitCount);

        int leadingZeros = Integer.numberOfLeadingZeros(a); // 23
        System.out.println("leadingZeros = " + leadingZeros);

        System.out.println("0".repeat(leadingZeros) + Integer.toBinaryString(a));
        // prints "00000000000000000000000111110100"
    }
}
