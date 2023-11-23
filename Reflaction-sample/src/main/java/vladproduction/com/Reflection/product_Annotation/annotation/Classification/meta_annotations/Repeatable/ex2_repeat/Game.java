package Reflection.product_Annotation.annotation.Classification.meta_annotations.Repeatable.ex2_repeat;

import java.lang.annotation.Repeatable;

@Repeatable(Games.class)
@interface Game {
    String name() default "free practice you like";
    String day();
}
