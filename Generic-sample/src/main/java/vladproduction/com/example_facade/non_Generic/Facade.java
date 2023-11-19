package vladproduction.com.example_facade.non_Generic;

// Facade class
class Facade {
    private Subsystem1 subsystem1;
    private Subsystem2 subsystem2;
    private Subsystem3 subsystem3;

    public Facade() {
        subsystem1 = new Subsystem1();
        subsystem2 = new Subsystem2();
        subsystem3 = new Subsystem3();
    }

    public void performOperations() {
        subsystem1.operation1();
        subsystem2.operation2();
        subsystem3.operation3();
    }
}
