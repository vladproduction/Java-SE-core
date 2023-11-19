package vladproduction.com.app01;

public class Main {
    public static void main(String[] args) {
        ClassB classB = new ClassB();
        System.out.println(classB);
        ClassA classA = new ClassA();
        System.out.println(classA);

//        Static block #1 ClassA
//        Static block #2 ClassA
//        Non-static block #1 ClassA
//        Non-static block #1 ClassB
//        ClassB{}
//        Non-static block #1 ClassA
//        ClassA{}
    }
}
