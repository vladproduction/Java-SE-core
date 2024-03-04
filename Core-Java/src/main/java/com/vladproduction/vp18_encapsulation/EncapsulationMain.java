package com.vladproduction.vp18_encapsulation;

public class EncapsulationMain {
    public static void main(String[] args) {

        PersonClass person1 = new PersonClass();
        person1.setName("AAA");
        System.out.println(person1.getName());
        person1.setAge(29);
        System.out.println(person1.getAge());

    }
}

class PersonClass{

    private String name;
    private int age;

    public void setName(String name){
        if(name.isEmpty()){
            System.out.println("Name could`t be empty.");
        }else {
            this.name = name;
        }
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if(age <= 0){
            System.out.println("Age must be positive.");
        }else {
            this.age = age;
        }
    }
    public int getAge(){
        if (age <= 0){
            throw new RuntimeException("Check age setter");
        }
        return age;
    }
}
