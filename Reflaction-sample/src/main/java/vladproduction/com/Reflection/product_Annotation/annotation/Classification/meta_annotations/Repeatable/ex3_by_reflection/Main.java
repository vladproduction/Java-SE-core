package Reflection.product_Annotation.annotation.Classification.meta_annotations.Repeatable.ex3_by_reflection;

@Game(name = "Match Day",   day = "Sunday")
@Game(name = "Rest Day",    day = "Monday")
@Game(                      day = "Thursday")

public class Main {
    public static void main(String[] args) {

        Game[] arrayGames = Main.class.getAnnotationsByType(Game.class);
        for(Game game : arrayGames) {
            System.out.println(game.name() + " in: " + game.day());
        }
    }
}
