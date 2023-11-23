package vladproduction.com.while_;

import java.util.Scanner;

public class WhileDemo02 {
    public static void main(String[] args) {
        WhileDemo02 whileDemo = new WhileDemo02();
        whileDemo.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int highBorder = scanner.nextInt();
        int s = 0;
        while (highBorder > 0) {
            s += highBorder;
            highBorder--;
        }
        System.out.print("Сумма чисел от 1 до " + highBorder + ": " + s);
    }
}
