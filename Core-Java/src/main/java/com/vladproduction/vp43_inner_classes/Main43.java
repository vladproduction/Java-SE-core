package com.vladproduction.vp43_inner_classes;

/**
 * Created by vladproduction on 18-Mar-24
 */

public class Main43 {
    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar(1);
        electricCar.start();

        System.out.println("-----------");
        ElectricCar.Battery battery = new ElectricCar.Battery();
        battery.charge();

    }
}
