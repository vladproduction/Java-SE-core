package vladproduction.com.app02;

public class Main02_methodsFinal {
    public static void main(String[] args) {

    }

    static class Parent {
        final void display() {
            System.out.println("Parent's display method");
        }
    }

    static class Child extends Parent {
        // Cannot override a final method
        // void display() { } // Error
    }

}
