package vladproduction.com.eco;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.doAction(2);
        System.out.println();
        Child child = new Child();
        child.doAction();
        child.doAction(2);
        child.doAction("apple");
        child.doActionParent();
    }
}
