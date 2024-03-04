package com.vladproduction.vp17_parameters_in_methods;

public class ParametersMain {
    public static void main(String[] args) {

        CarClass audi = new CarClass();
        audi.setModel("Audi A6");
        audi.setYear(2024);
        audi.maxSpeed(270.50);
        audi.info();
        audi.calculateYears();

    }
}

class CarClass{
    String model;
    int year;

    void setModel(String modelName){
        model = modelName;
    }
    void setYear(int carYear){
        year = carYear;
    }
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
