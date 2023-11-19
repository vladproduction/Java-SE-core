package vladproduction.com.app02;

public class ConstructorExample2 {

    private final String userName;
    private static final int[] square = new int[10];

    {
        for (int i = 0; i < 10; i++) {
            square[i] = i * i;
        }
    }

    public ConstructorExample2() {
        userName = "Anonymous";
    }

    public ConstructorExample2(String userName) {
        this.userName = userName;
    }

    public void printSquare(int i) {
        // Нет обработки ошибки, предположим,0<=i<limit
        System.out.println("Hello " + userName);
        System.out.println(i + " squared is " + square[i]);
    }

    public static void main(String[] args) {
        new ConstructorExample2().printSquare(3);
        new ConstructorExample2("Ed").printSquare(5);
    }

}
