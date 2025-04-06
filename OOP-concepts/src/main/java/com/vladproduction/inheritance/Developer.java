package com.vladproduction.inheritance;

public class Developer extends Employee {

    private String programmingLanguage;
    private double overtimeHours;
    private double overtimeRate;

    public Developer(String name, int id, double baseSalary,
                     String programmingLanguage, double overtimeRate) {
        super(name, id, baseSalary);
        this.programmingLanguage = programmingLanguage;
        this.overtimeHours = 0;
        this.overtimeRate = overtimeRate;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is coding in " + programmingLanguage + "...");
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + (overtimeHours * overtimeRate);
    }

    // Additional method specific to Developer
    public void code() {
        System.out.println(getName() + " is writing " + programmingLanguage + " code...");
    }

    public void logOvertime(double hours) {
        this.overtimeHours += hours;
        System.out.println("Logged " + hours + " overtime hours");
    }

    // Getters and setters
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String lang) {
        this.programmingLanguage = lang;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

}
