package Reflection.product_Annotation.annotation.Classification.meta_annotations.Repeatable.ex3_by_reflection;

import java.lang.annotation.Repeatable;

@Repeatable(Games.class)
@interface Game {
    String name() default "free practice you like";
    String day();
}
