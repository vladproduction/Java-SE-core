package chapters.control_Instructions.while_and_do_while_loop_statements;

public class Main {
    public static void main(String[] args) {
        int count = 4, i = 1, j = 1, s1 = 0, s2 = 0; // negative also possible but for 'do-while' version
        System.out.println(count);
        //while:
        while (i <= count) {
            s1 += i;
            i++;
        }
        System.out.println(s1);
        //do-while:
        do {
            s2 += j;
            j++;
        }
        while (j <= count);
        System.out.println(s2);
    }
}
