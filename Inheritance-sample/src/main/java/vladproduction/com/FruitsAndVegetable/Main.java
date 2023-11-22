package vladproduction.com.FruitsAndVegetable;

public class Main {
    public static void main(String[] args) {
        Vegetable potato = new Vegetable();
        potato.kind();
        potato.vegetable();
        potato.name("potato");
        potato.form("round");
        System.out.println("------------------------------------");

        Fruit apple = new Fruit();
        apple.kind();
        apple.fruit();
        apple.name("apple");
        apple.form("round");
        apple.taste("sweet");



    }
}
