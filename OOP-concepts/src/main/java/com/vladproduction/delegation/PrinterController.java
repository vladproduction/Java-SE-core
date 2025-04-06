package com.vladproduction.delegation;

// Delegator class
class PrinterController implements Printer {
    private Printer currentPrinter; // Delegation: this object will do the actual work

    // Default constructor
    public PrinterController() {
        // Default to a basic printer
        this.currentPrinter = new BlackAndWhitePrinter();
    }

    // Constructor with specific printer
    public PrinterController(Printer printer) {
        this.currentPrinter = printer;
    }

    // Set a different printer implementation at runtime
    public void setPrinter(Printer printer) {
        this.currentPrinter = printer;
        System.out.println("Switched to " + printer.getClass().getSimpleName());
    }

    // Delegated method - PrinterController delegates the printing to currentPrinter
    @Override
    public void print(String message) {
        // Delegation in action: letting the currentPrinter do the work
        currentPrinter.print(message);
    }

    // Method that uses delegation to access specific printer functionality
    public void performSpecialFunction(String input) {
        if (currentPrinter instanceof ColorPrinter) {
            ((ColorPrinter) currentPrinter).printImage(input);
        } else if (currentPrinter instanceof BlackAndWhitePrinter) {
            ((BlackAndWhitePrinter) currentPrinter).economyMode();
            currentPrinter.print(input);
        } else if (currentPrinter instanceof LaserPrinter) {
            ((LaserPrinter) currentPrinter).printDuplex(input);
        } else {
            System.out.println("No special function available for current printer");
            currentPrinter.print(input);
        }
    }
}
