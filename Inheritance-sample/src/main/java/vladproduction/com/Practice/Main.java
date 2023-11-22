package vladproduction.com.Practice;

public class Main {
    public static void main(String[] args) {
        Parent item = new Child();
        item.display();
        Child.display();
        Parent.display();
    }
    static class Parent{
        static void display(){
            System.out.println("Parent display");
        }
    }
      static class Child extends Parent{
          static void display(){
            System.out.println("Child display");
        }
    }
}
