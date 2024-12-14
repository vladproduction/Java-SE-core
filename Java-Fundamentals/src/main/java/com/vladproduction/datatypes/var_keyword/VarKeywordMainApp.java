package com.vladproduction.datatypes.var_keyword;

import java.util.List;

public class VarKeywordMainApp {
    public static void main(String[] args) {

        var i = 1; //int
        var integer = Integer.valueOf(2); //Integer
        var str = "java"; // String

        //possible but not good practice:
        var list = List.of(1, "2", 5.5, new StringBuilder("Spring"));
        List list2 = list;

    }
}
