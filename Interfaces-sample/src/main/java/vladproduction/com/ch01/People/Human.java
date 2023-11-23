package vladproduction.com.ch01.People;

public class Human implements Speakable,Runnable_hum,Floating_hum{


    @Override
    public void swim() {

    }

    @Override
    public void swim(String x) {
        Floating_hum.super.swim(x);
    }

    @Override
    public void run() {
        Runnable_hum.super.run();
    }

    @Override
    public void speak() {
        System.out.println("People speaking by many language.");
    }
}
