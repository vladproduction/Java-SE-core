package com.vladproduction.static_final;

public class Boo {

    static int i;

    public static void main(String[] args) {
        System.out.print(i);
        fooMaxChange();
    }

    static void fooMaxChange(){
//        Foo.FOO_MAX *= 2; //can not modify final variable
        System.out.print(Foo.FOO_MAX);
    }

}
