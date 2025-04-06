package com.vladproduction.delegation;

class LaserPrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("Laser Printer: " + message + " [high resolution]");
    }

    // Additional functionality specific to LaserPrinter
    public void printDuplex(String document) {
        System.out.println("Printing " + document + " on both sides");
    }
}
