package vladproduction.com.while_;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        WhileDemo whileDemo = new WhileDemo();
        whileDemo.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int highBorder = scanner.nextInt();
        int indexVariable = scanner.nextInt();
        int s = 0;
        while (indexVariable <= highBorder) {
            s += indexVariable;
            indexVariable++;
        }
        System.out.println("Sum numbers from 1 to " + highBorder + ": " + s);

    }
}
