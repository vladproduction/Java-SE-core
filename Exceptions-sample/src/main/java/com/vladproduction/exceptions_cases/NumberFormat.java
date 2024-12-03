package com.vladproduction.exceptions_cases;

public class NumberFormat {
    public static void main(String[] args) {
        try{
            //String text = "123TEST";
            String text = "123";
            int a = Integer.parseInt(text);
            System.out.println("a="+a);

        } catch(Exception ex){
            ex.printStackTrace();

        }
    }
}
