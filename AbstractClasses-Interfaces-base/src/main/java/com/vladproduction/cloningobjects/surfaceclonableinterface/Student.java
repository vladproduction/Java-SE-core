package com.vladproduction.cloningobjects.surfaceclonableinterface;

import java.util.Date;

/**
 * Let's consider the changes in the example above. We add an implementation of the Cloneable interface to the Student class description.
 * We make no other changes and simply run the program. As a result, the cloning is successful and the two objects have the same state.
 * How are these two objects stored in memory?
 * There will be two objects of type Student, but they will both refer to the same object of type Date,
 * because during shallow cloning, the reference was copied, not the date object itself.
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
        return super.clone();
    }
}
