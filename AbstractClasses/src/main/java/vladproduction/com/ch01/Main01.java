package vladproduction.com.ch01;

public class Main01 {
    public static void main(String[] args) {
        //ClassA classA = new ClassA(); // not available, because new ClassA() - creating new instance
                                      //and it`s impossible to have new instance from abstract class

        ClassB classB = new ClassB(); //now it`s possible, even if classB extends classA
    }
}
