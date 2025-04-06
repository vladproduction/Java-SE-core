package com.vladproduction.delegation;

public class DelegationDemo {
    public static void main(String[] args) {
        System.out.println("===== Basic Delegation Example =====");
        // Create a PrinterController that initially uses a default printer
        PrinterController controller = new PrinterController();
        
        // Use the controller to print (delegates to current printer)
        controller.print("Hello, Delegation Pattern!");
        
        // Change printer at runtime
        controller.setPrinter(new ColorPrinter());
        controller.print("Hello with a different printer");
        
        // Change printer again
        controller.setPrinter(new LaserPrinter());
        controller.print("Yet another printer");
        
        System.out.println("\n===== Special Functions with Delegation =====");
        // Using special functions through delegation
        controller.setPrinter(new ColorPrinter());
        controller.performSpecialFunction("vacation-photo.jpg");
        
        controller.setPrinter(new BlackAndWhitePrinter());
        controller.performSpecialFunction("economy text document");
        
        controller.setPrinter(new LaserPrinter());
        controller.performSpecialFunction("contract.pdf");
        
        System.out.println("\n===== Multi-Delegation Example =====");
        // Create a printing system that delegates to different printers
        PrintingSystem system = new PrintingSystem();
        
        // Print different types of documents
        system.printDocument("Annual Report", "document");
        system.printDocument("Store Purchase", "receipt");
        system.printDocument("Product Information", "label");
        
        // Change one of the delegated printers
        system.setReceiptPrinter(new LaserPrinter());
        system.printDocument("Online Order", "receipt");
        
        System.out.println("\nKey benefits of delegation:");
        System.out.println("1. Composition over inheritance");
        System.out.println("2. Dynamic behavior changes at runtime");
        System.out.println("3. Separation of concerns");
        System.out.println("4. Flexibility to switch implementations");
    }
}