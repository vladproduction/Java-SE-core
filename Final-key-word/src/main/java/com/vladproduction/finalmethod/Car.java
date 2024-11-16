package com.vladproduction.finalmethod;

public class Car {
    final void typeEngine(){
        System.out.println("final typeEngine() - not overridden");
    }

    public void amountWheels(){
        System.out.println("allow to override");
    }
}
