package com.vladproduction.group;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupMain {
    public static void main(String[] args) {

        String base = "java";
        groupView(base, "([a-z]*)([a-z]+)");
        groupView(base, "([a-z]?)([a-z]+)");
        groupView(base, "([a-z]+)([a-z]*)");
        groupView(base, "([a-z]?)([a-z]?)");

    }

    private static void groupView(String base, String regExp) {
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher (base);
        if (matcher.matches()) {
            System.out.println("group 1: " + matcher.group(1));
            System.out.println("group 2: " + matcher.group(2));
            System.out.println("main group: " + matcher.group() + " [end]");//eq.group(0)
        } else {
            System.out.println("nothing matches");
        }
    }

}
