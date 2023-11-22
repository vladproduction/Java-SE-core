package Anonim_class.InnerClass.myPractice.ch02_method_Local_Inner;

public class OuterClass {
    // instance method of the outer class
    void myPrint(){
        int num = 23;
    // method-local inner class
        class Inner_Method{
            public void print(){
                System.out.println("Inner_Method.print(): "+num);
            }
        } // end of inner class

        // Accessing the inner class
        Inner_Method inner_method = new Inner_Method();
        inner_method.print();
    }
}
