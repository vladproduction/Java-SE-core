package com.vladproduction.delegation;

// Another example of delegation - delegating to multiple objects
class PrintingSystem {
    private Printer documentPrinter;
    private Printer receiptPrinter;
    private Printer labelPrinter;

    public PrintingSystem() {
        this.documentPrinter = new LaserPrinter();
        this.receiptPrinter = new BlackAndWhitePrinter();
        this.labelPrinter = new ColorPrinter();
    }

    // Delegates to different printers based on document type
    public void printDocument(String content, String type) {
        System.out.println("Received print job of type: " + type);

        switch (type) {
            case "document":
                documentPrinter.print(content);
                break;
            case "receipt":
                receiptPrinter.print(content);
                break;
            case "label":
                labelPrinter.print(content);
                break;
            default:
                System.out.println("Unknown document type: " + type);
        }
    }

    // Setters for different printer types
    public void setDocumentPrinter(Printer printer) {
        this.documentPrinter = printer;
    }

    public void setReceiptPrinter(Printer printer) {
        this.receiptPrinter = printer;
    }

    public void setLabelPrinter(Printer printer) {
        this.labelPrinter = printer;
    }
}
