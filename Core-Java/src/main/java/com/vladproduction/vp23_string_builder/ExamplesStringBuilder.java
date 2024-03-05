package com.vladproduction.vp23_string_builder;

public class ExamplesStringBuilder {
    public static void main(String[] args) {

        String reversed = reverseString("Hello my friend!");
        System.out.println(reversed);

        String removeDuplicates = removeDuplicates("Hello");
        System.out.println(removeDuplicates);

        String html = buildHTMLDynamically("John", 26, "NY");
        System.out.println(html);


    }

    private static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    private static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        boolean[] seen = new boolean[256]; // Assuming ASCII characters

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!seen[ch]) {
                seen[ch] = true;
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    private static String buildHTMLDynamically(String name, int age, String city){
        StringBuilder sb = new StringBuilder();
        sb.append("<tr>")
                .append("<td>").append(name).append("</td>")
                .append("<td>").append(age).append("</td>")
                .append("<td>").append(city).append("</td>")
                .append("</tr>");
        return sb.toString();
    }


}