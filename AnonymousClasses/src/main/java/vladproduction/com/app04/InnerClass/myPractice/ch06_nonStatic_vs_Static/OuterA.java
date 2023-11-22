package Anonim_class.InnerClass.myPractice.ch06_nonStatic_vs_Static;

public class OuterA {

    private int n = 10;

    public void print(){}
    public static void printStatic(){}

    public class InnerB{

        private int n = 20;

        public void doAction(){
            print();
            printStatic();
            System.out.println("InnerB: n = "+n);
            System.out.println("OuterA: n = "+OuterA.this.n);
        }
    }

    public static class InnerC{
        public void doAction(){
            //print();  -->
            printStatic();
        }

    }

    /*внутренние классы дают возможность ипользовать переменные и методы внешнего класса*/
    /*в статическом иннер классе можно ипользовать только статические переменные и методы внешнего класса*/
}
