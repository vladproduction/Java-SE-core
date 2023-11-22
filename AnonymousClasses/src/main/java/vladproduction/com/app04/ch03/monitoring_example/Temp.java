package Anonim_class.ch03.monitoring_example;

public class Temp implements Monitoring{
    @Override
    public void start() {
        System.out.println("thermometer monitoring start");
    }

    @Override
    public void finish() {
        System.out.println("thermometer monitoring finish");
    }

    @Override
    public void result() {
        System.out.println("thermometer monitoring result");
    }
}
