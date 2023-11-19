package vladproduction.com.example_facade.non_Generic;

// Client code
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.performOperations();
        // Output:
        // Subsystem 1 is performing operation 1.
        // Subsystem 2 is performing operation 2.
        // Subsystem 3 is performing operation 3.
    }
}
