package com.vladproduction.app10.service_repository_pattern.domain;

public abstract class User {

    private String username;
    private int age;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Each user type must provide information about its source.
     * @return String representing the data source
     */
    public abstract String getDataSourceInfo();

    @Override
    public String toString() {
        return username + " (age: " + age + ") - Source: " + getDataSourceInfo();
    }

}
