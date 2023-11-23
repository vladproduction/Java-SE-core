package vladproduction.com.for_;

public class ListCharacters {
    public static void main(String[] args) {
        for( char c = 0; c < 128; c++)
            if (c != 26 )  // ANSI Очистка экрана
                System.out.println(
                        "value: " + (int)c +
                                " character: " + c);
    }
}
