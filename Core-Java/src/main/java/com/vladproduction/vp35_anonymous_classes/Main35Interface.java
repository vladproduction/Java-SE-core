package com.vladproduction.vp35_anonymous_classes;

/**
 * Created by vladproduction on 07-Mar-24
 */

public class Main35Interface {
    public static void main(String[] args) {
        Driving driving = new Tractor();
        driving.drive();
    }
}

interface Driving{
    void drive();
}

class Tractor implements Driving{

    @Override
    public void drive() {
        System.out.println("Tractor driving");
    }
}
