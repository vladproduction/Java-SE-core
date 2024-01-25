package com.vladproduction.srp.model_violation;

public class PhoneImpl implements Phone {
    @Override
    public void dial(String phoneNumber) {
        System.out.println("dial");

    }

    @Override
    public void disconnect() {
        System.out.println("disconnect");

    }

    @Override
    public void send(String message) {
        System.out.println("data sent");

    }

    @Override
    public int receive() {
        System.out.println("data receive");
        return 0;
    }
}
