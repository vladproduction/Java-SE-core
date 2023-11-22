package Constructor_examples.ch01;

public class Main {
    public static void main(String[] args) {
        Vehicles vehicles = new Vehicles("bmw", 50000);
        Vehicles vehicles2 = new Vehicles("bmw");
        vehicles.info();
        vehicles2.info();

    }


}
