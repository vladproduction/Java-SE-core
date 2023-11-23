package vladproduction.com.ch02;

public class Computer implements Device, Electircy {
    @Override
    public void turnOn() {
        System.out.println("Comp on");
    }

    @Override
    public void turnOff() {
        System.out.println("Comp off");
    }

    @Override
    public void showEnergy() {
        System.out.println("Computer energy");
    }
}
