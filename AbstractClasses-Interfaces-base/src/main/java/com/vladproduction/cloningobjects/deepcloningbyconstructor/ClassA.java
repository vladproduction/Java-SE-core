package com.vladproduction.cloningobjects.deepcloningbyconstructor;

/**
 * Let's consider an example of this method of creating a copy of an object:
 * Let's describe the ClassA class, in which we define two fields: one of a primitive type, the other a reference.
 * We also define getters and two constructors - default and with a parameter.
 * A constructor with a parameter accepts objects of its type. In the body of this constructor, we initialize all the fields of the object
 * that is created by copies of the fields of the passed one. If the field is of a primitive type, then we simply copy its value.
 * If the field is of a reference type, then we first make a copy of it.
 * In this case, we use the copy constructor of the String type.
 * Let's describe the Main class, in which we create an object of the ClassA type, and then make a copy of it.
 * */
public class ClassA {
    /**
     * The implementation of field initialization should be completely taken care of by the class developer.
     * */
    public static void main(String[] args) {
        ClassA obj1 = new ClassA();
        //...
        ClassA obj2 = new ClassA(obj1);
    }
    private int field1 = 100;
    private String field2 = "Hello";
    public int getField1() {
        return field1;
    }
    public String getField2() {
        return field2;
    }
    public ClassA() {}
    public ClassA(ClassA other) {
        this.field1 = other.getField1();
         this.field2 = new String(other.getField2());
    }
}