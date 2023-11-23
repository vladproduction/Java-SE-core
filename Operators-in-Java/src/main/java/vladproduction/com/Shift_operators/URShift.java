package Shift_operators;

public class URShift {
    public static void main(String[] args) {
        int i = -1;
        i >>>= 10;
        System.out.println(i);
        long l = -1;
        l >>>= 10;
        System.out.println(l);
        short s = -1;
        s >>>= 10;
        System.out.println(s);
        byte b = -1;
        b >>>= 10;
        System.out.println(b);
        b = -1;
        System.out.println(b>>>10); //не присваивается назат переменной b, а сразу выводится на печать,
                                    // поэтому мы видим правильное поведение
    }
}
