package com.vladproduction.newOperator;

public class ShowPeople {

    String str5 , str6;
    public ShowPeople() {
    }

    public static void main(String[] args) {
        String str1, str2, str3, str4;

        // str1 and str2 occupy different memory locations
        str1 = new String("My name is John Smith");
        str2 = new String("My name is John Smith");
        System.out.println("hash.str1 = " + str1.hashCode());
        System.out.println("hash.str2 = " + str2.hashCode());
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);

        System.out.println("-----");
        // str3 and str4 occupy the same memory location
        str3 = "My name is Jane Andrews";
        str4 = "My name is Jane Andrews";
        System.out.println("hash.str3 = " + str3.hashCode());
        System.out.println("hash.str4 = " + str4.hashCode());
        System.out.println(str3.equals(str4));
        System.out.println(str3 == str4);

        System.out.println("-------------");
        ShowPeople showPeople = new ShowPeople();
        showPeople.str5 = new String("John");
        showPeople.str6 = "John";
        System.out.println(showPeople.str5 == showPeople.str6); //false
        System.out.println(showPeople.str5 == "John"); //false
        System.out.println("John" == showPeople.str6); //true

    }
}
