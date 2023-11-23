package Reflection.product_Annotation.annotation.Interfaces_define_a_type;

public class Main {
    public static void main(String[] args) {

        MarkedClass markedClass = new MarkedClass();
        NonMarkedClass nonMarkedClass = new NonMarkedClass();
        //Interfaces define a type:
        test(markedClass);
        //test(nonMarkedClass); //требуемым типом для метода test() является MyMark,
        // а мы передаем тип NonMarkedClass

    }
    static void test(MyMark markedObject){
        System.out.println("Method 'test' is completed");
    }

}
