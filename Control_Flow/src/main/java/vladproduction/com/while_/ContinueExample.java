package vladproduction.com.while_;

public class ContinueExample {
    public static void main(String[] args) {
        int i = 0;
        while (i++ < 10) {
            if (i == 4 || i == 6 || i == 9) {
                continue;
            }
            System.out.print(i + " "); //1 2 3 5 7 8 10
        }
    }
}
