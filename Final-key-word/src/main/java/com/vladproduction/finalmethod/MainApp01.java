package com.vladproduction.finalmethod;

public class MainApp01 {
    public static void main(String[] args) {
        Track track = new Track();
        track.typeEngine(); //steel has from parent, but no app to override in child's classes
        track.amountWheels();
    }
}
