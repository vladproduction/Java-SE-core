package vladproduction.com.example_proxy;

// Real subject class
class RealSubject implements Subject {
    @Override
    public void doAction() {
        System.out.println("RealSubject is performing action.");
    }
}
