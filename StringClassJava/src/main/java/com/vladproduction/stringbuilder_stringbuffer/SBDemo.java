package com.vladproduction.stringbuilder_stringbuffer;

public class SBDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(10);
        sb.append("Hello...");
        char c = '!';
        sb.append(c);
        sb.insert(8, "Java");
        sb.delete(5, 8);
        System.out.println(sb);

        StringBuilder str = new StringBuilder("Learning");
        updateString(str);
        System.out.println(str); // Learningjava!

        String string = new String("Learning");
        updateString(string);
        System.out.println(string); // Learning

        StringBuilder sb1 = new StringBuilder("I like Java.");//1
        StringBuilder sb2 = new StringBuilder(sb1);/// 2
        System.out.println(sb1.equals(sb2));

        StringBuilder sb12 = new StringBuilder("Bon");
        sb12.insert(2, 'r');
        System.out.println(sb12);

        testCompile();

        /*  HelloJava!
            Learningjava!
            Learning
            false
            Born
            success  */
    }
    static void updateString(String string){
        string += "java!";
    }
    static void updateString(StringBuilder string){
        string.append("java!");
    }
    static void testCompile(){
        char[] name = new char[] {'P','a','u','l'};
        String boy = new String(name); //1
        StringBuilder sd1 = new StringBuilder("String Builder" );
        String str5 = new String(sd1); //2
        StringBuffer sb2 = new StringBuffer("String Buffer" );
        String str6 = new String(sb2); //3
        String empName = null; //4
        System.out.println("success");
    }
}
