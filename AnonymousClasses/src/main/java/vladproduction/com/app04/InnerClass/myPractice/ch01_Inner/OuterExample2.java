package Anonim_class.InnerClass.myPractice.ch01_Inner;

public class OuterExample2 {
    private int num = 1000;

    public class InnerExample2{
        public int getNum(){
            System.out.println("getNum() from InnerExample2:");
            return num;
        }
    }
}
