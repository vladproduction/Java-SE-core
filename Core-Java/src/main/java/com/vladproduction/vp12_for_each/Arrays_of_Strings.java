package com.vladproduction.vp12_for_each;

public class Arrays_of_Strings {
    public static void main(String[] args) {

        String[] strings = new String[3];
        strings[0] = "aaa";
        strings[1] = "bbb";
        strings[2] = "ccc";
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        System.out.println("--------------------------");

        // forEach
        for (String item : strings) {
            System.out.println(item);
        }
        System.out.println("--------------------------");
        int[] numbs = {1,2,3};
        int sum = 0;
        for (int i:numbs) {
            sum = sum + i;
        }
        System.out.println(sum);

        System.out.println("--------------------------");
        int value = 0;
        String s = null; //by default if not initialized
        System.out.println(s);

    }
}
