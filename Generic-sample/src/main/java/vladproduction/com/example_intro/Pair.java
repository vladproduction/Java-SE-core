package vladproduction.com.example_intro;

public class Pair <T1 ,T2>{

    T1 obj1;
    T2 obj2;

    public Pair(T1 obj1, T2 obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T1 getObj1() {
        return obj1;
    }

    public T2 getObj2() {
        return obj2;
    }

    public static void main(String[] args) {
        Pair<Integer, String> worldCup = new Pair<>(2022, "Qatar");
        System.out.println("World Cup "+worldCup.getObj1()+" in "+worldCup.getObj2());
    }
}
