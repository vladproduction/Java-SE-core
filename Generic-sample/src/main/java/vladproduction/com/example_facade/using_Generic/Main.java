package vladproduction.com.example_facade.using_Generic;

// Client code
public class Main {
    public static void main(String[] args) {
        SubsystemA subsystemA = new SubsystemA();
        SubsystemB subsystemB = new SubsystemB();
        SubsystemC subsystemC = new SubsystemC();

        Facade<SubsystemA, SubsystemB, SubsystemC> facade = new Facade<>(subsystemA, subsystemB, subsystemC);
        facade.performOperations();
        // Output:
        // Performing operation A in Subsystem A
        // Performing operation B in Subsystem B
        // Performing operation C in Subsystem C
    }
}
