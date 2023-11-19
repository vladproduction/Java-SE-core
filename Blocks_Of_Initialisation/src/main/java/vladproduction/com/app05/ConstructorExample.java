package vladproduction.com.app02;

public class ConstructorExample {

    private final String userName;
    private final static int [] square = new int[10];

    public ConstructorExample(){
        this ("Anonymous");
    }
    public ConstructorExample(String userName) {
        this.userName = userName;
        for (int i = 0; i < 10; i++) {
            square[i] = i * i;
        }
    }
    public void printSquare(int i) {
        // no error handling - assume 0<=i<limit
        System.out.println("Hello " + userName);
        System.out.println(i + " squared is " + square[i]);
    }
    public static void main(String[] args) {
        new ConstructorExample().printSquare(3);
        new ConstructorExample("Ed").printSquare(5);
    }

}
