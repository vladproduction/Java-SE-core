package com.vladproduction.srp.model_solution;

public class ConnectionManagerImpl implements ConnectionManager {
    @Override
    public void dial(String phoneNumber) {
        System.out.println("dial to: " + phoneNumber);

    }

    @Override
    public void disconnect() {
        System.out.println("disconnect");

    }
}
