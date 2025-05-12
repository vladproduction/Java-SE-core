package com.vladproduction.app13.immutable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] names = {"John", "Doe"};

        MyBean bean = new MyBean(names);
        System.out.println(Arrays.toString(bean.getData()));

        bean.getData()[0] = "Bob";
        System.out.println(Arrays.toString(bean.getData()));
        System.out.println(Arrays.toString(names));


    }
}
