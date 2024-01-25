package com.vladproduction.srp.model_solution;

public class Phone implements ConnectionManager, DataManager{

    private ConnectionManager connection;

    private DataManager manager;

    public Phone(ConnectionManager connection, DataManager manager) {
        this.connection = connection;
        this.manager = manager;
    }

    @Override
    public void dial(String phoneNumber) {
        connection.dial(phoneNumber);
    }

    @Override
    public void disconnect() {
        connection.disconnect();

    }

    @Override
    public void send(String message) {
        manager.send(message);

    }

    @Override
    public int receive() {
        manager.receive();
        return 0;
    }
}
