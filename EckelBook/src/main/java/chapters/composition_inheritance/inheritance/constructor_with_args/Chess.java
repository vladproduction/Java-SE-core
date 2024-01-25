package chapters.composition_inheritance.inheritance.constructor_with_args;

public class Chess extends BoardGame{

    Chess(int i) {
        super(11);
        System.out.println("Chess(int i)");
    }
}
