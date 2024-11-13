package vladproduction.com.while_;

public class LabeledContinueLoopTest {
    public static void main(String[] args) {
        int i = 0;
        outer:
        while (i++ < 3) {
            int j = 0;
            while (j++ < 5) {
                if (j == 2) {
                    continue outer;
                }
                System.out.println("i = " + i + "; j = " + j);
            }
        }
    }
    /*i = 1; j = 1
    i = 2; j = 1
    i = 3; j = 1*/
}
