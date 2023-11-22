package Anonim_class.InnerClass.myPractice.ch03_anonimous_inner;

public class Outer {

    /*
    How to override the method of a class using anonymous inner class;
     */
    public static void main(String[] args) {
        Anonymous_Inner anonymous_inner = new Anonymous_Inner() {
            @Override
            public void myMethod() {
                System.out.println("Anonymous_Inner.myMethod()");
            }
        };
        anonymous_inner.myMethod();
    }
}
