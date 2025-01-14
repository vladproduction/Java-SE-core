package com.vladproduction.type_safety_01.facilitate_order_results_multythreads;

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
