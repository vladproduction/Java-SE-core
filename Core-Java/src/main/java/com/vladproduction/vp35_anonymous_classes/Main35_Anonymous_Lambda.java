package com.vladproduction.vp35_anonymous_classes;

/**
 * Created by vladproduction on 08-Mar-24
 */

public class Main35_Anonymous_Lambda {
    public static void main(String[] args) {
        Car car_anonymous = new Car(){
            @Override
            public void drive() {
                System.out.println("Car anonymous driving!");
            }
        };
        car_anonymous.drive(); //method override

        //lambda example for anonymous: Target type of lambda conversion must be an interface
        //CarDriving interface; and our Car implement this with overridden method drive();
        CarDriving car_lambda = () -> {System.out.println("Car lambda driving!");};
        car_lambda.drive();


    }
}

class Car  implements CarDriving{

    public void drive(){
        System.out.println("Car driving...");
    }

}

interface CarDriving{
    void drive();

}


