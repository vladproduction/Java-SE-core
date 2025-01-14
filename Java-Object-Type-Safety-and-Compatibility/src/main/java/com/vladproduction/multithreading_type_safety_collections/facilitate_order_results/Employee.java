package com.vladproduction.multithreading_type_safety_collections.facilitate_order_results;

public class Employee extends Person {

    private RoleType role;

    public Employee(String name, int tel) {
        super(name, tel);
        this.role = RoleType.EMPLOYEE;
    }

    @Override
    public String getInfo() {

        return String.format("[%s] %s (%s)", role.name().toUpperCase(), super.name, super.tel);
    }
}
