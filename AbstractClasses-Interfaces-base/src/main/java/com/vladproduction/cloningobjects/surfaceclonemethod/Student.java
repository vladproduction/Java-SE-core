package com.vladproduction.cloningobjects.surfaceclonemethod;

import java.util.Date;

/**
 * Let's consider an example of superficial cloning/copying:
 * Let's describe the Student class with a reference to a Date field (from the java.util package) for the year of the yearSet set
 * and a primitive int field for the group group.
 * Let's redefine the toString() method to get a description of the object in text form.
 * Let's redefine the clone() method inherited from the Object class by simply calling the clone() method of the superclass.
 * In the Main class, we will create an object of type Date: for this, we will use the static currentTimeMillis() method of the System class.
 * Then we will create an object stud1 of the Student class and display it.
 * Let's create a clone of the stud1 object and display it.
 * */
public class Student implements Cloneable{ //to avoid exception to be throwing must be implemented Cloneable interface

    public static void main(String[] arg) throws Exception{
        Date dd = new Date( System.currentTimeMillis() );
        Student stud1 = new Student(dd, 201);
        System.out.println(stud1);
        Student stud2 = (Student) stud1.clone();
        System.out.println(stud2);
    }

    private Date yearSet;
    private int group;
    public Student(Date year, int group) {
        this.yearSet = year;
        this.group = group;
    }
    public String toString() {
        return "year="+yearSet+", group="+group;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /*  As a result of executing this program, we received the error CloneNotSupportedException.
        This happened because it is not enough to override the clone() method. It should also be noted that such a process is possible.
        The class must also implement the Cloneable interface.*/
}
