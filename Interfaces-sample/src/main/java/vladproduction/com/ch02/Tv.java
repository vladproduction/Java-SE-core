package vladproduction.com.ch02;

public class Tv implements Device, Electircy {
    @Override
    public void turnOn() {
        System.out.println("TV - on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV - off");
    }

    @Override
    public void showEnergy() {
        System.out.println("TV energy");
    }
}
