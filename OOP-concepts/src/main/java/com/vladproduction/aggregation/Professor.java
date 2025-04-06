package com.vladproduction.aggregation;

//Independent class
public class Professor {

    private int id;
    private String name;
    private String specialization;

    public Professor(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    public void teach() {
        System.out.println("Professor " + name + " is teaching " + specialization);
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getSpecialization() { return specialization; }

    @Override
    public String toString() {
        return "Professor [id=" + id + ", name=" + name + ", specialization=" + specialization + "]";
    }

}
