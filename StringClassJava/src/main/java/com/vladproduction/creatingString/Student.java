package com.vladproduction.creatingString;

public class Student {
    private String name;
    public Student(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [name="+name+"]";
    }

    public static void main(String[] args) {
        Student john = new Student("John Smith");
        System.out.println("First student: " + john);
    }

}


