package Reflection.product_Annotation.annotation.Classification.code_annotations.FunctionalInterface;

public class Main implements MyFunctionalInterface{
    public static void main(String[] args) {
        Main main = new Main();
        main.abstractMethod();

    }

    @Override
    public void abstractMethod() {
        System.out.println("abstractMethod()");
    }
}
