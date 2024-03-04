package com.vladproduction.vp16_return_type;

public class ReturnTypeMain {
    public static void main(String[] args) {

        CarClass car1 = new CarClass();
        car1.model = "Audi";
        car1.year = 2024;
        car1.info();
        car1.maxSpeed(265.50);
        car1.calculateYears();
        int yearsToService = car1.calculateYearsToService();
        System.out.println(yearsToService);

    }
}

class CarClass{
    String model;
    int year;
    void info(){
        System.out.println("car info:".toUpperCase());
        System.out.println("Model: " + model + "; year: " + year);
    }
    void maxSpeed(double speed){
        System.out.println("Max speed: " + speed);
    }
    void calculateYears(){
        int years = 2050 - year;
        System.out.println("Years left to service battery: " + years);
    }
    int calculateYearsToService(){
        int years = 2050 - year;
        System.out.println("Years left to service battery: ");
        return years;
    }

}
