package vladproduction.com.app01;

public class ClassA {
    private ClassA() {
    }

    void display(){
        System.out.println("private constructor: " + getClass().getName());
    }
}
