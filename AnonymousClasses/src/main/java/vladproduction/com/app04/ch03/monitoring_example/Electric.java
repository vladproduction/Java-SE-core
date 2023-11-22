package Anonim_class.ch03.monitoring_example;

public class Electric implements Monitoring {
    @Override
    public void start() {
        System.out.println("electric counter start");
    }

    @Override
    public void finish() {
        System.out.println("electric counter finish");
    }

    @Override
    public void result() {
        System.out.println("electric counter result");
    }
}
