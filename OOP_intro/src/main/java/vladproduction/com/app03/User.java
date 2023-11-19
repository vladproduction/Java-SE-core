package vladproduction.com.app03;

import java.util.Random;

public class User {

    private String username;
    private String password;
    private final Random id;

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

    public Random getId() {
        return id;
    }

    public void printInfoUser(){
        System.out.println("username: " + getUsername());
        System.out.println("password: " + getPassword());
        System.out.println("user_id: " + getId());
    }

    private Random generateRandomId() {
        return new Random();
    }
}
