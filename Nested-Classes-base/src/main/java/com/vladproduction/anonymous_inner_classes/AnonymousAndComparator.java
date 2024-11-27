package com.vladproduction.anonymous_inner_classes;

import java.util.Arrays;
import java.util.Comparator;

public class AnonymousAndComparator {
    public static void main(String[] args) {
        String[] tech = {"Java", "Go", "Python", "C++", "Javascript", "Sql", "C#", "Spring", "Angular", "React"};
        Arrays.sort(tech, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                String s1 = (String) o1;
                String s2 = (String) o2;
                return s1.compareTo(s2);
            }
        });
        System.out.println(Arrays.toString(tech));
    }
}
