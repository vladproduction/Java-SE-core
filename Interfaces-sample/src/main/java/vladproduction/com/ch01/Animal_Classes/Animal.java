package vladproduction.com.ch01.Animal_Classes;



//multiply realization of interfaces in  one class

import vladproduction.com.ch01.Animal_Interfaces.Floating;
import vladproduction.com.ch01.Animal_Interfaces.Flyable;

public class Animal implements Floating, Flyable,Runnable {

    @Override
    public void swim() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void run() {

    }
}
