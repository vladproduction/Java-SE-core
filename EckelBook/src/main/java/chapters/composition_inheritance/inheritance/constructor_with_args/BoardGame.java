package chapters.composition_inheritance.inheritance.constructor_with_args;

public class BoardGame extends Game{

    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame(int i)");
    }
}
