package Reflection.product_Annotation.annotation.Classification.code_annotations.SuppressWarnings;

public class Main01 {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}

/*Сам код теперь стал проще для чтения, а название метода display() не перечеркивается.
Чтобы отключить список из нескольких предупреждений, необходимо через запятую перечислить
список предупреждений.
Например, в следующем виде:

@SuppressWarnings({"unused", "deprecation"})*/
