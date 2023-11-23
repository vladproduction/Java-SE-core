package Reflection.product_Annotation.annotation.Interfaces_define_a_type_inherited;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        testInterface(parent);
        testInterface(child);

        testAnnotation(parent);
        testAnnotation(child);

    }

    public static void testInterface(MyMark markedObject){
        System.out.println("Method 'testInterface' is completed");
    }
    public static void testAnnotation(Object object){
        if(!object.getClass().isAnnotationPresent(MyAnnotation.class)){
            throw new RuntimeException("Object is not annotated by '@MyAnnotation'");
        }
        System.out.println("Method 'testAnnotation' is completed");
    }
}

/*Вызов метода testAnnotation (child) на этапе исполнения генерирует исключение, сообщая,
что объект не аннотирован аннотацией MyAnnotation, которой был аннотирован его родительский
класс Parent. Для успешной компиляции классу Child также необходимо использовать MyAnnotation.*/
