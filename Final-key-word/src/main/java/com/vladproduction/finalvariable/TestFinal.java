package com.vladproduction.finalvariable;

public class TestFinal {

    private final String lastName;

    public TestFinal(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;

    }

    //setter is not allowed (variable lastName is defined as final)
    /*public void setLastName(String lastName){
        this.lastName = lastName;
    }*/
}
