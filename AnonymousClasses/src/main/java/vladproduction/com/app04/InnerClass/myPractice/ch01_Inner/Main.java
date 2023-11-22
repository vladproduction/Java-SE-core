package Anonim_class.InnerClass.myPractice.ch01_Inner;

public class Main {

    /*
    Create an inner class and access it. In the given example, the inner class private
    and access the class through a method.
    OuterExample is the outer class, InnerExample is the inner class, display_Inner() is the method
    inside which we are instantiating the inner class, and this method is invoked from the main method.
     */
    public static void main(String[] args) {

        // Instantiating the outer class
        OuterExample outerExample = new OuterExample();


        // Accessing the display_Inner() method.
        outerExample.display_Inner();
    }
}
