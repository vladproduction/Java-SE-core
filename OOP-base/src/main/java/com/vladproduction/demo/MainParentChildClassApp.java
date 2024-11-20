package com.vladproduction.demo;

public class MainParentChildClassApp {
    public static void main(String[] args) {

        ParentClass quest = new ChildClass();
        quest.parentMethod(1);//parentMethod ChildClass1
//            quest.childMethod(1); // no such method in parent class

        ParentClass parent = new ParentClass();
        parent.parentMethod(2);//parentMethod ParentClass2

//        ChildClass childClass = new ParentClass(); //compilation error

        ChildClass childClass = new ChildClass();
        childClass.childMethod(3);//childMethod ChildClass3
        childClass.parentMethod(4);//parentMethod ChildClass4

    }
}
