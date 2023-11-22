package Anonim_class.InnerClass.myPractice.ch06_nonStatic_vs_Static;

public class Main {
    public static void main(String[] args) {
        OuterA.InnerC c_class = new OuterA.InnerC(); //c + a = not necessary

        OuterA.InnerB b_class = new OuterA().new InnerB(); //b + a = 100%

        //version2:
        OuterA outerA = new OuterA();
        OuterA.InnerB innerB = outerA.new InnerB();
        OuterA.InnerB innerB2 = outerA.new InnerB();
        innerB.doAction();
    }
}
