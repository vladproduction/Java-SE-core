package Anonim_class.InnerClass.myPractice.ch01_Inner;

public class OuterExample {

    int num;
    // inner class
    private class InnerExample{
        public void print(){
            System.out.println("This is the InnerExample.class");
        }
    }



    // Accessing inner class from the method within
    void display_Inner(){
        InnerExample innerExample = new InnerExample();
        innerExample.print();
    }
}
