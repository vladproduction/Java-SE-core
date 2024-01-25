package com.vladproduction.srp.model_solution;

public class DataManagerImpl implements DataManager {
    @Override
    public void send(String message) {
        System.out.println("sent message: " + message);

    }

    @Override
    public int receive() {
        System.out.println("received");
        return 0;
    }
}
