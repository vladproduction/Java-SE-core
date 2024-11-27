package com.vladproduction.static_nested_classes;

public class CallOuterAccess {
    public int x = 10;
    private static int y = 10;
    public static class InnerStatic { //inner class marked as static
        public void test() {
//            x = 20; //outer variable have to be static to get access
            CallOuterAccess outerAccess = new CallOuterAccess();
            outerAccess.x = 20;
            y = 20;
            System.out.println("CallOuterAccess.test() " + outerAccess.x + ", " + y);
        }
    }
}
