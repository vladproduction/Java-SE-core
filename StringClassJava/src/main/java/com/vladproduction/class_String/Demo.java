package com.vladproduction.class_String;

public class Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.run();

        String s = new String("Java");
        String t = new String();
        String r = null;
        r = s + t + r;
        r = s + t + 'r';
        //r = s & t & r;
        //r = s && t && r;

        String str1 = new String("Paul");
        String str2 = new String("Paul");
        System.out.println(str1 == str2); //false
        System.out.println(str1.equals(str2)); //true

    }

    private void run() {

        String str = "Java language";
        System.out.println(str.length());

        System.out.println("abc".length());
    }
}
