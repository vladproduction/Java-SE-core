package vladproduction.com.newOperator;

import java.util.Arrays;

public class Main01 {
    public static void main(String[] args) {

        char [] charsArr = {'h', 'e', 'l', 'l', 'o'};
        String strA = new String(charsArr);
        String strB = "hello";

        char ch = strA.charAt(1);
        char ch0 = '\'';

        // how to define characters, arrays, and strings in Java:
        char ch1 = 'Z';
        char ch2 = '\'';
        char[] chars = {'h','e','l','l','o'};
        String str1 = new String(chars);
        String str2 = "hello";
        String str3 = new String(chars);
        String str4 = Character.toString(ch2);
        System.out.println("ch1: "+ch1);
        System.out.println("ch2: "+ch2);
        System.out.println("chars: "+ Arrays.toString(chars));
        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);
        System.out.println("str3: "+str3);
        System.out.println("str4: "+str4);

        System.out.println("------------kind of demonstration by loop the char [] ----------");

        System.out.print("chars: ");
        int i = 1;
        for(char item : chars) {
            System.out.print(i);
            System.out.print(item + "\t");
            i++;
        }
        System.out.println();

        System.out.println("-----");
    }
}
