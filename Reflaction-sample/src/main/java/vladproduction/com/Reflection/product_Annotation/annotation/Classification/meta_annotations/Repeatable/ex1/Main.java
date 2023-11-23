package Reflection.product_Annotation.annotation.Classification.meta_annotations.Repeatable.ex1;

@Games({
        @Game(name = "Match Day",day = "Sunday"),
        @Game(day = "Thursday"),
        @Game(name = "Rest Day",   day = "Monday")
})


public class Main {
    public static void main(String[] args) {



        Games games = Main.class.getAnnotation(Games.class);

        for (Game game : games.value()) {
            System.out.println(game.name() + " в " + game.day());
        }

    }
}
