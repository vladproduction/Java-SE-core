package com.vladproduction.composition;

// Composite class - has-a relationship
public class Car {

    private String brand;
    private String model;
    // Composition: Car has an Engine, Wheels, and MusicSystem
    private Engine engine;          // Car "has-a" Engine
    private Wheels wheels;          // Car "has-a" Wheels
    private MusicSystem musicSystem; // Car "has-a" MusicSystem

    public Car(String brand, String model, Engine engine, Wheels wheels, MusicSystem musicSystem) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.wheels = wheels;
        this.musicSystem = musicSystem;
    }

    public void start() {
        System.out.println("Starting " + brand + " " + model);
        engine.start();
    }

    public void drive() {
        if (engine.isRunning()) {
            wheels.rotate();
            System.out.println(brand + " " + model + " is driving...");
        } else {
            System.out.println("Cannot drive. Engine is not running.");
        }
    }

    public void stop() {
        wheels.brake();
        engine.stop();
        System.out.println(brand + " " + model + " stopped.");
    }

    public void playMusic() {
        musicSystem.turnOn();
        musicSystem.setVolume(10);
    }

    public void turnOffMusic() {
        musicSystem.turnOff();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    // Car's lifecycle is tightly coupled with its components
    // If Car is destroyed, all components are also destroyed

}
