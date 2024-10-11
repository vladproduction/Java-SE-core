package com.vladproduction.assignment5;

public class Password extends AbstractEventAction{

    public Password(String id) {
        super(id);
    }

    @Override
    public void process() {
        System.out.println("Client " + id + " using password to enter system.");
    }
}
