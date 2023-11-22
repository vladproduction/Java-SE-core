package Anonim_class.InnerClass.implementation;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.printInfo();
        Outer.Inner  inner = new Outer(). new Inner();
        Outer.Inner  inner2 = outer.new Inner();
        inner.doAction();
        inner2.doAction();
    }
}
