package com.vladproduction.vp19_this;

public class ThisMain {
    public static void main(String[] args) {

        HumanClass human1 = new HumanClass();
        human1.setAge(18);
        human1.setName("John");
        human1.getInfo();

        HumanClass human2 = new HumanClass();
        human2.setAge(19);
        human2.setName("Jack");
        human2.getInfo();

    }
}

class HumanClass{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name; //java can identify that 'this.name' is about field of the class, not parameter of the method
        //otherwise without 'this.' java catch the closest value (it is param of the method); in that case name = name
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void getInfo(){
        System.out.println(name + " " + age);
    }
}
