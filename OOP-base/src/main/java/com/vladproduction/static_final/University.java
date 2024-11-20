package com.vladproduction.static_final;

public class University {
    public static void main(String[] args) {
        JavaCourses courses[] = { new JavaCourses(), new JavaCourses() };
        courses[0].courseName = "MegaCourse";
        for (JavaCourses c : courses) {
            c = new JavaCourses();
        }
        for (JavaCourses c : courses) {
            System.out.println(c.courseName);
        }
    }
    //output:
//    MegaCourse
//    Java
}

