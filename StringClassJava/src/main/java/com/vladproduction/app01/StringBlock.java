package com.vladproduction.app01;

public class StringBlock {
    public static void main(String[] args) {

        //convert octal to decimal
        int i = 01234;
        System.out.println("i="+i); //i=668

        //block String throw <"""></""">
        String block = """
                       Hello World! 
                       Hello Java!
                       """;
        System.out.println(block);

    }
}
