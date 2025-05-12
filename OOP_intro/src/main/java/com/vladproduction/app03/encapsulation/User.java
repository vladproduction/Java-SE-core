package com.vladproduction.app03.encapsulation;

import java.util.Random;

public class User {

    private String username;
    private String password;
    private final int id;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.id = generateRandomId();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void printInfoUser(){
        System.out.println("username: " + getUsername());
        System.out.println("password: " + getPassword());
        System.out.println("user_id: " + getId());
    }

    private int generateRandomId() {
        Random random = new Random();
        return random.nextInt(1000);
    }
}
