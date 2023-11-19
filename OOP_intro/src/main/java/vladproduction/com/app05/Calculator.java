package vladproduction.com.app05;

public class Calculator {

    //overload (static polymorphism)
    public void add(int a, int b){
        System.out.println(a + b);
    }
    public void add(String a, String b){
        System.out.println(a + b);
    }
}
