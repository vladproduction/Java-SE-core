package chapters.constructor.overloadingConstructor;

public class Overloading_Tree {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree tree = new Tree(i);
            tree.info();
            tree.info("Overloading_Tree");
        }
        new Tree();
    }
}
