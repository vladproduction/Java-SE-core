package com.pack01;

import com.app01.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("Version 1.0");
        Car car = new Car();
        car.setModel("Toyota");
        car.setPrice(1000);
        System.out.println(car);
        System.out.println("Version 2.0");
        //add field "color"
        car.setColor("Black");
        System.out.println(car);
    }
}
