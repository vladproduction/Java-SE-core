package com.vladproduction.cohesion;

// Example of HIGH cohesion - Each class has a single, well-defined responsibility

import java.util.ArrayList;
import java.util.List;

// User management - High cohesion class focusing only on user-related operations
public class UserManager {

    private String currentUser;
    private List<String> userList;

    public UserManager() {
        this.userList = new ArrayList<>();
    }

    public void addUser(String username) {
        userList.add(username);
        System.out.println("Added user: " + username);
    }

    public void removeUser(String username) {
        userList.remove(username);
        System.out.println("Removed user: " + username);
    }

    public boolean userExists(String username) {
        return userList.contains(username);
    }

    public void login(String username) {
        if (userExists(username)) {
            currentUser = username;
            System.out.println("Logged in as: " + username);
        } else {
            System.out.println("User not found!");
        }
    }

    public void logout() {
        System.out.println("Logged out user: " + currentUser);
        currentUser = null;
    }

    public String getCurrentUser() {
        return currentUser;
    }

    public List<String> getAllUsers() {
        return new ArrayList<>(userList);
    }

}
