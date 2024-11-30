package com.vladproduction.class_String;

public class GetCharsDemo {
    public static void main(String[] args) {
        GetCharsDemo getCharsDemo = new GetCharsDemo();
        getCharsDemo.run();
    }

    private void run() {
        String s = "Java programming language is fun!";
        char [] buf = new char [16];
        s.getChars(0,16,buf,0);
        System.out.println(buf);

        char symbol;
        symbol = s.charAt(0);
        System.out.println(symbol);

        char [] chars ;
        chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print("*" + chars[i]);
        }
        System.out.println("*");
    }
}
