package Reflection.product_Annotation.annotation.Classification.meta_annotations.Repeatable.ex1;


@interface Game {
    String name() default "free practice you like";
    String day();
}
