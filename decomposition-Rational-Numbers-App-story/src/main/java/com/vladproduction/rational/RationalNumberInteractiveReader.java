package com.vladproduction.rational;

import java.util.Scanner;

public class RationalNumberInteractiveReader {

    private final String variableName;

    public RationalNumberInteractiveReader(final String variableName) {
        this.variableName = variableName;
    }

    public RationalNumber read(){
        final Scanner scanner = new Scanner(System.in);

        System.out.printf("Entering the %s... ", variableName);
        System.out.println();

        System.out.print("Numerator: ");
        int numerator = scanner.nextInt();
        System.out.print("Denominator: ");
        int denominator = scanner.nextInt();
        return new RationalNumber(numerator, denominator);
    }
}
