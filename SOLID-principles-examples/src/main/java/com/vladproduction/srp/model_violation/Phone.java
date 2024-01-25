package com.vladproduction.srp.model_violation;

public interface Phone {

    void dial(String phoneNumber);
    void disconnect();
    void send(String message);
    int receive();
}
