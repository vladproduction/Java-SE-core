package com.vladproduction.srp.model_solution;

public class MainApp {
    public static void main(String[] args) {
        Phone phone = new Phone(new ConnectionManagerImpl(), new DataManagerImpl());
        phone.dial("123456");
        phone.send("qqq");
        phone.receive();
        phone.disconnect();
    }
}
