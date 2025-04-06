package com.vladproduction.composition;

public class MusicSystem {

    private String brand;
    private boolean isOn;
    private int volume;

    public MusicSystem(String brand) {
        this.brand = brand;
        this.isOn = false;
        this.volume = 0;
    }

    public void turnOn() {
        isOn = true;
        System.out.println(brand + " music system turned on.");
    }

    public void turnOff() {
        isOn = false;
        volume = 0;
        System.out.println(brand + " music system turned off.");
    }

    public void setVolume(int volume) {
        if (isOn) {
            this.volume = volume;
            System.out.println("Volume set to " + volume);
        } else {
            System.out.println("Cannot set volume. Music system is off.");
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public int getVolume() {
        return volume;
    }

    public String getBrand() {
        return brand;
    }

}
