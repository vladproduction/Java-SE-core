package com.vladproduction.assignment5;

public class Message extends AbstractEventAction{

    public Message(String id) {
        super(id);
    }

    @Override
    public void process() {
        System.out.println("Client " + id + " sending message.");
    }
}
