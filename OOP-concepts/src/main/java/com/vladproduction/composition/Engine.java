package com.vladproduction.composition;

public class Engine {

    private String type;
    private int horsepower;
    private boolean isRunning;

    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
        this.isRunning = false;
    }

    public void start() {
        isRunning = true;
        System.out.println(type + " engine started. Ready with " + horsepower + " HP.");
    }

    public void stop() {
        isRunning = false;
        System.out.println(type + " engine stopped.");
    }

    public boolean isRunning() {
        return isRunning;
    }

    public String getType() {
        return type;
    }

    public int getHorsepower() {
        return horsepower;
    }

}
