package vladproduction.com.example01;

public class MyClass02 {
    private static int y;

    // Static initialization block
    static {
        y = 20;
        System.out.println("Static initialization block");
    }

    public static void main(String[] args) {
        System.out.println("Value of y: " + y);
    }

//    In this example, the static initialization block initializes the static variable y with
//    a value of 20. When the main() method is executed, the static initialization block is
//    executed first, printing "Static initialization block", followed by the value of y.
}
