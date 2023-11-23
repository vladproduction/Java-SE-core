package vladproduction.com.for_;

import java.util.Scanner;

public class ForDemo {
    public static void main(String[] args) {
        ForDemo whileDemo = new ForDemo();
        whileDemo.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int highBorder = scanner.nextInt();
        int indexVariable;
        int s = 0;

        for (indexVariable = 1; indexVariable <= highBorder; indexVariable++) {
            s+=indexVariable; // Добавляем слагаемое в сумму

        }

        System.out.println("Sum numbers from 1 to " + highBorder + ": " + s);
    }
}
