package Anonim_class.ch03.monitoring_example;

public class Water implements Monitoring{
    @Override
    public void start() {
        System.out.println("water counter start");
    }

    @Override
    public void finish() {
        System.out.println("water counter finish");
    }

    @Override
    public void result() {
        System.out.println("water counter result");
    }
}
