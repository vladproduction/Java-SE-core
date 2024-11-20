package com.vladproduction.override_methods_cases;

public class MainBaseDeriveApp {
    public static void main(String[] args) {
        Base base = new Base();
        Base derive = new Derive();

        base.show();
        derive.show();

        //output:
        /*Base
        Derive class*/

        Base derivedPartially = new DerivedPartially();
        derivedPartially.show();

        //output (superclass method show() is explicitly called in subclass show() method):
        /*Base
        DerivedPartially class*/
    }
}
