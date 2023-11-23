package Reflection.product_Annotation.annotation.Classification.meta_annotations.Inherited;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        //Parent.class
        if (parent.getClass().getAnnotations().length>0){
            System.out.println("For Parent.class available this annotations:");
            for (Annotation annotation: parent.getClass().getAnnotations()){
                System.out.println(annotation);
            }
        }else {
            System.out.println("Parent.class has no annotations!");
        }
        //Child.class
        if (child.getClass().getAnnotations().length>0){
            System.out.println("\nFor Child.class available this annotations:");
            for (Annotation annotation: child.getClass().getAnnotations()){
                System.out.println(annotation);
            }
        }else {
            System.out.println("\nChild.class has no annotations!");
        }
    }
}
