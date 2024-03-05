package com.vladproduction.vp20_constructor;

import java.util.logging.Logger;

public class Human {

    private String gender;
    private String name;
    private int age;
    private Logger logger;


    public Human(String gender, String name, int age, Logger logger) {

        this.gender = gender;
        this.name = name;
        this.age = age;
        this.logger = logger;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo(){
        System.out.println(this.gender + ", " + this.name + ", " + this.age);
        logger.info(this.gender + ", " + this.name + ", " + this.age);
    }

}
