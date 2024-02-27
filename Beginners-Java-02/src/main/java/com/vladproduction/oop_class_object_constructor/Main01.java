package com.vladproduction.oop_class_object_constructor;

public class Main01 {
    public static void main(String[] args) {

        System.out.println("---------------------------------");
        int maxSpeed = 230;
        CarModel carModel1 = new CarModel((short) maxSpeed);
//        carModel1.speed = 230;
        carModel1.setAll("BMW-X5", 2300.5f, "black", true);
//        System.out.println(carModel1.speed);
        carModel1.printAll();

        System.out.println("---------------------------------");

        CarModel carModel2 = new CarModel("AUDI-A5", 2800.5f, "black", false);
        carModel2.speed = 256;
//        carModel2.setAll("AUDI-A5", 2800.5f, "black", false);
//        System.out.println(carModel2.speed);
//        carModel2.printAll();

        /*  Car: BMW-X5 (speed: 230; weight: 2300.5; color: black) // engine: started
            Car: AUDI-A5 (speed: 256; weight: 2800.5; color: black) // engine: not started*/



    }
}
