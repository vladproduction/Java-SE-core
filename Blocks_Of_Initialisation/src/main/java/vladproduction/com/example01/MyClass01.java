package vladproduction.com.example01;

public class MyClass01 {
    private int x;

    // Instance initialization block
    {
        x = 10;
        System.out.println("Instance initialization block");
    }

    // Constructor
    public MyClass01() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        MyClass01 obj = new MyClass01();
    }

//    In this example, the instance initialization block assigns a value of 10 to the
//    instance variable x. When an object of MyClass is created (MyClass obj = new MyClass()),
//    the instance initialization block is executed before the constructor,
//    printing "Instance initialization block" followed by "Constructor".
}
