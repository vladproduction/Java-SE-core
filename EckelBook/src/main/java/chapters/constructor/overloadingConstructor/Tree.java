package chapters.constructor.overloadingConstructor;

public class Tree {
    int height;

    public Tree(int i) {
        print("Creating a new Tree that is "+
                i+" feet tall");
        height = i;
    }

    public Tree() {
        print("Planting a seeds");
        height = 0;
    }

    void info(){
        print("Tree is "+height+" feet tall");

    }

    void info(String s){
        print(s + ": Tree is "+height+" feet tall");

    }

    static  void print(String s){
        System.out.println(s);
    }
}
