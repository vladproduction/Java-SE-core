package com.vladproduction.operators.instance_of.example02;

public class MainApp {
    public static void main(String[] args) {
//        BaseCourse course = new BaseCourse();
//        FreeCourse course = new FreeCourse();
//        OptionalCourse course = new OptionalCourse();
//        OptionalCourse course = null;
//        Course course = new Course();
        Course course = new FreeCourse();
        doAction(course);

    }

    public static void doAction(Course course){

        if(course instanceof BaseCourse){
            System.out.println("for BaseCourse and FreeCourse");
        } else if (course instanceof OptionalCourse) {
            System.out.println("for OptionalCourse");
        } else {
            System.out.println("for Course or null");
        }
    }

}
