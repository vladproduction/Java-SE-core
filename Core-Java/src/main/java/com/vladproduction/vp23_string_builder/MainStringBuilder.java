package com.vladproduction.vp23_string_builder;

public class MainStringBuilder {
    public static void main(String[] args) {

        /**
         * in java we have 2 type of Objects:
         * -mutable
         * -immutable*/
        /*System.out.println("------------string immutable---------------");
        String x = "Hello";
        String y = new String("Hello");
        System.out.println(x.toUpperCase()); // does not change string, just make operation and after it stands as before
        System.out.println(x); //so it confirm here 'Hello' as expected

        //but if we remake our string the result will be new:
        x = x.toUpperCase(); //remake
        System.out.println(x); // and show 'HELLO' as a new version*/

        /*System.out.println("------------concatenation---------------");
        String string1 = "Hello";
        String string2 = " my";
        String string3 = " friend";
        String stringAll = string1 + string2 + string3;
        System.out.println(stringAll);*/

        System.out.println("----------StringBuilder--------------");
        StringBuilder sb = new StringBuilder("Hello");
//        System.out.println(sb);
        sb.append(" my");
        sb.append(" friend!");
        System.out.println(sb);

        //or

        StringBuilder sb2 = new StringBuilder();
        sb2.append("Hello").append(" you").append(" too!");
        System.out.println(sb2);


    }
}


