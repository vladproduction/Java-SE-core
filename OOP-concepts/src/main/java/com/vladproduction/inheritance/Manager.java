package com.vladproduction.inheritance;

public class Manager extends Employee {

    private double bonus;
    private int teamSize;

    public Manager(String name, int id, double baseSalary, double bonus, int teamSize) {
        super(name, id, baseSalary);
        this.bonus = bonus;
        this.teamSize = teamSize;
    }

    // Method overriding
    @Override
    public void work() {
        System.out.println(getName() + " is managing a team of " + teamSize + " employees...");
    }

    @Override
    public double calculateSalary() {
        // Using parent method and extending it
        return super.calculateSalary() + bonus;
    }

    // Additional method specific to Manager
    public void conductMeeting() {
        System.out.println(getName() + " is conducting a meeting...");
    }

    // Getters and setters
    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { this.bonus = bonus; }
    public int getTeamSize() { return teamSize; }
    public void setTeamSize(int teamSize) { this.teamSize = teamSize; }

}
