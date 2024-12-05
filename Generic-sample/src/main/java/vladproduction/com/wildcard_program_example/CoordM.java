package vladproduction.com.wildcard_program_example;

public class CoordM<T extends Coord2> {
    T space[];

    CoordM(T[] array) {
        space = array;
    }
}
