package vladproduction.com.app01;

//not good to do so:
public class SmallSquares {

    private static final int LIMIT = 10;
    private static final int [] square = new int[LIMIT];

    public SmallSquares(){
        for (int i = 0; i < LIMIT; i++) {
            square[i] = i * i;
        }
    }

    public static int getSquare(int i) {

        return square[i];
    }
    public static void main(String[] args) {
        new SmallSquares();
        System.out.println("3 squared is " +
                getSquare(3));
    }
}