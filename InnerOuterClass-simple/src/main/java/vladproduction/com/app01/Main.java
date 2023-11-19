package vladproduction.com.app01;

public class Main {
    public static void main(String[] args) {
        Car bmw1 = new BMW("x5","black", 20000);
        bmw1.printAll();
        bmw1.engine.start();

        bmw1.engine.stop();
    }
}
