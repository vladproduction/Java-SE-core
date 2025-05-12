package com.vladproduction.app04.inheritance;

public class Employee extends Person{

    private final int inn;
    private final int phoneNumb;
    private final String role;

    public Employee(String firstName, String lastName, int age, int inn, int phoneNumb, String role) {
        super(firstName, lastName, age);
        this.inn = inn;
        this.phoneNumb = phoneNumb;
        this.role = role;
    }

    @Override
    public String toString() {
//        return "Employee{" +
//                "inn=" + inn +
//                ", phoneNumb=" + phoneNumb +
//                ", role='" + role + '\'' +
//                "} " + super.toString();
        return String.format("%s %s (%d); inn = %d; phoneNumb = %d; role = %s", super.getFirstName(), super.getLastName(), super.getAge(), inn, phoneNumb, role);
    }
}
