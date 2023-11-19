package vladproduction.com.example_facade.using_Generic;

// Facade class
class Facade<T extends SubsystemA, U extends SubsystemB, V extends SubsystemC> {
    private T subsystemA;
    private U subsystemB;
    private V subsystemC;

    public Facade(T subsystemA, U subsystemB, V subsystemC) {
        this.subsystemA = subsystemA;
        this.subsystemB = subsystemB;
        this.subsystemC = subsystemC;
    }

    public void performOperations() {
        subsystemA.operationA();
        subsystemB.operationB();
        subsystemC.operationC();
    }
}
