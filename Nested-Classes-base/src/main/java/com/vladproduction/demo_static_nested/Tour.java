package com.vladproduction.demo_static_nested;

public class Tour {
    public static void main(String[] args) {
        SourceOuterClass.InnerGoMethodClass source = new SourceOuterClass.InnerGoMethodClass();
        source.go();
    }
}
