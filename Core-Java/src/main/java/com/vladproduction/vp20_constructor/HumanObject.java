package com.vladproduction.vp20_constructor;

import java.util.logging.Logger;

public class HumanObject {

    private String gender;
    private String name;
    private int age;
    private Logger logger;


    /**constructors as other methods in java could be overload *
     * overload - when method has same name until it has different parameters *
     * java understand which method invoke through parameters set in current method*/
//      some versions of constructors:
    public HumanObject(){
        System.out.println("default constructor");
        //default constructor
    }

    public HumanObject(String gender){
        System.out.println("gender: constructor");
        this.gender = gender;
    }

    public HumanObject(String gender, String name){
        System.out.println("gender, name: constructor");
        this.gender = gender;
        this.name = name;
    }

    public HumanObject(int age){
        System.out.println("age: constructor");
        this.age = age;
    }

    public HumanObject(String gender, String name, int age, Logger logger) {
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

    public void printGender(){
        System.out.println(this.gender);
    }
    public void printName(){
        System.out.println(this.name);
    }
    public void printAge(){
        System.out.println(this.age);
    }
    public void printInfo(){
        System.out.println(this.gender + ", " + this.name + ", " + this.age);
        logger.info(this.gender + ", " + this.name + ", " + this.age);
    }

}
