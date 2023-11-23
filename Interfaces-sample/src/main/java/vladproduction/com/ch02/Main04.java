package vladproduction.com.ch02;

public class Main04 {

    public static void main(String[] args) {
        Device device1 = new Computer();
        Device device2 = new Tv();
        System.out.println("--------device1---------");
        device1.turnOn();
        device1.turnOff();
        System.out.println("--------device2---------");
        device2.turnOn();
        device2.turnOff();
    }

}
