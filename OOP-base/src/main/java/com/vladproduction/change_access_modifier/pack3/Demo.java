package com.vladproduction.change_access_modifier.pack3;

import com.vladproduction.change_access_modifier.pack1.Vehicle;
import com.vladproduction.change_access_modifier.pack2.Bicycle;

public class Demo {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Bicycle bicycle = new Bicycle();
//        System.out.println(vehicle.maxSpeed); //error: protected elements of one class are not accessible from classes in other packages.
//        System.out.println(bicycle.maxSpeed); //error: protected elements of one class are not accessible from classes in other packages.
//        vehicle.showSpeed(); //error: protected elements of one class are not accessible from classes in other packages.
        bicycle.showSpeed();
    }
}