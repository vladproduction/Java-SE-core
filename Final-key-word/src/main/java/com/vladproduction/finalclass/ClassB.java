package com.vladproduction.finalclass;

public class ClassB {

    private String fieldA;
    private int fieldB;

    public ClassB(String fieldA, int fieldB) {
        this.fieldA = fieldA;
        this.fieldB = fieldB;
    }

    public String getFieldA() {
        return fieldA;
    }

    public void setFieldA(String fieldA) {
        this.fieldA = fieldA;
    }

    public int getFieldB() {
        return fieldB;
    }

    public void setFieldB(int fieldB) {
        this.fieldB = fieldB;
    }

    public void printMethod(String fieldA, int fieldB){
        System.out.println("printMethod: " + fieldA + "; " + fieldB);
    }

    @Override
    public String toString() {
        return "ClassB{" +
                "fieldA='" + fieldA + '\'' +
                ", fieldB=" + fieldB +
                '}';
    }
}
