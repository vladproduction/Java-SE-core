package vladproduction.com.app01;

//better idea:
public class SmallSquares2 {

    private static final int LIMIT = 10;
    private static final int [] square = new int[LIMIT];

    static {
        for (int i = 0; i < LIMIT; i++) {
            square[i] = i * i;
        }
    }

    public static int getSquare(int i) {
        return square[i];
    }

    public static void main(String[] args) {
        System.out.println("squared is " +
                getSquare(5));
    }
}