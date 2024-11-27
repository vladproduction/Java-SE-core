package com.vladproduction.hiding_implementation;

/**
 * Interface Read with one abstract method readLabel().
 * The class DemoLocal contains:
 * a field y of type int
 * a method dest() with a fixed parameter stringForLabel. All that the method dest() does is create an object of the local class PD described in its body.
 * The local class PD implements the interface Read and overrides its method readLabel() so that,
 * to the value of its field label, which is initialized by the constructor when the object is created, it adds the value of the field y
 * of the outer class and adds the value of the parameter stringForLabel to the method dest().
 * In the method main(), an object of the outer class DemoLocal is created, on which the method dest() is called with the argument "QQQQQ".
 * This method returns an object of the inner class PD via a reference to the interface Read.
 * Then the method readLabel() is called on this reference, and the result is displayed in the console.
 * Thus, in the inner class, it was hidden how a certain label is formed, which can then be obtained by calling the interface method.
 * */
public class DemoLocal {
    private int y = 33;
    public Read dest(final String stringForLabel){
        class PD implements Read{
            private String label;
            public PD(String label) {
                this.label = label;
            }
            public String readLabel(){
                return label + y + stringForLabel;
            }
        }
        return new PD("qqqqq");
    }
    public static void main(String[] str) {
        DemoLocal demoLocal = new DemoLocal();
        Read read = demoLocal.dest("QQQQQ");
        System.out.println(read.readLabel());//qqqqq33QQQQQ
    }
}