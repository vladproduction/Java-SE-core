package com.vladproduction.delegation;

class BlackAndWhitePrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("B&W Printer: " + message + " [in black and white]");
    }

    // Additional functionality specific to BlackAndWhitePrinter
    public void economyMode() {
        System.out.println("Enabling economy mode to save toner");
    }
}
