package com.vladproduction.assignment5;

public class Payment extends AbstractEventAction{

    public Payment(String id) {
        super(id);
    }

    @Override
    public void process() {
        System.out.println("Client " + id + " made payment transfer.");
    }
}
