package vladproduction.com.ch04_enum_as_field;

import java.util.Scanner;

public class FreshJuice {
    enum FreshJuiceSize { SMALL, MEDIUM, LARGE }

    // field named size of type FreshJuiceSize.
    // This means that size can only hold one of the three predefined values defined in the FreshJuiceSize enum
    FreshJuiceSize size;

    // Constructor to set the size
    public FreshJuice(FreshJuiceSize size) {
        this.size = size;
    }

    // Method to get a description of the juice
    public String getDescription() {
        return "Fresh Juice Size: " + size;
    }

    public static void main(String args[]) {
        // Create a scanner for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter juice size (SMALL, MEDIUM, LARGE): ");
        
        // Get user input and convert it to FreshJuiceSize enum
        String input = scanner.nextLine().toUpperCase();
        FreshJuiceSize size;
        
        try {
            size = FreshJuiceSize.valueOf(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid size! Defaulting to MEDIUM.");
            size = FreshJuiceSize.MEDIUM; // Default value for invalid input
        }

        // Create a FreshJuice object with user-defined or default size
        FreshJuice juice = new FreshJuice(size);

        // Print the description
        System.out.println(juice.getDescription());
        
        // Close the scanner
        scanner.close();
    }
}