package com.vladproduction.srp.model_violation;

public class PhoneClient {
    public static void main(String[] args) {
        Phone phone = new PhoneImpl();

        phone.dial("123123");
        phone.send("message()");
        phone.receive();
        phone.disconnect();
    }
}
