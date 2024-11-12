package com.vladproduction.referal_data_types;

public class String_str_example {
    public static void main(String[] args) {

        //check if behaviour is same (content)
        String str1 = "Test";
        String str2 = new String ("Test");
        boolean isEquals = str1.equals(str2);
        System.out.println("isEquals = " + isEquals); //isEquals = true

        //check if hashCodes are same
        int hash1 = str1.hashCode();
        int hash2 = str2.hashCode();
        System.out.println("hash1 = " + hash1);//hash1 = 2603186
        System.out.println("hash2 = " + hash2);//hash2 = 2603186
        System.out.println(hash1 == hash2); //true

        //check if strings objects has same reference
        boolean isSame = str1==str2;
        System.out.println("isSame = " + isSame); //isSame = false

    }
}
