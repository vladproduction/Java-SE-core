package vladproduction.com.app03;

public class AnonymousExample {
    static class AnonymousSquare{
    private static final int[] square = new int[10];

    {
        for (int i = 0; i <10; i++)
            square[i] = i * i;
    }

    String userName;
    int i;

    void print() {
        System.out.println("Hi " + userName + ", " + i
                + " squared is " + square[i] + '.'
        );
    }
}

    static AnonymousSquare createAnonSquare() {
        return new AnonymousSquare() {
            {
                userName = "Ed";
                i = 3;
            }
        };
    }

    public static void main(String[] args) {
        createAnonSquare().print();
    }
}
