package com.vladproduction.cloningobjects.deepcloneableinterface;

import java.util.Date;

/**
 * Let's consider an example of deep cloning on the same Student class, changing only the implementation of the clone() method:
 * First, we perform a shallow clone to obtain a new object.
 * Then we clone the yearSet field and overwrite the resulting copy in the yearSet field of the new object.
 * The result is displayed the same as in the previous example, but if we imagine storing objects in memory, we get something like the following figure.
 * */
public class Student implements Cloneable {
    public static void main(String[] arg) throws Exception {
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
        Student stud = (Student) super.clone();
        stud.yearSet = (Date) this.yearSet.clone();
        return stud;
    }
}
