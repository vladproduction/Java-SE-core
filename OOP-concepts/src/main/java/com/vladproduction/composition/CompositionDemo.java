package com.vladproduction.composition;

public class CompositionDemo {
    public static void main(String[] args) {

        // Create component objects
        Engine v8Engine = new Engine("V8", 450);
        Wheels sportWheels = new Wheels(4, "Michelin", 20.5);
        MusicSystem boseSystem = new MusicSystem("Bose");

        // Create composite object using components
        Car sportsCar = new Car("Ferrari", "488 GTB", v8Engine, sportWheels, boseSystem);

        // Using the composite object
        sportsCar.start();
        sportsCar.drive();
        sportsCar.playMusic();
        System.out.println("\nTaking a break...\n");
        sportsCar.turnOffMusic();
        sportsCar.stop();

        // Another example with different components
        Engine electricEngine = new Engine("Electric", 300);
        Wheels ecoWheels = new Wheels(4, "Continental", 18.0);
        MusicSystem sonySystem = new MusicSystem("Sony");

        Car electricCar = new Car("Tesla", "Model 3", electricEngine, ecoWheels, sonySystem);

        electricCar.start();
        electricCar.drive();
        electricCar.playMusic();
        electricCar.stop();

        // When the Car object is destroyed, all its component objects are also destroyed
        // This is the essence of composition - lifecycle dependency

    }
}
