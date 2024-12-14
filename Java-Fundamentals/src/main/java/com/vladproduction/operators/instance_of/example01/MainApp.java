package com.vladproduction.operators.instance_of.example01;

public class MainApp {
    public static void main(String[] args) {
        MedicalStaff medic = new HeadDoctor();
        if (medic instanceof Nurse) {
            System.out.println("Nurse");
        } else if (medic instanceof Doctor) {
            System.out.println("Doctor");
        } else if (medic instanceof HeadDoctor) {
            System.out.println("HeadDoctor");
        }
    }
}
