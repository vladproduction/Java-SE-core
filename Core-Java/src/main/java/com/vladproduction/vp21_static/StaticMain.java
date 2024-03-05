package com.vladproduction.vp21_static;

import java.util.Date;

public class StaticMain {
    public static void main(String[] args) throws InterruptedException {

        HumanExample h1 = new HumanExample("John", 26);
        HumanExample h2 = new HumanExample("Jack", 28);

        HumanExample.description = "Happy today: " + new Date();
        HumanExample.setDescription(); //static method depending on class, not Object/instance of class
        h1.getAllFields();
        h2.getAllFields();

        Thread.sleep(2000);

        HumanExample.description = "Happy today: " + new Date();
        HumanExample.setDescription();
        h1.getAllFields();
        h2.getAllFields();
    }
}

class HumanExample {

    private String name;
    private int age;
    public static String description; //static example of field

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public HumanExample(String name, int age){
        this.name = name;
        this.age = age;
    }

    //example of static method:
    /**
     * static method can`t work with fields of object; ONLY with static variables */
    public static void setDescription(){
        System.out.println(description);
    }

    public void getAllFields(){
        System.out.println(name + ", " + age + "; " + description);
    }

}
