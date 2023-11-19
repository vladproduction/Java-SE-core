package vladproduction.com.app07;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(new Freshener());
        car.drive();
        Car car2 = new Car();
        car2.drive();
    }
}
