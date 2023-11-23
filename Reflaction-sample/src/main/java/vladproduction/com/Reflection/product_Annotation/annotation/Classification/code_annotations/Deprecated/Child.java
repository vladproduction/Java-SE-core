package Reflection.product_Annotation.annotation.Classification.code_annotations.Deprecated;

public class Child extends Parent {
    @Override
    //@Deprecated(since = "1.2", forRemoval = true)  //-->language 9
    public void display(){
        System.out.println("Child.class--display()");
    }
}

/*Исправим «опечатку» в названии метода в классе Child
* Таким образом, применяя аннотацию @Override, мы даем задание компилятору выполнять
* проверку соответствия сигнатуры метода класса наследника классу родителя, что устраняет
* ошибки «по невнимательности» в виде опечаток.*/
