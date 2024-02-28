package com.vladproduction.inner_classes.demo;

public class Main01 {
    public static void main(String[] args) {

        Employee employee = new Employee("John", "hr".toUpperCase());
        String jobDescription = employee.getJobDescription();
        System.out.println(jobDescription);

    }
}
