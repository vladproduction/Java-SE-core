package com.vladproduction.delegation;

// Concrete implementations of the interface
class ColorPrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("Color Printer: " + message + " [in color]");
    }

    // Additional functionality specific to ColorPrinter
    public void printImage(String imagePath) {
        System.out.println("Printing image from " + imagePath + " in full color");
    }
}
