package com.vladproduction.association;

public class Passport {

    private String passportNumber;
    private Person owner; // One-to-One: A Passport belongs to one Person

    public Passport(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    @Override
    public String toString() {
        return "Passport: " + passportNumber;
    }

}
