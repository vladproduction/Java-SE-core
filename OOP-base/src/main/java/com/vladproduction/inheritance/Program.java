package com.vladproduction.inheritance;

public class Program {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Wheels");
        car.show();
        ElectricCar electricCar = new ElectricCar();
        electricCar.setName("Lightning");
        electricCar.show();
    }
    //output:
    /*Car name: Wheels
    Car name: Lightning*/

}
