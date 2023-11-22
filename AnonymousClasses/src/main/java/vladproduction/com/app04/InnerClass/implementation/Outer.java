package Anonim_class.InnerClass.implementation;

public class Outer {

    public int type = 1;

    public void printInfo(){
        System.out.println("Outer.type = "+type);
    }
    public class Inner{
        public String title = "Test";

        public void doAction(){
            System.out.println("Inner.title = "+title);
        }
    }
}
