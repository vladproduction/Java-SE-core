package com.vladproduction.static_nested_classes;

/**
 * Static nested classes, like top-level classes, are available for use outside the body of the outer class,
 * but require the outer class name when invoked.
 * Syntax:
 * <OuterClassName>.<InnerStaticClassName> <NameObjectStaticClass> = new <OuterClassName>.<InnerStaticClassConstructor>
 * When using a reference to a static class, you must specify its belonging to the outer class (just like with static class elements).
 * */
public class AccessInnerStaticOutside {
    public static void main(String[] args) {
        CallOuterAccess.InnerStatic innerStatic = new CallOuterAccess.InnerStatic();
        innerStatic.test();
    }
}
