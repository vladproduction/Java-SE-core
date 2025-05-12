package com.vladproduction.app19.abstraction.simple_examples;

public abstract class MyAbstract {

    public abstract void printToConsole();

    public void doAction(){
        for (int i = 1; i <= 10; i++) {
            printToConsole();
        }
    }

}
